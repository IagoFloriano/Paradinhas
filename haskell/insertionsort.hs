isort' :: Ord a => [a] -> [a] -> [a]
isort' [] b = b
isort' (a:as) b = isort' as newb
  where
    newb = takeWhile (<= a) b ++ [a] ++ dropWhile (<= a) b

isort :: Ord a => [a] -> [a]
isort a = isort' a []

main :: IO ()
main = putStrLn $ show $ isort [5, 2, 52, 2, 7, 2, 7, 1]
