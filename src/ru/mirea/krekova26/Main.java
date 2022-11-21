package ru.mirea.krekova26;

class Main {
    public static void main(String[] args)
    {
        List<Integer> myList = new List<>();

        myList.add(1);
        myList.add(4);
        myList.add(60);

        for (Integer integer : myList)
            System.out.println(integer);
    }
}
