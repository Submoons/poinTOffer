**题目描述**
    在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
![此处输入图片的描述][1]


  [1]: https://github.com/Submoons/poinTOffer/blob/master/003%E4%BA%8C%E7%BB%B4%E6%95%B0%E7%BB%84%E4%B8%AD%E7%9A%84%E6%9F%A5%E6%89%BE/03.jpg
  
  **思路**
  从数组中选取数字，和目标数字的关系有三种情况：=，<或>。如果是等于则查找成功；如果是数组中元素小于要查找的数字，说明要查找的数字应该在当前位置的右边或下边。如果是数组中元素大于要查找的数字，说明要查找的数字应该在当前位置的左边或上边。即对于数组中的任何一个元素,比它小的元素都在它的左方或者上方,比它大的元素都在它的右边或者下方但是这两个区域还有可能有重叠，比如右边或下边会在右下角有重叠。
  因此重叠问题的解决方法：如果查找从右上角开始，如果要查找的数字不在右上角，则每次可以剔除一列或一行。