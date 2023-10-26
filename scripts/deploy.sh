#!/usr/bin/env bash

mvn clean package

echo 'copy files on server'

cp target/drewmet-0.0.1-SNAPSHOT.jar
	/var/www/html

echo 'reboot server'

pgrep java | xargs kill -9
java -jar drewmet-0.0.1-SNAPSHOT.jar > log.txt

echo 'End'
