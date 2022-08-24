data ArvoreBin
  = NodoNull
  | NodoInt Int ArvoreBin ArvoreBin
  deriving (Show)

arvoreBin =
  NodoInt
    4
    (NodoInt 2 NodoNull (NodoInt 3 NodoNull NodoNull))
    (NodoInt 10 (NodoInt 5 NodoNull NodoNull) (NodoInt 15 NodoNull NodoNull))

passeiaBin :: ArvoreBin -> [Int]
passeiaBin NodoNull = []
passeiaBin (NodoInt a x y) = passeiaBin x ++ [a] ++ passeiaBin y

insere :: ArvoreBin -> Int -> ArvoreBin
insere NodoNull n = NodoInt n NodoNull NodoNull
insere (NodoInt x e d) n
  | n <= x = (NodoInt x (insere e n) d)
  | otherwise = (NodoInt x e (insere d n))

rotD :: ArvoreBin -> ArvoreBin
rotD NodoNull = NodoNull
rotD (NodoInt x e d) = (NodoInt n ee (NodoInt x ed d))
  where
    (NodoInt n ee ed) = e

rotE :: ArvoreBin -> ArvoreBin
rotE NodoNull = NodoNull
rotE (NodoInt x e d) = (NodoInt n (NodoInt x e de) dd)
  where
    (NodoInt n de dd) = d
