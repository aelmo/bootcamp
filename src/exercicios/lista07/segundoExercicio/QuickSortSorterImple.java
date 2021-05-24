package exercicios.lista07.segundoExercicio;

public class QuickSortSorterImple<T extends Comparable<? super T>> {
    public static void main(String[] args)
    {
        // example using Strings
        String[]                     arrayOfStrings = {"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda", "Blair", "Ernestine", "Chara", "Kareen", "Monty", "Rene", "Cami", "Winifred", "Tara", "Demetrice", "Azucena"};
        QuickSortSorterImple<String> stringSorter   = new QuickSortSorterImple<>();
        stringSorter.quicksort(arrayOfStrings, 0, arrayOfStrings.length - 1);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));

        // example using Doubles
        Double[]                     arrayOfDoubles = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};
        QuickSortSorterImple<Double> doubleSorter   = new QuickSortSorterImple<>();
        doubleSorter.quicksort(arrayOfDoubles, 0, arrayOfDoubles.length - 1);
        System.out.println(java.util.Arrays.toString(arrayOfDoubles));
    }

    private void quicksort(T[] array, int startIndex, int endIndex)
    {
        // verify that the start and end index have not overlapped
        if (startIndex < endIndex)
        {
            // calculate the pivotIndex
            int pivotIndex = partition(array, startIndex, endIndex);
            // sort the left sub-array
            quicksort(array, startIndex, pivotIndex);
            // sort the right sub-array
            quicksort(array, pivotIndex + 1, endIndex);
        }
    }

    private int partition(T[] array, int startIndex, int endIndex)
    {
        int pivotIndex = (startIndex + endIndex) / 2;
        T pivotValue = array[pivotIndex];
        startIndex--;
        endIndex++;

        while (true)
        {
            // start at the FIRST index of the sub-array and increment
            // FORWARD until we find a value that is > pivotValue
            do startIndex++; while (array[startIndex].compareTo(pivotValue) < 0) ;

            // start at the LAST index of the sub-array and increment
            // BACKWARD until we find a value that is < pivotValue
            do endIndex--; while (array[endIndex].compareTo(pivotValue) > 0) ;

            if (startIndex >= endIndex) return endIndex;

            // swap values at the startIndex and endIndex
            T temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
    }
}