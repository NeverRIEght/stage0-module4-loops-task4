package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        boolean goToTheEnd = false;
        if(numberToGoUntil < toBreakWith) {
            System.out.println("iterating till the end");
            goToTheEnd = true;
        }

        for(int i = 1; i <= numberToGoUntil; i++) {
            System.out.println(i);
            if(i == toBreakWith && !goToTheEnd) {
                break;
            }
        }
    }
}
