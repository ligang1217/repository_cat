package cn.itcast;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;

public class MyStrategy extends SpringPhysicalNamingStrategy
{
    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment jdbcEnvironment) {
        System.out.println(name.getText());
        //返回的是模型类的名称  User  默认生成的是user,想让表名默认为lg_user

        return new Identifier("lg_"+name.getText().toLowerCase(),true);
    }
}
