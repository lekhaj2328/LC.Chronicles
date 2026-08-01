class Solution:
    def isPalindrome(self, s: str) -> bool:
        str=''
        for i in s:
            if i.isalnum():
                if i.isupper():
                    i=i.lower()
                str=str+i
        return str[::-1] == str
        