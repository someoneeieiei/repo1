package com.qf.condition;

import com.qf.anno.MyConditional;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class MyConditionalClass implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            return true;
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        Map<String, Object> attributesMap = metadata.getAnnotationAttributes(MyConditional.class.getName());
        System.out.println(attributesMap);
        return true;
    }
}
