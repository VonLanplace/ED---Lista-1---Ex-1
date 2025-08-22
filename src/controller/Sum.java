package controller;

public class Sum {
    public int calc(int num)
    {
        if (num < 1)
            return 0;
        return num + calc(num - 1);
    }
}
