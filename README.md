# jacoco-sonar-ri
Maven failsafe plugin, Jacoco code coverage and Sonar reference implementation.
It is often tricky to retro-fit Jacoco code coverage into an existing multi-module maven project, 
this reference implementation might make it clearer what is required. 

## Reference 
Further to Arnaud Héritier's post ['Maven, failsafe, sonar and Jacoco are in a boat...'](http://www.aheritier.net/maven-failsafe-sonar-and-jacoco-are-in-a-boat/)

## System
Mac OS X 10.10.1

## Requirements

```$ brew install mysql sonar sonar-runner```

```$ vim /usr/local/Cellar/sonar-runner/2.4/libexec/conf/sonar-runner.properties```

Example [sonar-runner.properties](https://gist.github.com/aeells/96ede82d2b429a7a5d05#file-sonar-runner-properties) file for running MySQL on localhost 

```$ vim /usr/local/Cellar/sonar/5.0/libexec/conf/sonar.properties```

Example [sonar.properties](https://gist.github.com/aeells/6e0c3d3dab551cd20e1a#file-sonar-properties) file for running MySQL on localhost 

```$ sonar console```

# Usage

```$ mvn -B clean verify -pl system-under-test -Pcoverage```

```$ mvn -o sonar:sonar -pl system-under-test```

