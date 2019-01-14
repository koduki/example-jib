# example-jib

Integration sample for Docker and Maven/Netbeans by [jib](https://github.com/GoogleContainerTools/jib).

## How to use

### Build

```bash
% mvn package
[INFO] Scanning for projects...
...
[INFO] --- jib-maven-plugin:1.0.0-rc2:dockerBuild (default) @ example-jib ---
[INFO] 
[INFO] Containerizing application to Docker daemon as example-jib...
[INFO] The base image requires auth. Trying again for openjdk:11-jdk-slim...
[INFO] 
[INFO] Container entrypoint set to [java, -Xmx512m, -Xdebug, -cp, /app/resources:/app/classes:/app/libs/*, cn.orz.pascal.example_jib.Main]
...
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  19.345 s
[INFO] Finished at: 2019-01-13T20:07:28-08:00
[INFO] ------------------------------------------------------------------------
```

### Run

```bash
% mvn docker:start   
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------------< cn.orz.pascal:example-jib >----------------------
[INFO] Building example-jib 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- docker-maven-plugin:0.28.0:start (default-cli) @ example-jib ---
[INFO] DOCKER> [example-jib:latest]: Start container ec75063ae514
ec7506> Linux 4.9.125-linuxkit, OpenJDK 64-Bit Server VM 11.0.1+13-Debian-2bpo91
ec7506> Hello World.
[INFO] DOCKER> [example-jib:latest]: Waited on exit code 0 964 ms
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.142 s
[INFO] Finished at: 2019-01-13T20:09:12-08:00
[INFO] ------------------------------------------------------------------------
```
