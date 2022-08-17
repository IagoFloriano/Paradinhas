inverteLista :: [a] -> [a]
inverteLista [] = []
inverteLista (x:xs) = inverteLista xs ++ [x]

removePrimeiro :: [a] -> [a]
removePrimeiro [] = []
removePrimeiro (x:xs) = xs

removeUltimo :: [a] -> [a]
removeUltimo [] = []
removeUltimo [x] = []
removeUltimo (x:xs) = x : removeUltimo xs

somaPares :: Integral a => [a] -> a
somaPares [] = 0
somaPares (x:xs)
  | mod x 2 == 0 = x + somaPares xs
  | otherwise = somaPares xs

somaPosPares :: Integral a => [a] -> a
somaPosPares [] = 0
somaPosPares [x] = 0
somaPosPares (x:y:xs) = y + somaPosPares xs

insere :: Integral a => b -> [b] -> a -> [b]
insere c arr 0 = c : arr
insere c (x:xs) n = x : insere c xs (n-1)

penultimo = last . init

removeDups :: Eq a => [a] -> [a]
removeDups [] = []
removeDups (x:xs) = x : removeDups (dropWhile (==x) xs)

divide ::  Int -> [b] -> ([b],[b])
divide 0 arr = ([], arr)
divide n arr = (first : x, y)
  where
    first = head arr
    (x,y) = divide (n-1) $ tail arr
{-divide n arr
  | n > length(arr) = error "Nao da pra fazer"
  | otherwise = (take n arr, drop n arr)
  -}

intervalo :: Int -> Int -> [b] -> [b]
intervalo i k arr
  | i > k = []
  | k > length(arr) = []
  | otherwise = take (k-1) $ drop i arr

giraEsquerda :: Int -> [b] -> [b]
giraEsquerda n arr = drop n arr ++ take n arr

lista i j = [i..j]
