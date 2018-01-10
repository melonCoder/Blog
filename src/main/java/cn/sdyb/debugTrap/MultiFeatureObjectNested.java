package cn.sdyb.debugTrap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by meloncoder on 2018/1/10.
 */
public class MultiFeatureObjectNested extends MultiFeatureObject{

    public MultiFeatureObjectNested() {
    }

    List<Integer> features = new ArrayList<Integer>(5) {{
        Random random = new Random();
        for(int i = 0; i < 5; ++i) {
            if(random.nextBoolean()) {
                add(random.nextInt(10000));
            } else {
                add(0);
            }
        }
    }};

    public void restore() {
        this.feature0 = features.get(0);
        this.feature1 = features.get(1);
        this.feature2 = features.get(2);
        this.feature3 = features.get(3);
        this.feature4 = features.get(4);
    }

    @Override
    public Map<String, Integer> convertTo() {
        restore();
        return super.convertTo();
    }
}
