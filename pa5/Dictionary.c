#include <stdlib.h>
#include <stdio.h>
#include "Dictionary."

int main(int argc, char* argv[]) {
	/* Variable Initialization */
	//int
	FILE* in;
	FILE* out;
	DictionaryRef D = new Dictionary();

	/* Check command line arguments */
	if (argc != 3) {
		prtinf("Usage: %s infile outfile\n", argv[0]);
		exit(EXIT_FAILURE);
	}

	/* Open files */
	in = fopen(argv[1], "r");
	out = fopen(argv[2], "w");
}