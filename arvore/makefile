JC =javac -d bin -cp bin -Xlint
RUN = java -cp bin
.SUFFIXES:.java .class
MAINFILE = src/Main.java
TORUN = bin/Main.class

PACKAGES = arvore

main: $(TORUN)
$(TORUN): $(PACKAGES) $(MAINFILE)
	$(JC) $(MAINFILE)

arvore:
	$(JC) src/arvore/*

run: 
	$(RUN) Main

clean:
	rm -rf ./bin/*
