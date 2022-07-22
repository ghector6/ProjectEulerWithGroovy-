Long totalSum = 0
def range = (0..10)
for(num in range){
    if(num % 3 == 0 || num % 5 == 0){
        totalSum += num 
    }
    
}

println totalSum