# README #

StMungo is a tool that translates Scribble(http://www.scribble.org) local protocols into typestate specifications in Mungo(http://www.dcs.gla.ac.uk/research/mungo/). 
It also generates a Java API containing methods corresponding to the messages exchanged with all other participants in the multiparty protocol. 


* Version 1.1

### To set up StMungo: ###

* Download the code:    git clone https://username@bitbucket.org/abcd-glasgow/stmungo.git
* Build the project:    ant 
* Build the jar:        ant jar
* Or simply use the jar 
* Run the translator:   

java Translate [FILENAME]
or:
java -jar stmungo.jar [FILENAME]
