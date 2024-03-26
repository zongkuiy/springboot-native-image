#!/bin/bash
# rum_pm.sh jar|native test_case_name

pid_native=`ps -ef|grep native-app|grep -v native-app-0.0.1-SNAPSHOT.jar |grep  -v grep | awk '{print $2}'`
pid_jar=`ps -ef|grep native-app-0.0.1-SNAPSHOT.jar |grep  -v grep | awk '{print $2}'`

if [ -z $pid_native ]; then
	echo "native proccess does not exist"
fi

if [ -z $pid_jar ]; then
        echo "jar proccess does not exist"
fi

if [ "$1" == "jar" ]; then
	python3 pm_collection.py $2  $pid_jar $1
fi

if [ "$1" == "native" ]; then
        python3 pm_collection.py $2 $pid_native $1
fi
