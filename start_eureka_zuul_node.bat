@ECHO OFF

::remove pointer to D if workspace is subdirectory of C
D:

:: VARIABLE DECLARATION
set directoryEurekaServer=D:\Perigea\ProgettoTracker\workspace\EurekaServer
set directoryZuulServer=D:\Perigea\ProgettoTracker\workspace\ZuulServer
set directoryNodeService=D:\Perigea\ProgettoTracker\workspace\NodeService
set directoryWorkspace=D:\Perigea\ProgettoTracker\workspace\

:: ENV LOCAL/DEV/COLL/PROD
set env=local

:: PRINT VARIABLES
echo directoryEurekaServer %directoryEurekaServer% 
echo directoryZuulServer %directoryZuulServer%
echo directoryNodeService %directoryNodeService%
echo directoryWorkspace %directoryWorkspace%
echo env %env%

ECHO Start EUREKA SERVER 1
color 01
CD %directoryEurekaServer%
START "peer1" cmd /T:0A /k mvn clean install spring-boot:run -Drun.profiles=peer1 -Denvironment=%env%
ECHO Started EUREKA SERVER 1!


:: wait 10 seconds
timeout /t 10

ECHO Start EUREKA SERVER 2
color 02
CD %directoryEurekaServer%
START "peer2" cmd /T:0B /k mvn clean install spring-boot:run -Drun.profiles=peer2 -Denvironment=%env%
ECHO Started EUREKA SERVER 2!

:: wait 10 seconds
timeout /t 10

ECHO Start EUREKA SERVER 3
CD %directoryEurekaServer%
START "peer3" cmd /T:0L /k mvn clean install spring-boot:run -Drun.profiles=peer3 -Denvironment=%env%
ECHO Started EUREKA SERVER 3!

:::: wait 10 seconds
::timeout /t 10
::
::ECHO Start ZUUL
::CD %directoryZuulServer%
::START "zuul" cmd /T:0D /k mvn clean install spring-boot:run
::ECHO Start ZUUL!
::
:::: wait 10 seconds
::timeout /t 10
::
::ECHO Start NODE SERVICE
::CD %directoryNodeService%
::START "node service" cmd /T:0E /k mvn clean install spring-boot:run
::ECHO Start NODE SERVICE!

CD %directoryWorkspace%


cmd /K
pause