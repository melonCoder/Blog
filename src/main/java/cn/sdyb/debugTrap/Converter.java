package cn.sdyb.debugTrap;

/**
 * Created by meloncoder on 2018/1/10.
 */
public abstract class Converter<T> {

    public abstract T convertTo();

    @Override
    public String toString() {
//        return "";
        return this.convertTo().toString();
    }
}
