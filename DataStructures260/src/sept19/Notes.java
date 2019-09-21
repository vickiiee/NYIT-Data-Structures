package sept19;

public class Notes {

	public Notes() {
		/**
		 * pdf: ch2 arrays Logarithms
		 * 
		 * -Comparing inary search times with linear search times 10 items: linear:(n/2)
		 * = 5 times binary search = 4 times 100 items: lin: 50 comparisons bin: 7
		 * comparisons
		 *
		 * binary search: log10(n items) = # of comparisons OR 2^(#of search times);
		 *
		 * -computing runtime
		 *
		 * -asymptotic runtime as the input ize gets larger, the runtime scale is
		 * proportional to n or n^2?
		 *
		 * -big o notation: that tells how an algorithm’s speed is related to the number
		 * of items.
		 *
		 * linear search: (slides 95-97) proportional to n t = n *k/2 OR t = n*k (can
		 * gete rid of constant or lump it with k)
		 *
		 * slide 99: n * (n+1) +1?? big o = n^2 (?)
		 *
		 * binary search: Proportional to log(N) Similarly, a formula relating T and N
		 * for a binary search: T = K * log2(N)
		 *
		 *
		 * TABLE 2.5 Running Times in Big O Notation 
		 * Algorithm 							Running Time in  Big O Notation 
		 * Linear search 						O(N) 
		 * Binary search 						O(log N) 
		 * Insertion in unordered array 		O(1) 
		 * Insertion in ordered array 			O(N) 
		 * Deletion in unordered array 			O(N)
		 * Deletion in ordered array 			O(N)
		 * 
		 * check out graph on slide 103
		 * 	O(1) is excellent,
			O(log N) is good,
			O(N) is fair, and
			O(N2) is poor. 
			
			O(N2) occurs in the bubble sort and also in certain graph algorithms.
		 *
		 *
		 *-slide 104:
		 *	2n(1000) (n/2) = O(n^2) //ignore the constant
		 *	check out pic on phone
		 *
		 *----------------------------------------------------------------------------------
		 *BUBBLE SORT: Compare adjacent elements and swap
		 *https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/
		 *	rlly slow sorting algorithm
		 *	nested loops
		 *	BubbleSort(numbers, numbersSize) {
   				for (i = 0; i < numbersSize - 1; i++) {
      				for (j = 0; j < numbersSize - i - 1; j++) {
         				if (numbers[j] > numbers[j+1]) {
            				temp = numbers[j]
            				numbers[j] = numbers[j + 1]
            				numbers[j + 1] = temp
         				}
      				}
   				}
			}
			
			Here are the rules you’re following:
				1. Compare two players.
				2. If the one on the left is taller, swap them. //the element that you are comparing will be the biggest element. if an element is bigger than the one u currently have, swap them and also have the big element becoem the element u will b comparing other elements to.
				3. Move one position right.
				4. when they reach a person that is taller, ur done.
				5. outside look: then do it again with another elemnt until the same happens and you do it with every element throuhtout lne/araey
				
				follow one player nd place them until they reach someone whos taller,
				then go back to the beginning of the line and do it again with the 2nd element throughout the line
		 *
		 */
	}

}
