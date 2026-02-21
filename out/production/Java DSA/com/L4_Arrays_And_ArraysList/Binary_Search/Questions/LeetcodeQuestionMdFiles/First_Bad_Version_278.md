In this problem,
think it is as array of {false, false, false, true, true}
index->   1 2 3 4 5
**we have to search from the start = 0 to end = n** until **start is greater than end(start > end)**
on each time we will find **mid**
and **if the isBadVersion(mid)** comes **true** then **it means the version ahead of it are also true and first true can
lie before mid so we do reduce end = mid - 1**

**If mid you found is false then it means* we can found first true in the mid to end sample space*
**

1.      start = 1
   				end = 5
   				mid = 1+5/2 = 3
                      {false, true, true, true, true}
         index->   1       2       3       4       5 
   				means it will check 3 and if it found true it will be like  -> end = mid - 1 => 2

2.  			end = 2
   				start = 1
   				mid = 1+2/2 = 1
   				
   				             {false, true}
          index->   1       2    
   				means index of mid 1 is false means s = mid + 1 => 2


3.  			end = 2
   				start = 2
   				mid = 2
   				
   				             {true}
          index->    2    
   				means index of mid 1 is false means s = mid + 1 => 3
   				
   				s > e loops break

# Test Case Example

n = 5
**range {1,5}**
sample space -> {false, false, false, true, true}
index ->     1 2 3 4 5

start = 1
end = 5
mid = (1+5)/2 => 3

sample space -> {false, false, false, true, true}
index ->     1 2 3 4 5

1. check isBadVersion(3)
   if true -> e = m - 1
   else -> s = m + 1
   **ans->** was false and now s = 3+1=> 4

so Start = 4, end =5, mid =(4+5)/2=> 4
sample space -> {true, true}
index ->     4 5

2. check isBadVersion(4)
   if true -> e = m - 1
   else -> s = m + 1
   **ans->** was false and now e = 4-1=> 3

loop breaks as end is smaller than start
and start is now answer

