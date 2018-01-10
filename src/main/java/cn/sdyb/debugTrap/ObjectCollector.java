package cn.sdyb.debugTrap;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by meloncoder on 2018/1/10.
 */
public class ObjectCollector extends Converter<List<Map<String, Integer>>>{

    private List<MultiFeatureObject> objects;

    public ObjectCollector(int size, Class<? extends MultiFeatureObject> cls) {
        init(size, cls);
    }

    private void init(int size, Class<? extends MultiFeatureObject> cls) {
        objects = new ArrayList<>(size);
        for (int i = 0; i < size; ++i) {
            try {
                objects.add(cls.newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<MultiFeatureObject> getObjects() {
        return this.objects;
    }

    @Override
    public List<Map<String, Integer>> convertTo() {
        return objects.stream().map(Converter::convertTo).collect(Collectors.toList());
    }
}
