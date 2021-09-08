public class Main {
    public static void main(String[] args) {
        String[][] strArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "0"},
        };

        String[][] strArray1 = {
                {"99", "98", "0", "0"},
                {"5", "6", "7", ""},
                {"9", "10", "11", "12"},
                {"13", "14", "0", "0"},
        };
        String[][] strArray2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "0"},
        };

        try {
            exceptionTest(strArray);
            exceptionTest(strArray1);
            exceptionTest(strArray2);
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
        for (String[] value : arr) {
            if (value.length != 4) {
                throw new MyArraySizeException();
            }
        }
        System.out.println("Массив 4х4!");
        int sum = 0;
        int num;
        for (String[] strings : arr) {
            for (String string : strings) {
                try {
                    num = Integer.parseInt(string);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
//                char[] charArr = string.toCharArray();
//                for (char ch : charArr) {
//                    if (!Character.isDigit(ch))
//                        throw new MyArrayDataException();
//                }
//                num = Integer.parseInt(string);
                sum += num;
            }
        }
        System.out.println("Сумма элементов = " + sum);
        System.out.println("*****");
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


