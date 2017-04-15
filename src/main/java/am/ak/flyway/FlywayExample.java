package am.ak.flyway;

import org.flywaydb.core.Flyway;

/**
 * Created by karlen on 4/15/17.
 */
public class FlywayExample {

    public static void main(String[] args) {
        Flyway flyway = new Flyway();
        flyway.setDataSource("jdbc:mysql://localhost:3306/flywayTestDB", "root", "root");
        flyway.migrate();
    }
}
