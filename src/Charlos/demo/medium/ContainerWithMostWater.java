package Charlos.demo.medium;

/**
 * @Classname ContainerWithMostWater
 * @Description TODO
 * @Author Charlos
 * @Date 2019/10/28 14:55
 * @Version 1.0
 **/

/*
    #11 盛水最多的容器（完）

    给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，
    垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，
    使得它们与 x 轴共同构成的容器可以容纳最多的水。

 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}
