data ArvoreBin
  = NodoNull
  | NodoInt Int ArvoreBin ArvoreBin
  deriving (Show)

arvoreBin =
  NodoInt
    4
    (NodoInt 2 NodoNull NodoNull)
    (NodoInt 10 (NodoInt 5 NodoNull NodoNull) (NodoInt 15 NodoNull NodoNull))

passeiaBin :: ArvoreBin -> [Int]
passeiaBin NodoNull = []
passeiaBin (NodoInt a x y) = passeiaBin x ++ [a] ++ passeiaBin y

insere :: ArvoreBin -> Int -> ArvoreBin
insere NodoNull n = NodoInt n NodoNull NodoNull
insere (NodoInt x e d) n
  | n <= x = (NodoInt x (insere e n) d)
  | otherwise = (NodoInt x e (insere d n))
