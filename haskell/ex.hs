
inverte :: Integer -> Integer
inverte x 
  | x < 10   = x
  | otherwise = (10 ^ casas) * mod x 10 + inverte (div x 10)
  where
  casas = floor ( logBase 10 (fromInteger x))

somaVetor :: [Integer] -> Integer
somaVetor [] = 0
somaVetor [x] = x
somaVetor (x:xs) = x + somaVetor(xs)

somatorio :: Integer -> Integer
somatorio 0 = 0
somatorio x = x + somatorio (x-1)

inverteReais :: [Float] -> [Float]
inverteReais [] = []
inverteReais [x] = [x]
inverteReais (x:xs) = inverteReais xs ++ [x]

conta :: Integer -> Integer -> Integer
conta _ 0 = 0
conta 0 _ = 0
conta k n
  | mod n 10 == k = conta k (div n 10) + 1
  | otherwise     = conta k (div n 10)

multipRec :: Integer -> Integer -> Integer
multipRec _ 0 = 0
multipRec 0 _ = 0
multipRec n1 n2 = n1 + (multipRec n1 (n2-1))

printNaturais :: Integer -> String
printNaturais 0 = "0 "
printNaturais n = printNaturais (n-1) ++ (show n) ++ " "
