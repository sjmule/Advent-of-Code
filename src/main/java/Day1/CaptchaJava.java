package Day1;

import java.io.BufferedReader;
import java.io.FileReader;

public class CaptchaJava {

    public static void main(String args[]) {
        String input = readFile();
        String[] inputList = input.split("");
        for (int  i = 0; i < inputList.length - 1; ++i) {
            if (inputList[i].equals(inputList[i+1])) {

            }
        }
    }

    private static String readFile() {
        try {
            FileReader fileReader = new FileReader(System.getProperty("user.dir") + "/src/main/scala/Day1/input");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            bufferedReader.close();
            return line;
        } catch (Exception e) {
            System.out.println("something went wrong" + e);
        }
        return "";
    }
}
