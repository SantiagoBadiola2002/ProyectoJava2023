#!/bin/bash

# Cambiar al directorio del servidor web
cd /home/tecnologo/LAB_DE_APLICACIONES/PAP___LAB-main/"Web Server"

#Verificar que Maven este instalado  
mvn -v

# Hacer el clean and build
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
mvn clean package

# Cambiar al directorio target  donde esta el war
cd /home/tecnologo/LAB_DE_APLICACIONES/PAP___LAB-main/"Web Server"/target

# Pega el war en el servidor ApacheTomcat
cp WebServer-1.0-SNAPSHOT.war /home/tecnologo/LAB_DE_APLICACIONES/apache-tomcat-9.0.83/webapps/

#Iniciar Tomcat
/home/tecnologo/LAB_DE_APLICACIONES/apache-tomcat-9.0.83/bin/startup.sh
