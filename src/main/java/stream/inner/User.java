package stream.inner;/**
 * Created by Zhouyi.Fan on 2020/1/15.
 *
 * @version 版本号:1.01
 */

import lombok.Builder;
import lombok.Data;

/**
 * DESCRIPTION:
 **/
@Data
@Builder
public class User {
    String name;
    String IdCard;
}
