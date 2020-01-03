## Running Springboot Application First Time-----
    1. Add dependency to start the application 
      'org.springframework.boot:spring-boot-starter-web:2.2.2.RELEASE'
    2. To have the Swagger Enabled in application 
      compile "io.springfox:springfox-swagger-ui:2.9.2"
      compile 'io.springfox:springfox-swagger2:2.9.2'
    3. To run the application with H2 and in test mode
         runtimeOnly 'com.h2database:h2'
             testImplementation('org.springframework.boot:spring-boot-starter-test') {
                exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
              }
          testImplementation 'org.junit.jupiter:junit-jupiter-api:5.5.1' ---API needed to run the test, environment config
          testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.5.1' --- to run the tests
          testRuntimeOnly 'org.junit.platform:junit-platform-engine:1.5.1' --- platform to run the tests in 
          testRuntimeOnly 'org.junit.platform:junit-platform-commons:1.5.1'          
          Runs JUNIT related 
            test {
            useJUnitPlatform()
            }
    4. To have @SpringBootTest annotation running
              testImplementation('org.springframework.boot:spring-boot-starter-test') {
                exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
          }
    
## Adding github account to springboot project
  1. Go to VCS
  2. Enable Version Control Integration
    --Select Git
  3. 
    **Adding git plugin to Intellij**
    1. Download the git plugin and keep it in C:\Program Files\Git
    2. Copy the C:\Program Files\Git\bin to the PATH in system environment variable.
    3. Check the git --version in IntelliJ terminal.

## Adding gradle plugin to Intellij
  1. Download the gradle plugin and keep it in C:\Gradle_ _ _
  2. Copy the C:\Gradle_ _ _\bin to the PATH in system environment variable.
  3. Check the gradle --version in IntelliJ terminal.

## GIT CHEATSHEET
  git pull origin master --allow-unrelated-histories
  git config --global alias.ca checkout

## Issues in Installing pcf-dev
1. go to pivotal.io
	- platform --
	-	pcf dev ---
	-		start now ---
	-			cf cli
	-				https://docs.pivotal.io/pcf-dev/install-windows.html
	-				Install the plugin for CF CLI

2. Make sure the path in System environment is set
3. Check the verion of CF CLI in CMD
4. Download the PCF Dev CLI Plugin and unzip it
Issue- Hyper-V is enabled but does not work on windows 10 home
Solution ---
    - Create batch file and put the below contents in it.
    ``
    pushd "%~dp0"
    dir /b %SystemRoot%\servicing\Packages\*Hyper-V*.mum >hyper-v.txt
    for /f %%i in ('findstr /i . hyper-v.txt 2^>nul') do dism /online /norestart /add-package:"%SystemRoot%\servicing\Packages\%%i"
    del hyper-v.txt
    Dism /online /enable-feature /featurename:Microsoft-Hyper-V -All /LimitAccess /ALL
    pause
    ``
    - Run the batch file created above.
    - Make sure you have more than free 8GB RAM available.
    - Error-- Not enough memory in the system to start the virtual machine cfdev with ram size 8192 megabytes. (Virtual machine ID
      CC016C9D-7534-4A90-B272-875C676B9446).