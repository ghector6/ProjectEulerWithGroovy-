class Smallest {
    static long finder(){
        boolean flag = true
        long  res = 0;

        for(long i = 2520; flag; i++){
            if(i % 11!= 0 || i % 12 != 0 ||i % 13 != 0 ||i % 14 != 0 ||i % 15 != 0 ||i % 16 != 0 ||
                i % 17 != 0 ||i % 18 != 0 ||i % 19 != 0 ||i % 20 != 0 )continue
            res = i
            flag = false
        }     

       println res  
    }
}

Smallest.finder().toString()
