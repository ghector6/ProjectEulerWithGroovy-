class Palindrome{
     

    static multiplr(range){
        def multList = []
        def reversedList = []
        for(def i = 1; i <= range; i++){
            for(def f = 1; f <= range; f++){
                multList << i * f
            }                        
        }
        reversedList = multList.join(", ").reverse().split(",").collect{ it as int}
        println multList.intersect(reversedList).max()
        
        //println multList.max()
    }
    
}

Palindrome.multiplr(10)