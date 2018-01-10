package cn.sdyb.debugTrap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by meloncoder on 2018/1/10.
 */
public class MultiFeatureObject extends Converter<Map<String, Integer>> {

    protected int feature0;
     int feature1;
     int feature2;
     int feature3;
     int feature4;

    public MultiFeatureObject() {
        init();
    }

    private void init() {
        /**
         * 仿真条件：并不是所有的域都有值
         */
        Random random = new Random();
        feature0 = random.nextBoolean() ? 0 : random.nextInt(100000);
        feature1 = random.nextBoolean() ? 0 : random.nextInt(100000);
        feature2 = random.nextBoolean() ? 0 : random.nextInt(100000);
        feature3 = random.nextBoolean() ? 0 : random.nextInt(100000);
        feature4 = random.nextBoolean() ? 0 : random.nextInt(100000);
    }

    public Map<String, Integer> getFeatures() {
        Map<String, Integer> ret = new HashMap<>(10);
        if(feature0 != 0) {
            ret.put("feature0", feature0);
        }
        if(feature1 != 0) {
            ret.put("feature1", feature1);
        }
        if(feature2 != 0) {
            ret.put("feature2", feature2);
        }
        if(feature3 != 0) {
            ret.put("feature3", feature3);
        }
        if(feature4 != 0) {
            ret.put("feature4", feature4);
        }
        return ret;
    }

    public Map<String, Integer> convertTo() {
        return getFeatures();
    }
}
