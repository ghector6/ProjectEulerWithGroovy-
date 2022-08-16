class Palindrome {
    static multplyr(range){
        def res = 0
        List arr = []

        for(def i = 1; i < range; i++){
            for(def j = 1; j < range; j++){
                res = i*j
                def numString = res.toString().reverse()
                println numString.class.name
                
            }

        }
        
    }
}

Palindrome.multplyr(10)