n1 = 1
n2 = 2
List tot = [] // Adding a list to save each number from fib sequence 
while (n1 <= 4000000) { 
    // println"$num1 , $num2"
    if (n1 % 2 == 0) {
        tot << n1  //left shift operator 
    }
    (n1, n2) = [n2, n1 + n2]
}

def sum = 0
tot.collect { num -> sum+= num} // aading collect method to get sum by a closure 
println sum




