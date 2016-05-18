#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <assert.h>

#define maxStrLength 100

void extract_chars(char* s, char* a, char* d, char* p, char* w);

int main(int argc, char*, argv[]) {
  FILE* in;
  FILE* out;
  char* line;
  char* word;
  char* number;
  char* punctuation;
  char* whitespace;
  int lineNum = 1;
  
  if (argc != 3) {
    printf("Usage: %s <input file> <output file>\n", argv[0]);
    exit(EXIT_SUCCESS);
  in = fopen(argv[1], "r");
  if (in == NULL) {
    printf("Unable to read from file %s\n", argv[1]);
    exit(EXIT_FAILURE);
  }
  
  out = fopen(argv[2], "w");
  if (out == NULL) {
    printf("Unable to write to file %s\n", argv[2]);
    exit(EXIT_FAILURE);
  }
  
  line = calloc(maxStrLength + 1, sizeof(char));
  word = calloc(maxStrLength + 1, sizeof(char));
  number = calloc(maxStrLength + 1, sizeof(char));
  punctuation = calloc(maxStrLength + 1, sizeof(char));
  whitespace = calloc(maxStrLength + 1, sizeof(char));
  assert( line != NULL && word != NULL && number != NULL && punctuation != NULL && whitespace != NULL);
  
  while (fgets(line, maxStrLength, in) != NULL) {
  
