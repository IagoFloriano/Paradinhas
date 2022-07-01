JC =javac -d bin -cp bin
RUN = java -cp bin
.SUFFIXES:.java .class
MAINFILES = src/Main.java
TORUN = bin/Main.class

PACKAGES = list
LISTSRCS = src/list/Lista.java

main: $(TORUN)
$(TORUN): $(PACKAGES) $(MAINFILE)
	$(JC) $(MAINFILES)

list: $(LISTSRCS)
	$(JC) $(LISTSRCS)

run: 
	$(RUN) Main

clean:
	rm -rf ./bin/*
