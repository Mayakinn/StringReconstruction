# StringDecandCon
 ```Deconstruct(params)``` Deconstructs a string of characters to only contain characters and their counts in a sequential order as they appear in the original string.
 ```Construct(params)``` Expands a deconstructed string into a full string by repeating characters according to their counts

 # How it works 
 
 ```Deconstruct(params)``` Iterates through the whole string while keeping count of how many characters were in a sequential order. When a new character is found, the previous character and count gets added to the results string. After adding everything to the result string, the iteration continues while counting the newly found characters in a sequential order until a new character is found. The function stops until it reaches the very end of the string. 

 ```Construct(params)``` Iterates through every second character in the deconstructed string while starting from the first. Checks the integer (count) near the character and then repeats the same character in the answer string until it iterates through the whole deconstructed string.

 ### Deconstructed: a4b5c6
 ### Constructed: aaaabbbbbcccccc
 
