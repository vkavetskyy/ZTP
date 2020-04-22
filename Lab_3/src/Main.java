import java.util.List;

public class Main {

    public static void main(String[] args) {
        Generator generator = new Generator();
        Clone clone = new Clone();
        CopyOne copyOne = new CopyOne();
        CopyTwo copyTwo = new CopyTwo();
        CopyCheck copyCheck = new CopyCheck();

        long start = 0;
        long end = 0;

        List<Uczelnia> list100 = generator.generuj(1, 5, 20);
            start = System.currentTimeMillis();
        List<Uczelnia> list100Clone = clone.clone(list100);
            end = System.currentTimeMillis();
            long clone100time = end - start;
            start = System.currentTimeMillis();
        List<Uczelnia> list100CopyOne = copyOne.copy(list100);
            end = System.currentTimeMillis();
            long copyOne100time = end - start;
            start = System.currentTimeMillis();
        List<Uczelnia> list100CopyTwo = copyTwo.copy(list100);
            end = System.currentTimeMillis();
            long copyTwo100time = end - start;
        System.out.println("Deep copy 100\nClone: " + clone100time + " ms.\nCopyOne: " + copyOne100time + " ms.\nCopyTwo: " + copyTwo100time + " ms.\n");
        copyCheck.run(list100, list100Clone);
        copyCheck.run(list100, list100CopyOne);
        copyCheck.run(list100, list100CopyTwo);

        List<Uczelnia> list1000 = generator.generuj(1, 10, 100);
            start = System.currentTimeMillis();
        List<Uczelnia> list1000Clone = clone.clone(list1000);
            end = System.currentTimeMillis();
            long clone1000time = end - start;
            start = System.currentTimeMillis();
        List<Uczelnia> list1000CopyOne = copyOne.copy(list1000);
            end = System.currentTimeMillis();
            long copyOne1000time = end - start;
            start = System.currentTimeMillis();
        List<Uczelnia> list1000CopyTwo = copyTwo.copy(list1000);
            end = System.currentTimeMillis();
            long copyTwo1000time = end - start;
        System.out.println("Deep copy 1000\nClone: " + clone1000time + " ms.\nCopyOne: " + copyOne1000time + " ms.\nCopyTwo: " + copyTwo1000time + " ms.\n");
        copyCheck.run(list1000, list1000Clone);
        copyCheck.run(list1000, list1000CopyOne);
        copyCheck.run(list1000, list1000CopyTwo);

        List<Uczelnia> list10000 = generator.generuj(10, 10, 100);
            start = System.currentTimeMillis();
        List<Uczelnia> list10000Clone = clone.clone(list10000);
            end = System.currentTimeMillis();
            long clone10000time = end - start;
            start = System.currentTimeMillis();
        List<Uczelnia> list10000CopyOne = copyOne.copy(list10000);
            end = System.currentTimeMillis();
            long copyOne10000time = end - start;
            start = System.currentTimeMillis();
        List<Uczelnia> list10000CopyTwo = copyTwo.copy(list10000);
            end = System.currentTimeMillis();
            long copyTwo10000time = end - start;
        System.out.println("Deep copy 10000\nClone: " + clone10000time + " ms.\nCopyOne: " + copyOne10000time + " ms.\nCopyTwo: " + copyTwo10000time + " ms.\n");
        copyCheck.run(list10000, list10000Clone);
        copyCheck.run(list10000, list10000CopyOne);
        copyCheck.run(list10000, list10000CopyTwo);
    }
}
