-- Soma numeros pares de uma lista
somaparesR :: [Int] -> Int
somaparesR [] = 0
somaparesR (x:xs) = x * (mod (x + 1) 2) + somapares xs

somapares :: [Int] -> Int
somapares [] = 0
somapares arr = sum [x | x <- arr, mod x 2 == 0]

pertence :: Int -> [Int] -> Bool
pertence _ [] = False
pertence a (x:xs) = or [a == x, pertence a xs]

removemenor :: [Int] -> [Int]
removemenor [] = []
removemenor [_] = []
removemenor (a:xs)
  | a < minimum xs = xs
  | otherwise = a : removemenor xs

-- https://wiki.haskell.org/H-99:_Ninety-Nine_Haskell_Problems
myLast :: [a] -> a
myLast [] = error "No end for empty lists"
myLast [x] = x
myLast (_:xs) = myLast xs

myButLast :: [a] -> a
myButLast [] = error "No end for empty lists"
myButLast [x] = error "No pelast for lists with size 1"
myButLast [x, _] = x
myButLast (_:xs) = myButLast xs

isPalindrome :: Eq a => [a] -> Bool
isPalindrome [] = True
isPalindrome [x] = True
isPalindrome [x, y] = x == y
isPalindrome arr = and [head arr == last arr, isPalindrome $ tail $ init arr]

compress :: Eq a => [a] -> [a]
compress [] = []
compress [x] = [x]
compress (a:xs)
  | a == head xs = compress xs
  | otherwise = a : compress xs

pack :: Eq a => [a] -> [[a]]
pack [] = []
pack (x:xs) = (x : takeWhile (== x) xs) : pack (dropWhile (== x) xs)

encode :: Eq a => [a] -> [(Int, a)]
encode [] = []
encode arr = map (\x -> (length x, head x)) (pack arr)
