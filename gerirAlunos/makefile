JC =javac -d bin -cp bin
RUN = java -cp bin
.SUFFIXES:.java .class
MAINFILES = src/Main.java src/Arquivo.java src/ManterAluno.java src/Menu.java
TORUN = bin/Main.class

PACKAGES = gente

main: $(TORUN)
$(TORUN): $(PACKAGES) $(MAINFILE)
	$(JC) $(MAINFILES)

gente:
	$(JC) src/gente/*

run: 
	$(RUN) Main

clean:
	rm -rf ./bin/*
