package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        // String folder = "D:\\JulienKim\\GitHub\\java-study\\src\\chap_13";
        // String folder = "./src/chap_13";
        String folder = "src/chap_13";
        File filesAndFolders = new File(folder);
        System.out.println("Path : " + filesAndFolders.getAbsolutePath());
        for (File file : filesAndFolders.listFiles()) {
            if (file.isFile()) {
                System.out.println("(File) " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(Folder) " + file.getName());
            }

        }
    }
}
