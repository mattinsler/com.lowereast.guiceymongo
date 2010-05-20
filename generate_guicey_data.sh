#!/bin/sh

dir=`dirname $0`

java -cp $dir/guiceydatagenerator-*.jar com.lowereast.guiceymongo.data.generator.GuiceyDataGenerator $*
