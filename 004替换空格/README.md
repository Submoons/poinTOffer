**��Ŀ:**  
��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy
**�Ż�:**
���ǿ��Կ����ȱ���һ���ַ���,�����ո����Ŀ,����֪���˿ո����Ŀ����ʵ����֪�����滻���ַ����ĳ��ȣ���ôֻ��Ҫ����һ���滻�Ϳ����ˡ���Ϊ���ǵĹ�����Ϊ����һ���ַ�����ͳ���ַ����ֵ���Ŀ,�����滻����ַ������ȣ��ٱ���һ���ַ���������滻��

**ţ��������:**

    //һ�����������ʽʹ��replaceAll()
    public class Solution{
        public String replaceSpace(StringBuffer str){
            return str.toString().replaceAll("\\s", "%20");
        }
    }

    /**
        �������������е�replace�ȷ���,��ǰ�����滻,������ַ�Ҫ���������ƶ�,Ҫ����ƶ�,Ч�ʵ��¡��Ӻ���ǰ,�ȼ�����Ҫ���ٿռ�,Ȼ��Ӻ���ǰ�ƶ�,��ÿ���ַ�ֻΪ�ƶ�һ��,����Ч�ʸߵ㡣
    **/
    public class Solution{
        public String replaceSpace(StringBuffer str){
            int spaceNum = 0; //����ո���
            for(int i=0; i<str.length; i++){
                if(str.charAt(i) == ' '){
                    spaceNum++;
                }
            }
            int oldIndex = str.length()-1; //�滻ǰstr���±�
            int newLength = str.length + spaceNum * 2; //�ո�ת����%20��ĳ���
            int newIndex = newLength-1; //�滻����±�
            str.setLength(newIndex); //ʹstr���ȸ���,��ֹ�±�Խ��
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

    
    


