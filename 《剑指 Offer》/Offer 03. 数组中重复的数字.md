#### [剑指 Offer 03. 数组中重复的数字](https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/)

> 它考察的是程序员的沟通能力，先问面试官要时间/空间需求！！！
> 只是时间优先就用字典，
> 还有空间要求，就用指针+原地排序数组，
> 如果面试官要求空间O(1)并且不能修改原数组，还得写成二分法！！！

> Ⅰ.排序法
>
> - 执行用时：4 ms, 在所有 Java 提交中击败了52.75%的用户

```java
class Solution {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i + 1 < nums.length && nums[i] == nums[i + 1]){
                return nums[i];
            }
        }
        return -1;
    }
}
```

> Ⅱ. HashMap
>
> - 执行用时：17 ms, 在所有 Java 提交中击败了5.72%的用户

```java
class Solution {
    public int findRepeatNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) && map.get(nums[i]) == 2){
                return nums[i];
            }else{
                map.put(nums[i], map.getOrDefault(nums[i],1) + 1);
            }
        }
        return -1;
    }
}
```

> Ⅲ.数组排序
>
> - 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户

```java
class Solution {
    public int findRepeatNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            while(nums[i] != i){
                if(nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
        }
        return -1;
    }
}
```

