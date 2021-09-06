import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] strArray = {
                {"1", "2", "3", "4"},
                //{"з"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "0"},
        };

        try {
            System.out.println("Hi");
            exceptionTest(strArray);
            System.out.println("Это сообщение отобразится когда все правильно!");
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Программа работает дальше!");
    }

    public static void exceptionTest(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                System.out.println(arr[i].length);
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                }
            }

        for (String[] strings : arr) {
            for (String string : strings) {
                Scanner sc = new Scanner(String.valueOf(string));
                while (!sc.hasNextInt()) {
                    throw new MyArrayDataException();
                }
            }
        }
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Неверный размер массива!");
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException() {
        super("В ячейке массива лежит что-то не то");
    }
}


