class Palindrome{
     

    static multiplr(range){
        List multList = []
        for(def i = 1; i < range; i++){
            for(def f = 1; f < range; f++){
                println multList << i * f
            }
            
        }
    }
}

Palindrome.multiplr(10)