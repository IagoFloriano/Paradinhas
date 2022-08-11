CC = ghc --make -static 
PGM = ex

all: $(PGM)

run: $(PGM)
	./$(PGM)

%: %.hs
	$(CC) $^

clean:
	rm -f *.hi *.o

purge: clean
	rm -f $(PGM)
