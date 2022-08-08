import System.IO

-- ex 1
inverte :: Integer -> Integer
inverte x 
  | x < 10   = x
  | otherwise = (10 ^ casas) * mod x 10 + inverte (div x 10)
  where
  casas = floor ( logBase 10 (fromInteger x))

-- ex 2
somaVetor :: [Integer] -> Integer
somaVetor [] = 0
somaVetor [x] = x
somaVetor (x:xs) = x + somaVetor(xs)

-- ex 3
somatorio :: Integer -> Integer
somatorio 0 = 0
somatorio x = x + somatorio (x-1)

-- ex 4
inverteReais :: [Float] -> [Float]
inverteReais [] = []
inverteReais [x] = [x]
inverteReais (x:xs) = inverteReais xs ++ [x]

-- ex 5
conta :: Integer -> Integer -> Integer
conta _ 0 = 0
conta 0 _ = 0
conta k n
  | mod n 10 == k = conta k (div n 10) + 1
  | otherwise     = conta k (div n 10)

-- ex 6
multipRec :: Integer -> Integer -> Integer
multipRec _ 0 = 0
multipRec 0 _ = 0
multipRec n1 n2 = n1 + (multipRec n1 (n2-1))

-- ex 7
printNaturaisC :: Integer -> String
printNaturaisC 0 = "0"
printNaturaisC n = printNaturaisC (n-1)  ++ "\n" ++ (show n)

-- ex 8
printNaturaisD :: Integer -> String
printNaturaisD 0 = "0"
printNaturaisD n = (show n) ++ "\n" ++ printNaturaisD (n-1)  

-- ex 9
paresAteC :: Integer -> String
paresAteC n
  | n <= 0 = show n
  | otherwise = paresAteC (n-2) ++ "\n" ++ (show n)

-- ex 10
paresAteD :: Integer -> String
paresAteD n
  | n <= 0 = show n
  | otherwise = (show n) ++ "\n" ++ paresAteD (n-2)

-- ex 11
fatDuplo :: Integer -> Integer
fatDuplo n
  | n <= 1 = 1
  | otherwise = n * fatDuplo (n-2)

--ex 12
fatorial :: Integer -> Integer
fatorial n | n <= 1 = 1
fatorial n = n * fatorial (n-1)

superFatorial :: Integer -> Integer
superFatorial n | n <= 1 = 1
superFatorial n = (fatorial n) * superFatorial(n-1)

main = do
  putStrLn "------------------\nComeço do programa\n"
  putStrLn $ show $ superFatorial 4
