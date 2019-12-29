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

>git pull origin master --allow-unrelated-histories

>git config --global alias.ca checkout


