#!/bin/bash
export PATH=$PATH:/bin/jdk-10/bin

BIN="bin"
LIB="bin/lib"
APP="bin/app"

if [ ! -d "$BIN" ]; then
  mkdir $BIN
fi

if [ ! -d "$APP" ]; then
  mkdir $APP
fi

if [ ! -d "$LIB" ]; then
  mkdir $LIB
fi

make program

echo ""
echo "Starting Program"
echo ""

cd bin
java app/TestDriver