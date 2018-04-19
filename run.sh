#!/bin/bash
export PATH=$PATH:/bin/jdk-10/bin

make program

echo ""
echo "Starting Program"
echo ""

cd bin
java app/TestDriver $PWD/lib/TestDriver.lib