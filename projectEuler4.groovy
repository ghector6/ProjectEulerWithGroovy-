class Palindrome {
    static multplyr(range){
        Integer res = 0
        List arr = []

        for(def i = 1; i < range; i++){
            for(def j = 1; j < range; j++){
                res = i*j
                def numString = res.toString().reverse()
                if(numString as Integer == res){
                    def parsedNumStr = numString as Integer
                    arr << parsedNumStr                    
                }                
            }
        }
        println arr.max()        
    }
}

Palindrome.multplyr(100)
Palindrome.multplyr(1000)