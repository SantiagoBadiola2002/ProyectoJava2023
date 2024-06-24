#!/bin/bash

#sudo systemctl stop tomcat

sudo ufw disable


# Cambiar al directorio del servidor central
cd /home/tecnologo/LAB_DE_APLICACIONES/PAP___LAB-main/"Central Server"

# Ejecutar el comando 'ant' para hacer el build
ant clean
ant

#Copiar la carpeta images
#cp -r /home/tecnologo/LAB_DE_APLICACIONES/PAP___LAB-main/"Central Server"/src/images /home/tecnologo/LAB_DE_APLICACIONES/PAP___LAB-main/"Central Server"/dist


# Cambiar al directorio dist donde esta el jar
cd /home/tecnologo/LAB_DE_APLICACIONES/PAP___LAB-main/"Central Server"/Lab1


# Ejecutar el archivo JAR con Java JDK 8
/usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java -jar Lab1.jar

