#!/bin/bash
clear
javac -d /tmp/ $1.java
pushd . >> /dev/null
cd /tmp/
java langnotes.$1
echo
popd >> /dev/null