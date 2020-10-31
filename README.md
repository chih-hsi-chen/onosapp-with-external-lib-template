# onosapp-with-external-lib-template

## prerequisite

* ONOS App
* Maven

## How to run it

1. Enter `sshclient` and run `mvn install:install-file -Dfile=target/sshclient-1.0.0.jar -DgroupId=project.dlink -DartifactId=sshclient -Dversion=1.0.0 -Dpackaging=jar -DgeneratePom=true`

2. You will see the jar file of library in `~/.m2/repository/project/dlink/sshclient/1.0.0`

3. Enter test-for-local and run `mci -DskipTests`

4. Run a ONOS instance, install test-for-local and activate it on ONOS

5. If you see `Dio says: Za Warudo!!!`, it means it works

6. Just write your external library and install it into your ONOS App

## Some Notes

* For including external library, you must write two extra files: `app.xml` and `features.xml`. `app.xml` is for including the library in installation phase and `features.xml` is for including features of the library in runtime.

* `mvn install:install-file` will store the compiled file (e.g. jar) into `~/.m2/repository`, so that you can access to this library locally without publishing it to Maven offical repo.