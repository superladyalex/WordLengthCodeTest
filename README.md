# Word Length Project

### Setup

##### Java 8
Can be downloaded/installed either though the link below our if you use homebrew through the command below
 - https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
 - using brew: brew cask install adoptopenjdk/openjdk/adoptopenjdk8
 
##### Maven
 using brew:  brew install maven
 else: http://maven.apache.org/install.html
 

##### IDE
I'm using IntelliJ which can be downloaded through this link but any IDE (or none) could theoretically be used.
- InteliJ CE https://www.jetbrains.com/idea/download/
 
 

### Assumptions/Notes/Gotcha's
1) Added secondary sort to be alphabetical 
  Note: There is an additional important note that capital letters sort before lowercase letters
2) Removed non-alphanumeric chars so those are not counted in word length. Note this while works nicely for a sentence does pose problems for something like an email address within a sentence. 
3) Given a sentence like `the .` the shortest character will be ` `. There is an `@Ignore` test relating to this showing this currently unexpected result.


### Running
For both methods you will need both Java installed and Maven installed. (described above)

#### IDE
if you choose to use IntelliJ (link above) or any similar IDE you can open WordLengthTest and you can click 'play' next to any test.
Results will print in the window below

#### Command Line
1) `cd` into the repo
2) run `mvn test` and tests should print out
