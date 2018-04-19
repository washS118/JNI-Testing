CC = g++
JC = javac
JH = javac -h
BIN = bin
LIB = bin/lib
SRC = src
JNI = /bin/jdk-10/include
JNILIN = /bin/jdk-10/include/linux

program: $(BIN)/app/TestDriver.class $(LIB)/TestDriver.lib

$(BIN)/app/TestDriver.class: $(SRC)/app/TestDriver.java
	$(JC) -d $(BIN) $(SRC)/app/TestDriver.java

$(SRC)/header/app_TestDriver.h: $(SRC)/app/TestDriver.java
	$(JH) $(SRC)/header $(SRC)/app/TestDriver.java
	rm $(SRC)/app/TestDriver.class

$(LIB)/TestDriver.lib: $(SRC)/cpp/TestDriver.cpp $(SRC)/header/app_TestDriver.h
	$(CC) -o $(LIB)/TestDriver.lib -shared -I$(JNI) -I$(JNILIN) $(SRC)/cpp/TestDriver.cpp