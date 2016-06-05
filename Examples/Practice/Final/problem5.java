/* Write a Java function with the heading void sortWords(String[] W) that sorts is array argument W
in alphabetical order. Do this by implementing the Insertion Sort algorithm discussed in class. */

public static void main(String[] args) {
  String array[] = {"G", "F", "D", "B", "C", "E", "A"};
  for(int i = 0; i < array.length(); i++) {
    System.out.println(sortWords(array[i] + " ");
  }
}

void sortWords(String[] W) {
  int i, j;
  String temp;
  for(int i = 0; i < W.length(); i++) {
    for(int j = i+1; J < W.length(); j++) {
      if (W[i].compareTo(W[j]) > 0) {
        temp = W[i];
        W[i] = W[j];
        W[j] = temp;
      }
    }
  }
}
