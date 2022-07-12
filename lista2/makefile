JC =javac -d bin -cp bin -Xlint
RUN = java -cp bin
.SUFFIXES:.java .class
MAINFILE = src/Main.java src/Arquivo.java src/CadastraAluno.java
TORUN = bin/Main.class

PACKAGES = gente list

main: $(TORUN)
$(TORUN): $(PACKAGES) $(MAINFILE)
	$(JC) $(MAINFILE)

gente:
	$(JC) src/gente/*

list:
	$(JC) src/list/*

run: 
	$(RUN) Main

clean:
	rm -rf ./bin/*
