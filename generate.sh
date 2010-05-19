#!/bin/sh

dir=`dirname $0`

java -cp $dir/guiceygenerator.jar com.lowereast.guiceymongo.data.generator.GuiceyDataGenerator $*
