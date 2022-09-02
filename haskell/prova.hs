-- Questao 1
fat :: Integral a => a -> a
fat n
  | n <= 1 = 1
  | otherwise = n * fat (n-1)

superfat :: Integral a => a -> a
superfat n
  | n <= 1 = 1
  | otherwise = fat n * superfat (n-1)

-- Questao 3
data ArvB = NodoNull | NodoInt Int [Int] [ArvB]

-- Questao 4
myTake :: Int -> [a] -> [a]
myTake _ [] = []
myTake 0 _ = []
myTake n (x:xs) = x : myTake (n-1) xs

myDrop :: Int -> [a] -> [a]
myDrop _ [] = []
myDrop 0 arr = arr
myDrop n (x:xs) = myDrop (n-1) xs

rotaciona :: [a] -> Int -> [a]
rotaciona arr n = drop n arr ++ take n arr

-- Questao 5
mapeamento :: (a -> a -> a) -> [a] -> a -> [a]
mapeamento _ [] _ = []
mapeamento f (x:xs) n = f x n : mapeamento f xs n

f :: Num a => a -> a -> a
f n x = n * x

-- Questao 6

type Nome = String
type Titulo = String
type Sexo = Char
type Idade = Int
type Pessoa = (Nome, Titulo, Sexo, Idade)

contaDras :: [Pessoa] -> Integer
contaDras [] = 0
contaDras ((_,"doutor", 'f',_):xs) = 1 + contaDras xs
contaDras (x:xs) = contaDras xs

listaTuplas :: [Pessoa]
listaTuplas = [("joao", "mestre", 'm', 35),
               ("jonas", "doutor", 'm', 37),
               ("joice", "mestre", 'f', 30),
               ("janete", "doutor", 'f', 38),
               ("jocileide", "doutor", 'f', 50)]
