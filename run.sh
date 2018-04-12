#!/bin/bash
export PATH=$PATH:/bin/jdk-10/bin

make TestDriver.class
make TestDriver.h
make TestDriver.lib

echo ""
echo "Starting Program"
echo ""

cd bin
java TestDriver