#------------------------------------------------------------------------------
#   Makefile for BST Dictionary
#------------------------------------------------------------------------------

# Variables
JARFILE    = Dictionary
MAINCLASS  = Dictionary
SOURCES    = Dictionary.java DictionaryInterface.java DictionaryClient.java\
             DuplicateKeyException.java
CLASSES    = Dictionary.class DictionaryInterface.class DictionaryClient.class Dictionary\$$Node.class\
             DuplicateKeyException.class

# Build Targets
all: $(JARFILE)

$(JARFILE): $(CLASSES)
   echo Main-class: $(MAINCLASS) > Manifest
   jar cvfm $(JARFILE) Manifest $(CLASSES)
   rm Manifest
   chmod +x $(JARFILE)

$(CLASSES): $(SOURCES)
   javac -Xlint $(SOURCES)  

clean:
   rm -f $(CLASSES) $(JARFILE)
