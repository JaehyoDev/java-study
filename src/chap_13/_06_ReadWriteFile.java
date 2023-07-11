package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) throws IOException {
        // BufferedReader : 파일에서 내용을 읽어 올 때
        // BufferedWriter : 파일에 내용을 쓸 때

        // 파일 쓰기 (append: true 인 경우 덮어쓰기가 아닌 추가)
//        try(BufferedWriter bw =  new BufferedWriter(new FileWriter("chap_13_06_test.txt", true))) {
//            bw.write("1. 이제 거의 끝이 보입니다.");
//            bw.newLine();
//            bw.write("2. 수고했다.");
//            bw.newLine();
//            bw.write("3. 조금만 더 힘내자.");
//        } catch (IOException e) {
//            throw new RuntimeException(e);

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("chap_13_06_test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
