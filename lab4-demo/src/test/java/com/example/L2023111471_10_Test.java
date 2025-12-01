/**
 * Solution10 分数加减运算测试类（已改为 JUnit4 测试）
 */
package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class L2023111471_10_Test {

    /**
     * 测试目的：验证基础的正负分数相加结果为0的情况
     * 测试用例：等值异号分数相加
     * 等价类：有效等价类 - 基础运算
     * 预期：验证抵消逻辑正确性
     */
    @Test
    public void testExample1() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("-1/2+1/2");
        String expected = "0/1";
        assertEquals("testExample1 - 等值异号分数相加", expected, result);
    }
    
    /**
     * 测试目的：验证多个分数连续相加的正确性
     * 测试用例：抵消后再加上第三个分数
     * 等价类：有效等价类 - 多运算组合
     * 预期：验证多步运算的累积效果
     */
    @Test
    public void testExample2() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("-1/2+1/2+1/3");
        String expected = "1/3";
        assertEquals("testExample2 - 多分数连续相加", expected, result);
    }
    
    /**
     * 测试目的：验证异分母分数相减的正确性
     * 测试用例：不同分母的分数减法
     * 等价类：有效等价类 - 异分母运算
     * 预期：验证通分和约分逻辑
     */
    @Test
    public void testExample3() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("1/3-1/2");
        String expected = "-1/6";
        assertEquals("testExample3 - 异分母分数相减", expected, result);
    }
    
    /**
     * 测试目的：验证单个分数输入的边界情况
     * 测试用例：只有一个分数的情况
     * 等价类：边界值 - 最小输入
     * 预期：验证单分数处理逻辑
     */
    @Test
    public void testSingleFraction() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("1/2");
        String expected = "1/2";
        assertEquals("testSingleFraction - 单个分数输入", expected, result);
    }
    
    /**
     * 测试目的：验证多个同分母分数相加的正确性
     * 测试用例：四个相同分数相加
     * 等价类：有效等价类 - 同分母多分数
     * 预期：验证重复加法运算
     */
    @Test
    public void testMultipleAdditions() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("1/3+1/3+1/3+1/3");
        String expected = "4/3";
        assertEquals("testMultipleAdditions - 多个同分母分数相加", expected, result);
    }
    
    /**
     * 测试目的：验证结果为负数的分数运算
     * 测试用例：正数减去更大的正数
     * 等价类：有效等价类 - 负数结果
     * 预期：验证负数处理和符号逻辑
     */
    @Test
    public void testNegativeResult() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("1/2-3/2");
        String expected = "-1/1";
        assertEquals("testNegativeResult - 负数结果测试", expected, result);
    }
    
    /**
     * 测试目的：验证复杂表达式和多运算符组合
     * 测试用例：多个不同分母分数混合运算
     * 等价类：有效等价类 - 复杂表达式
     * 预期：验证复杂场景下的正确性
     */
    @Test
    public void testComplexExpression() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("1/2+1/3-1/4");
        String expected = "7/12";
        assertEquals("testComplexExpression - 复杂表达式测试", expected, result);
    }
    
    /**
     * 测试目的：验证结果为0的特殊情况
     * 测试用例：多个分数组合结果为0
     * 等价类：特殊值 - 零值结果
     * 预期：验证零值处理逻辑
     */
    @Test
    public void testZeroResult() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("1/4+1/4-1/2");
        String expected = "0/1";
        assertEquals("testZeroResult - 零值结果测试", expected, result);
    }
}