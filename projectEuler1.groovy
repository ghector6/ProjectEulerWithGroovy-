Long totalSum = 0 //Defining a Long type variable to take summatory of numbers 
for(num in 0..<10){ //Looping using the range method 
    if(num % 3 == 0 || num % 5 == 0){ //Conditional for numbers that are adding 
        totalSum += num 
    }    
}
println totalSum