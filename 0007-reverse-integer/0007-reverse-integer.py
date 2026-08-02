class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        s=1
        if x<0:
            s=-1
            x=x*-1
        n=0
        while x>0:
            r=x%10
            n=n*10+r
            x//=10
        n=n*s
        
        if -2147483647 <= n <= 2147483648:
            return n
        else:
            return 0
        
        