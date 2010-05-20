#!/bin/bash

tmp=$$tmp

mkdir $tmp
cd $tmp
jar xf ../lib/antlr-3.2.jar
jar xf ../lib/jalopy.jar
jar xf ../lib/jopt-simple-3.2.jar
jar xf ../lib/log4j-1.2.15.jar
jar xf ../lib/stringtemplate-3.2.1.jar
jar xf ../target/guiceymongo.jar
rm -rf META-INF
jar cf ../guiceygenerator.jar *
cd ../
rm -rf $tmp