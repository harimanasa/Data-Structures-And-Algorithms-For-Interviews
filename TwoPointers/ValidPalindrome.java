class Solution {
    public boolean isPalindrome(String s) {

        //Using two pointers logic
        for (int left = 0, right = s.length()-1; left<=right; left++, right--){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
        }

        return true;
    }
}

/* Questions to ask:
* 1. Is null a valid string?
* 2. Is empty string too a palindrome?
* 3. Does it have case sensitivity i.e., small letters and capital letters
* 4. Does it have only alphabets or other characters too? If yes, what to do with them?
* 5. Is there any limit to string.len i.e., int or long?
* */


/* Important points to note:
*
* 1. When declaring two variables in for loop's init phrase, we can only declare if they're of the same type.
* Example: for (int left = 0, right = 10; ; ){} --> valid
*
* but we cannot give, for (int left = 0, float f = 0.0; ; ){} --> invalid, compiler error
*
* 2. Whenever using while/for and conditions like L<R (which we want to be checked through out the loop,
* we should always keep giving it in all of the conditions inside too, most of the time.
* It might depend on the problem too, so use common sense.
*
* 3. Important functions to note:
*
* a) To check if a character is a digit or a letter, Character.isDigitOrLetter(ch)
* b) To check the length of the string, s.length()
* c) To lowercase a character, Character.toLowerCase(ch)
*
* */
