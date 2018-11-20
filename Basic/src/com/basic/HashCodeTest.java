package com.basic;

/**
 * summary
 *
 * @author snowman
 * @create 2018.10.03 / 16:01
 */
public class HashCodeTest {

    private int num;
    private String data;


    /**
     * Equals满足以下规则
     * 自反性 x.equals(x)一定为ture
     * 对null性 x.equals(null)一定为false
     * 对称性 x.equals(y)和y.equals(x)结果一致
     * 传递性 a和b equals,b和c equals,那么 a和c也一定equals
     * 一致性 在某个运行的期间，2个对象的状态改变不会影响equals的结果，那么
     * 在这个运行期间，无论调用多少次equals,都返回相同的结果
     */

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if((obj == null) || obj.getClass() != this.getClass()){
            return false;
        }

        //能执行到这里 说明obj和this同类且非null
        HashCodeTest hashCodeTest = (HashCodeTest)obj;
        return num == hashCodeTest.num &&
                (data == hashCodeTest.data || (data!=null && data.equals(hashCodeTest.data)));
    }

    /**
     * 该方法返回对象的散列码，返回值是int类型的散列吗
     * 散列码是为了更好的支持基于哈希机制的java集合类，例如hashtable等
     * 重写了equals方法的对象必须同时重写hashcode方法
     * 如果2个对象通过equals调用后返回true，那么这个对象的hashcode方法也必须返回同样的int类型的散列码
     * 如果2个对象的equals返回false，他们的hashcode返回的值允许相同
     * 参与equals函数的字段，也必须都参与hashcode的计算
     *
     * 在某个运行期间，只要对象的(字段的)变化不会影响equals方法的决策结果，那么，在这个期间，无论调用多少次的hashcode，
     * 都必须返回同一个散列码
     * 通过equals调用返回true的2个对象的hashcode一定一样
     * 通过equals返回false的2个对象的散列码不需要不同，也就是他们的hashcode方法的返回值允许出现相同的情况
     * @return
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
