# LeanFT-Autotest

### LeanFT engine
Run _**UFT Developer**_ engine before test by command line:
`leanft start --port=5095`

### Depandencies
For install dependency `com.hp.lft:sdk` to local repository **_.m2_** use `mvn` commands:
```
mvn install:install-file -Dfile="com.hp.lft.common.jar" -DgroupId="com.hp.lft" -DartifactId="common" -Dversion="14.53.0" -Dpackaging="jar" -DgeneratePom=true
mvn install:install-file -Dfile="com.hp.lft.sdk-standalone.jar" -DgroupId="com.hp.lft" -DartifactId="sdk" -Dversion="14.53.0" -Dpackaging="jar" -DgeneratePom=true
mvn install:install-file -Dfile="com.hp.lft.report.jar" -DgroupId="com.hp.lft" -DartifactId="report" -Dversion="14.53.0" -Dpackaging="jar" -DgeneratePom=true
mvn install:install-file -Dfile="com.hp.lft.reportbuilder-standalone.jar" -DgroupId="com.hp.lft" -DartifactId="reportbuilder" -Dversion="14.53.0" -Dpackaging="jar" -DgeneratePom=true
mvn install:install-file -Dfile="com.hp.lft.cucumberv1.jar" -DgroupId="com.hp.lft" -DartifactId="cucumberv1" -Dversion="14.53.0" -Dpackaging="jar" -DgeneratePom=true
mvn install:install-file -Dfile="com.hp.lft.cucumberv4.jar" -DgroupId="com.hp.lft" -DartifactId="cucumberv4" -Dversion="14.53.0" -Dpackaging="jar" -DgeneratePom=true
mvn install:install-file -Dfile="com.hp.lft.unittesting.jar" -DgroupId="com.hp.lft" -DartifactId="unittesting" -Dversion="14.53.0" -Dpackaging="jar" -DgeneratePom=true
mvn install:install-file -Dfile="com.hp.lft.verifications.jar" -DgroupId="com.hp.lft" -DartifactId="verifications" -Dversion="14.53.0" -Dpackaging="jar" -DgeneratePom=true
mvn install:install-file -Dfile="com.hp.lft.sdk-javadoc.jar" -DgroupId="com.hp.lft" -DartifactId="javadoc" -Dversion="14.53.0" -Dpackaging="jar" -DgeneratePom=true
```

Above **_jar_** files you can find in directory _".\Micro Focus\Unified Functional Testing\SDK\Java"_ after installing UFT Developer