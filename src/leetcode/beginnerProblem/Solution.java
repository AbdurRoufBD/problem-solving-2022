package leetcode.beginnerProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public int[] runningSum(int[] nums) { 
		//https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4422/
		int[] newArray = new int[nums.length];
		int i = 0;
	     for(int n:nums) {
	    	 int soFarSum = i == 0? 0 : newArray[i-1];
	    	 newArray[i++] = n + soFarSum;
	     }
		return newArray;
	}
	
	public int maximumWealth(int[][] accounts) {
		//https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4423/
        int maxWealth = 0;
        for(int[] eachPersonWealth: accounts) {
        	int totalWealth = 0;
        	for(int wealthInEachBank : eachPersonWealth) {
        		totalWealth += wealthInEachBank;
        	}
        	maxWealth = maxWealth < totalWealth ? totalWealth : maxWealth;
        }
		return maxWealth;
    }
	
	public List<String> fizzBuzz(int n) {
		//https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4424/
	    List<String> listOfStrings = new ArrayList<>();
	    for(int i = 1; i <= n ; i++) {
	    	if(i % ( 3 * 5) == 0) {
	    		listOfStrings.add("FizzBuzz");
	    	} else if(i % (3) == 0) {
	    		listOfStrings.add("Fizz");
	    	} else if(i % (5) == 0) {
	    		listOfStrings.add("Buzz");
	    	} else {
	    		listOfStrings.add("" + i);
	    	}
	    }
	    return listOfStrings;
	}
	
	public int numberOfSteps1(int num) {
       int steps = 0; 
       while(num > 0) {
    	   num = (num % 2 == 0) ? num / 2 : (num - 1) ;
    	   steps++;
       }
       return steps;
    }
	
	public int numberOfSteps(int num) {
		//https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4425/
	       int steps = 0;
	       int x = 1;
	       while(x <= num) {
	    	   steps = ((x & num) == 0) ? steps + 1 : steps + 2;
	    	   x = x << 1;
	       }
	       return steps;
	 }
	
	
	public Map<Character, Integer> characterCount(String str) {
		Map<Character, Integer> chHashMap = new HashMap<>();
		int len = str.length();
		for(int i = 0; i < len; i++) {
			char x = str.charAt(i);
			int val = chHashMap.containsKey(x) ? chHashMap.get(x) : 0;
			val++;
			chHashMap.put(x, val);
		}
		return chHashMap;
	}
	
	public boolean canConstruct(String ransomNote, String magazine) {
		//https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4427/
		Map<Character, Integer> ransomNoteHashMap = characterCount(ransomNote);
		Map<Character, Integer> magazineNoteHashMap = characterCount(magazine);
		
		for(Map.Entry<Character, Integer> entry : ransomNoteHashMap.entrySet()) {
			Character  key = entry.getKey();
			Integer val = entry.getValue();
			
			Integer valueFromMagazine = magazineNoteHashMap.get(key);
			if(val == valueFromMagazine) {
				continue;
			} else {
				return false;
			}
		}
        return true;
    }
	
	public int findMaxConsecutiveOnes(int[] nums) {
		//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
        int max = 0;
        int current = 0;
        int len = nums.length;
        int prevElement = nums[0];
        for(int i = 0; i < len; i++) {
        	int currentElement = nums[i];
        	if(prevElement == currentElement && currentElement == 1) {
        		current++;
        	} else if(prevElement != currentElement) {
        		if(prevElement == 1) { // so current element 0
        			current = 0;
        		} else { // current element 1
        			current++;
        		}
        	}
        	max = max < current ? current : max;
        	prevElement = nums[i];
        }
		
		return max;
    }
	
	
	public int digitCounter(int num) {
		if(num < 0) {
			num = num * (-1);
		}
		
		int counter = 0;
		while(num > 0) {
			num = num / 10;
			counter++;
		}
		return counter;
	}
	public int findNumbers(int[] nums) {
		//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
		int evenDigitNumbers = 0;
		for(int n : nums) {
			int digitCount = digitCounter(n);
			evenDigitNumbers = (digitCount%2 == 0) ? evenDigitNumbers + 1 : evenDigitNumbers;
		}
		
		
		return evenDigitNumbers;
    }
	
	public void duplicateZeros(int[] arr) {
		//https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
		int len = arr.length;
        for(int i = 0; i < len; i++) {
        	if(arr[i] == 0) {
        		for(int j = len - 1; j >= (i+2); j--) {
        			arr[j] = arr[j-1];
        		}
        		if((i+1) < len) {
        			arr[i + 1] = 0;
        		}
                i++;
        	} else {
                continue;
            }
        }
    }
	
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		//https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
        int[] nums = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < m || j < n) {
        	if(i == m && j < n) {
        		nums[k++] = nums2[j];
        		j++;
        	} else if(j == n && i < m) {
        		nums[k++] = nums1[i];
        		i++;
        	} else if(nums1[i] > nums2[j]) {
        		nums[k++] = nums2[j];
        		j++;
        	} else {
        		nums[k++] = nums1[i];
        		i++;
        	}
        }
        
        for(i = 0; i < n + m; i++) {
        	nums1[i] = nums[i];
        }
    } 
	
	public int removeElement(int[] nums, int val) {
		//https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
        int size = nums.length;
        int deletedElements = 0;
        for(int i = 0; i < size; i++) {
        	if(nums[i] == val) {
        		int j = i + 1;
        		for(; j < size; j++) {
        			nums[j-1] = nums[j];
        		}
        		nums[j-1] = -1;
        		i--;
        		deletedElements++;
        	}
        }
		return size - deletedElements;
    }
	
	public int removeDuplicates(int[] nums) {
		//https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
		int size = nums.length;
		int deletedElements = 0;
        for(int i = 1; i < size; i++) {
        	int prevElement = nums[i-1];
        	
        	if(nums[i] == -101) break;
        	else if(nums[i] == prevElement) {
        		int j = i; 
        		for(; j < size; j++) {
        			nums[j-1] = nums[j];
        		}
        		nums[j-1] = -101;
        		deletedElements++;
        		i--;
        	}
        }
		return  size-deletedElements;
    }
	
	 public boolean checkIfExist(int[] arr) {
		 //https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
		 int size = arr.length;
		 for(int i = 0; i < size; i++) {
			 for(int j = 0 ; j < size && j !=i; j++) {
				 if(arr[i] == 2 * arr[j]) return true;
				 else if(arr[j] ==  2 * arr[i]) return true;
			 }
		 }
		 return false;
	 }
	 
	 public boolean validMountainArray(int[] arr) {
		 //https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
		 int mountainCount = 0;
		 int[] slopeArr = new int[arr.length-1];
		 for(int i = 1; i < arr.length; i++) {
			 slopeArr[i-1] = arr[i] - arr[i-1];
		 }
		 for(int i = 1; i < slopeArr.length; i++) {
			 int prevSlop = slopeArr[i-1];
			 int currentSlop = slopeArr[i];
			 if(prevSlop * currentSlop == 0) return false;
			 else if(prevSlop < 0 && currentSlop > 0) return false;
			 else if (prevSlop > 0 && currentSlop < 0) mountainCount++;
		 }
		 return mountainCount == 1;
	 }
	 
	 public int[] replaceElements(int[] arr) {
		 //https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
		 for(int i = 0; i < arr.length; i++) {
			 int max = -1;
			 for(int j = i+1; j < arr.length; j++) {
				 if(arr[j] > max) {
					 max = arr[j];
				 }
			 }
			 arr[i] = max;
		 }
		 return arr;
	 }
	 
	 public int removeDuplicate(int[] nums) {
		 	//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3258/
			int size = nums.length;
			int deletedElements = 0;
	        int i = 0;
	        int j = i + 1;
			while(j < size) {
				int currentStagedElement = nums[i];
				if(currentStagedElement == nums[j] && currentStagedElement != -101) {
					deletedElements++;
					nums[j] = -101;
				} else if (currentStagedElement != nums[j] && nums[j-1] == -101){
					i++;
					nums[i] = nums[j];
					nums[j] = -101;
				}else {
					i++;
				}
				j++;
			}
			return  size - deletedElements;
	    }
	 
	 
}
