# rmi-example
RMI example application

# Compile
$ mvn clean install

# Binaries 
After to compile, you can get binaries on: <baseDir>/build/lib

Should have the following files: rmi-example-client-1.0.jar, rmi-example-core-1.0.jar, rmi-example-server-1.0.jar, client.policy

# rmiregistry

rmiregistry -J-Djava.rmi.server.useCodebaseOnly=false &

# Start RmiServer

java -Djava.rmi.server.useCodebaseOnly=false -Djava.rmi.server.codebase=file:/full/path/to/rmi-example-core-1.0.jar -cp /path/to/rmi-example-server-1.0.jar:/path/to/rmi-example-core-1.0.jar com.dayler.rmi.RmiServer

# Start RmiClient

java -Djava.rmi.server.useCodebaseOnly=false -Djava.rmi.server.codebase=file:/full/path/to/rmi-example-core-1.0.jar -Djava.security.policy=/path/to/client.policy -cp /path/to/rmi-example-client-1.0.jar:/path/to/rmi-example-core-1.0.jar com.dayler.rmi.RmiClient 10 5

# Questions or Contact

dayler.salazar@icloud.com
