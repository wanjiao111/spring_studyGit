package wan.Stream;

import com.alibaba.fastjson.JSON;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest {
    public static void main(String[] args) {


        List<Person4> person4List = new ArrayList<>();
        Consumer<Person4> consumer = x -> {
            if (x.getName().equals("lisi")) {
                person4List.add(x);
            }
        };
        consumer = consumer.andThen(x -> {
                    if (x.getAge() >= 23) {
                        person4List.remove(x);
                    }
                }

        );
        Consumer<Integer> consumer1=x->x.compareTo(1);
        Stream.of(
                new Person4(21, "zhangsan"),
                new Person4(22, "lisi"),
                new Person4(23, "wangwu"),
                new Person4(24, "wangwu"),
                new Person4(23, "lisi"),
                new Person4(26, "lisi"),
                new Person4(26, "zhangsan")
        ).forEach(consumer);

        System.out.println(JSON.toJSONString(person4List));


    }
}

/**
 * 此处使用lombok插件（值得了解）
 */
@Data
@Builder
//@Accessors(chain = true)
//@AllArgsConstructor
class Person4 {
    private Integer age;
    private String name;
}

