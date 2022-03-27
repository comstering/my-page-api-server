#!/bin/sh

exec java -Djava.security.egd=file:/dev/./urandom -jar /my-page-api-server.jar

mkdir -p /app/data
mkdir -p /app/logs
