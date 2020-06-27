package my_project;


import java.util.Random;

public class Main {

   private static int rSize = 4;
   private static int cSize = 4;

    public static int getrSize() {
        return rSize;
    }

    public static int getcSize() {
        return cSize;
    }

    public static void main(String[] args) {

          int sum = 0;

//        DayOfWeek sunday = DayOfWeek.SUNDAY;
//        System.out.println(sunday.getWorkingHours());
//        System.out.println(sunday.ordinal());
//
//        String[][] str = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
//        getArrExeption(str);
//        private static void MyAgetArrExeption (String[][]str){
//
//        }
//
//        public static void getArrExeption (String[][]arr) throws MyArraySizeException {
//            String[][] arrS = new String[4][4];
//            if (arr.length != arrS.length) throw new MyArraySizeException("Размер массива должен быть = 4x4!", arr);
//            int[][] arrInt = new int[4][4];
//
//            for (int i = 0; i < arr.length; i++)
//                for (int j = 0; j < arr.length; j++) {
//                    arrInt[i][j] = Integer.parseInt(arr[i][j]);
//                    System.out.println(arrInt[i][j]);
//                }
//         }
        Random random = new Random();
        String[][] arr = new String[4][4];

        for (int i = 0; i < rSize; i++) {
            for (int j = 0; j < cSize; j++) {
                arr[i][j] = String.valueOf(random.nextInt(10));
            }
        }

        arr[2][2] = "12";

        try {
            sum = sumArray(arr);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


        System.out.println("Задания 1,2,3.");
        System.out.println(sum);
        System.out.println();

        System.out.println("Задание 4.");
        DayOfWeek x = DayOfWeek.TUESDAY;
        System.out.println(x.getWorkingHours());


    }
        public static int sumArray (String [][] arr)  {
            int sum = 0;
            if (arr.length != rSize) throw new MyArraySizeException();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != cSize) throw new MyArraySizeException();
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        sum += Integer.parseInt(arr [i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
            return sum;
        }



      }
