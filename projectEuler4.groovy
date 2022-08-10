class Palindrome{
     

    static multiplr(range){
        def multList = []
        for(def i = 1; i <= range; i++){
            for(def f = 1; f <= range; f++){
                multList << i * f
            }                        
        }
        println multList.join(", ").toString()        
    }
    
}

Palindrome.multiplr(10)