package stream;/**
 * Created by Zhouyi.Fan on 2020/1/15.
 *
 * @version 版本号:1.01
 */

import stream.inner.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * DESCRIPTION:  stream的Map 是映射处理的意思
 **/
public class StreamMapTest {



    public static void main(String[] args) {

        User user=User.builder().IdCard("123").name("abc").build();
        User user2=User.builder().IdCard("124").name("abc").build();
        List<User> users =new ArrayList<User>();

        users.add(user);
        users.add(user2);

        List<String> idCards= users.stream().map(User::getIdCard).collect(Collectors.toList());
        System.out.println(idCards);

    }

}
