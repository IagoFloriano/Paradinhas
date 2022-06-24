JC =javac -d bin -cp bin
RUN = java -cp bin
.SUFFIXES:.java .class
MAINFILE = src/Main.java
TORUN = bin/Main.class

PACKAGES = gente

main: $(TORUN)
$(TORUN): $(PACKAGES) $(MAINFILE)
	$(JC) $(MAINFILE)

gente:
	$(JC) src/gente/*

run: 
	$(RUN) Main

clean:
	rm -rf ./bin/*
