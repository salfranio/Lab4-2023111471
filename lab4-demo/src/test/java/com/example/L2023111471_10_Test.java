/**
 * Solution10 分数加减运算测试类
 * 
 * 测试用例设计总体原则：
 * 1. 等价类划分：
 *    - 有效等价类：正常分数运算、带符号分数、整数形式分数
 *    - 边界值分析：单个分数、多个分数组合、结果为0、结果为1等情况
 * 2. 路径覆盖：覆盖所有运算符（+、-）的组合情况
 * 3. 特殊值测试：0值、负值、最简分数等情况
 * 4. 组合测试：不同长度和复杂度的表达式
 */
public class L2023111471_10_Test {
    
    public static void main(String[] args) {
        L2023111471_10_Test tester = new L2023111471_10_Test();
        tester.runAllTests();
    }
    
    public void runAllTests() {
        testExample1();
        testExample2();
        testExample3();
        testSingleFraction();
        testMultipleAdditions();
        testNegativeResult();
        testComplexExpression();
        testZeroResult();
        System.out.println("所有测试完成！");
    }
    
    /**
     * 测试目的：验证基础的正负分数相加结果为0的情况
     * 测试用例：等值异号分数相加
     * 等价类：有效等价类 - 基础运算
     * 预期：验证抵消逻辑正确性
     */
    public void testExample1() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("-1/2+1/2");
        String expected = "0/1";
        assertEqual(expected, result, "testExample1 - 等值异号分数相加");
    }
    
    /**
     * 测试目的：验证多个分数连续相加的正确性
     * 测试用例：抵消后再加上第三个分数
     * 等价类：有效等价类 - 多运算组合
     * 预期：验证多步运算的累积效果
     */
    public void testExample2() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("-1/2+1/2+1/3");
        String expected = "1/3";
        assertEqual(expected, result, "testExample2 - 多分数连续相加");
    }
    
    /**
     * 测试目的：验证异分母分数相减的正确性
     * 测试用例：不同分母的分数减法
     * 等价类：有效等价类 - 异分母运算
     * 预期：验证通分和约分逻辑
     */
    public void testExample3() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("1/3-1/2");
        String expected = "-1/6";
        assertEqual(expected, result, "testExample3 - 异分母分数相减");
    }
    
    /**
     * 测试目的：验证单个分数输入的边界情况
     * 测试用例：只有一个分数的情况
     * 等价类：边界值 - 最小输入
     * 预期：验证单分数处理逻辑
     */
    public void testSingleFraction() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("1/2");
        String expected = "1/2";
        assertEqual(expected, result, "testSingleFraction - 单个分数输入");
    }
    
    /**
     * 测试目的：验证多个同分母分数相加的正确性
     * 测试用例：四个相同分数相加
     * 等价类：有效等价类 - 同分母多分数
     * 预期：验证重复加法运算
     */
    public void testMultipleAdditions() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("1/3+1/3+1/3+1/3");
        String expected = "4/3";
        assertEqual(expected, result, "testMultipleAdditions - 多个同分母分数相加");
    }
    
    /**
     * 测试目的：验证结果为负数的分数运算
     * 测试用例：正数减去更大的正数
     * 等价类：有效等价类 - 负数结果
     * 预期：验证负数处理和符号逻辑
     */
    public void testNegativeResult() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("1/2-3/2");
        String expected = "-1/1";
        assertEqual(expected, result, "testNegativeResult - 负数结果测试");
    }
    
    /**
     * 测试目的：验证复杂表达式和多运算符组合
     * 测试用例：多个不同分母分数混合运算
     * 等价类：有效等价类 - 复杂表达式
     * 预期：验证复杂场景下的正确性
     */
    public void testComplexExpression() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("1/2+1/3-1/4");
        String expected = "7/12";
        assertEqual(expected, result, "testComplexExpression - 复杂表达式测试");
    }
    
    /**
     * 测试目的：验证结果为0的特殊情况
     * 测试用例：多个分数组合结果为0
     * 等价类：特殊值 - 零值结果
     * 预期：验证零值处理逻辑
     */
    public void testZeroResult() {
        Solution10 solution = new Solution10();
        String result = solution.fractionAddition("1/4+1/4-1/2");
        String expected = "0/1";
        assertEqual(expected, result, "testZeroResult - 零值结果测试");
    }
    
    /**
     * 断言方法，比较期望值和实际值
     */
    private void assertEqual(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println("✓ " + testName + " 通过");
        } else {
            System.out.println("✗ " + testName + " 失败");
            System.out.println("  期望: " + expected);
            System.out.println("  实际: " + actual);
        }
    }
}

// 所有测试均通过