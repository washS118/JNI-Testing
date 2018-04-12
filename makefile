CC = g++
JC = export PATH=$PATH:/bin/jdk-10/bin;javac
JH = export PATH=$PATH:/bin/jdk-10/bin;javac -h
BIN = bin
SRC = src
JNI = /bin/jdk-10/include
JNILIN = /bin/jdk-10/include/linux

TestDriver.class: $(SRC)/TestDriver.java
	$(JC) -d $(BIN) $(SRC)/TestDriver.java

TestDriver.h: $(SRC)/TestDriver.java
	$(JH) $(SRC) $(SRC)/TestDriver.java
	rm TestDriver.class

TestDriver.lib: $(SRC)/TestDriver.cpp
	$(CC) -o $(BIN)/TestDriver.lib -shared -I$(JNI) -I$(JNILIN) $(SRC)/TestDriver.cpp