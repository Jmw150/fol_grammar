LIB_ANTLR := lib/antlr-4.8-complete.jar
ANTLR_SCRIPT := MicroC.g4
SRC_DIRS := src/ast/*.java src/ast/visitor/*.java src/compiler/*.java src/assembly/*.java src/assembly/instructions/*.java

all: compiler

compiler:
	rm -rf build
	mkdir build
	# run antlr on g4 file
	java -cp $(LIB_ANTLR) org.antlr.v4.Tool -o build/compiler $(ANTLR_SCRIPT)
	# compile semantic actions onto antlr made parser
	javac -cp $(LIB_ANTLR) -d classes $(SRC_DIRS) build/compiler/*.java

clean:
	rm -rf classes build
