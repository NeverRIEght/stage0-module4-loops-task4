package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        boolean testsStatus = true;
        if(numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
            testsStatus = false;
        }
        if(lastInRow < 0) {
            System.out.println("last number in row is negative");
            testsStatus = false;
        }

        if(testsStatus) {
            int skippedSum = 0;
            int countedSum = 0;
            for(int i = 1; i <= lastInRow; i++) {
                if(numberToSkip == lastInRow) {
                    skippedSum += i;
                    continue;
                }
                if(i == numberToSkip) {
                    skippedSum += i;
                } else {
                    countedSum += i;
                }
            }
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + countedSum);
        }
    }
}
