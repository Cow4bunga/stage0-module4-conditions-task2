package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int max=first;
        if(second>first)
            max=second;
        System.out.println(max);
    }
}
