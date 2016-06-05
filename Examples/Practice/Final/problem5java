/* Write a Java function with the heading void sortWords(String[] W) that sorts is array argument W
in alphabetical order. Do this by implementing the Insertion Sort algorithm discussed in class. */

void sortWords(String[] W) {
  int i, j;
  String temp;
  for(j=1; j<W.length(); j++) {
    temp = w[j];
    i = j-1;
    while(i >= 0 && temp.compareTo(w[i]) < 0) {
      w[i+1] = w[i];
      i--;
    }
    w[i+1] = temp;
  }
}
