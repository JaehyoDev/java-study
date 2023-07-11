package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("chap_13_06_test.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(file.getName() + " 파일 삭제 성공");
            } else {
                System.out.println(file.getName() + " 파일 삭제 실패");
            }
        }

        // 하위에 폴더나 파일이 있는 경우 삭제 불가
        File folder = new File("A");
        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println(folder.getAbsolutePath() + " 폴더 삭제 성공");
            } else {
                System.out.println(folder.getAbsolutePath() + " 폴더 삭제 실패");
            }
        }

        System.out.println("--------------------");

        // 하위에 폴더나 파일이 있어도 삭제 가능하게 함수 만들기
        if (deleteFolder(folder)) {
            System.out.println(folder.getAbsolutePath() + " 폴더 삭제 성공");
        } else {
            System.out.println(folder.getAbsolutePath() + " 폴더 삭제 실패");
        }
    }

    // deleteFolder(A)
    //      deleteFolder(B)
    //          deleteFolder(C)
    //          C.delete() 삭제
    //      B.delete() 삭제
    // A.delete() 삭제

    public static boolean deleteFolder(File folder) {
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                System.out.println("재귀 함수 호출 : delete " + file);
                deleteFolder(file);
            }
        }
        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
        return folder.delete();
    }
}
