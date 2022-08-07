class PrimeFactor {
    static getPrimeFactors(BigInteger range){
        BigInteger primeNum = 2
        while(range!=1){
            if(range % primeNum == 0){
                range /= primeNum
            }else{
                primeNum++
            }
        }
        println primeNum
    }
}

PrimeFactor.getPrimeFactors(600851475143)