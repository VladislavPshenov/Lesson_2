package my_project;

public class MyArrayDataException extends RuntimeException {
    int a;
    int b;

    public MyArrayDataException (int a, int b)
    {
        super ("В ячейке " + a + " " + b + " неверные данные!");
        this.a = a;
        this.b = b;
    }
}
