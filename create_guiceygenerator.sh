#!/bin/bash

tmp=$$tmp

mkdir $tmp
cd $tmp
jar xf ../lib/aopalliance.jar
jar xf ../lib/guice-2.0.jar
jar xf ../lib/antlr-3.2.jar
jar xf ../lib/jalopy.jar
jar xf ../lib/jopt-simple-3.2.jar
jar xf ../lib/log4j-1.2.15.jar
jar xf ../lib/stringtemplate-3.2.1.jar
jar xf ../target/guiceymongo-0.2.jar
rm -rf META-INF
jar cf ../guiceygenerator.jar *
cd ../
rm -rf $tmp
