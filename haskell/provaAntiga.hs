-- Questao 1
pertence :: Eq a => a -> [a] -> Bool
pertence _ [] = False
pertence y (x:xs)
  | x == y = True
  | otherwise = False || pertence y xs

tem_comuns :: Eq a => [a] -> [a] -> Bool
tem_comuns [] _ = False
tem_comuns _ [] = False
tem_comuns (x:xs) y = pertence x y || tem_comuns xs y

-- Questao 2
fatduplo :: Integer -> Integer
fatduplo x
  | (mod x 2) == 0 = error "Função fatduplo so aceita numeros ímpares"
  | x == 1 = 1
  | otherwise = x * fatduplo (x - 2)

-- Questao 3
binario :: Integer -> String
binario x
  | x < 2 = show thisdig
  | otherwise = binario (div x 2) ++ show thisdig
  where
    thisdig = mod x 2

-- Questao 4 (usa função pertence da questao 1)
eprimo :: Integer -> Bool
eprimo 2 = True
eprimo x
  | (x <= 1) || (pertence 0 $ map (\y -> mod x y) [2 .. (x - 1)]) = False
  | otherwise = True

achatupla :: Integer -> Integer -> (Integer, Integer)
achatupla _ 1 = error "Não achou primos que completam goldbach"
achatupla x y
  | eprimo y && eprimo (x - y) = (x - y, y)
  | otherwise = achatupla x (y - 1)

goldbach :: Integer -> (Integer, Integer)
goldbach x
  | x <= 2 || mod x 2 == 1 = error "Goldbach so funciona para pares maiores e 2"
  | otherwise = achatupla x x

-- Questao 5
mapeamento :: (a -> a -> b) -> [a] -> a -> [b]
mapeamento _ [] _ = []
mapeamento f (y:ys) x = f y x : mapeamento f ys x

mult :: Integer -> Integer -> Integer
mult y x = y * x

-- Questao 6
-- (to assumindo q a entrada é um vetor de pessoa)
--            (Nome, Graduação, Sexo, Idade)
type Pessoa = (String, String, Char, Integer)

fdocs :: [Pessoa] -> Integer
fdocs [] = 0
fdocs ((_, "doutor", 'f', _):xs) = 1 + fdocs xs
fdocs (x:xs) = fdocs xs

pessoas =
  [ ("joao", "mestre", 'm', 35)
  , ("jonas", "doutor", 'm', 37)
  , ("joice", "mestre", 'f', 30)
  , ("janete", "doutor", 'f', 38)
  , ("jocileide", "doutor", 'f', 50)
  ]

main :: IO ()
main = return ()
