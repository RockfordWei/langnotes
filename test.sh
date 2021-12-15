#!/bin/bash
clear
echo "python"
python3 $1.py
echo "java"
javac -d /tmp/ $1.java
pushd . >> /dev/null
cd /tmp/
java langnotes.$1
echo
popd >> /dev/null