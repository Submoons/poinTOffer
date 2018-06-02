**题目:**  
请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
**优化:**
我们可以考虑先遍历一遍字符串,计数空格的数目,我们知道了空格的数目，其实就是知道了替换后字符串的长度，那么只需要进行一次替换就可以了。因为我们的工作变为遍历一遍字符串，统计字符出现的数目,计算替换后的字符串长度，再遍历一遍字符串，完成替换。

**牛客网讨论:**

    //一、结合正则表达式使用replaceAll()
    public class Solution{
        public String replaceSpace(StringBuffer str){
            return str.toString().replaceAll("\\s", "%20");
        }
    }

    /**
        二、不考虑现有的replace等方法,从前往后替换,后面的字符要不断往后移动,要多次移动,效率低下。从后往前,先计算需要多少空间,然后从后往前移动,则每个字符只为移动一次,这样效率高点。
    **/
    public class Solution{
        public String replaceSpace(StringBuffer str){
            int spaceNum = 0; //计算空格数
            for(int i=0; i<str.length; i++){
                if(str.charAt(i) == ' '){
                    spaceNum++;
                }
            }
            int oldIndex = str.length()-1; //替换前str的下标
            int newLength = str.length + spaceNum * 2; //空格转换成%20后的长度
            int newIndex = newLength-1; //替换后的下标
            str.setLength(newIndex); //使str长度更新,防止下标越界
            for(; oldIndex >= 0 && oldIndex < newLength; --oldIndex){
                if(str.charAt(oldIndex) == ' '){
                    str.setCharAt(newIndex--, '0');
                    str.setCharAt(newIndex--, '2');
                    str.setCharAt(newIndex--, '%');
                }else{
                    str.setCharAt(newIndex--, str.charAt(oldIndex));
                }
            }
            return str.toString();
        }
    }

    
    


