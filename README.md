# SummleSolve
The SummleSolve program aims to solve any number combination given by summle.net.
summle.net is a new game based on wordle that gives 6 numbers, 4 operators, and one final answer.
The object of the game is to use what is provided along with the answers found with the provided numbers and operators to get the final answer

![Alt Text](https://summle.net/images/example1.gif)

## Algorithm
The Algorithm is currently being developed. So far the goal is to develop a brute force method where the program just tests every possibility, then find ways to get smaller numbers to call brute force on that will result in a better runtime. Here is the algorithm so far as commented in the code:
```
// Implement SummleSolver Algorithm:
// Start with the final answer and then add and subtract the numbers going from smallest to largest
// For each sum and difference, see if the numbers are divisible by the rest of the numbers
// if there is a number that is divisible, divide it and get the quotient and repeat the process.
// if the process cannot go on anymore, use brute force
```

## TODO
* Code in brute force algorithm and test
