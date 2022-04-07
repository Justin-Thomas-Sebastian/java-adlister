import java.sql.*;
import com.mysql.cj.jdbc.Driver;

import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    public Connection connection = null;

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
        );
    }

    @Override
    public List<Ad> all() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM ads");
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            long id = rs.getLong("id");
            long userId = rs.getLong("user_id");
            String title = rs.getString("title");
            String description = rs.getString("description");
            Ad adToInsert = new Ad(id, userId, title, description);
            ads.add(adToInsert);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        long userId = ad.getUserId();
        String title = ad.getTitle();
        String description = ad.getDescription();

        Statement statement = connection.createStatement();
        statement.executeUpdate(
                "INSERT INTO ads(user_id, title, description) " +
                    "VALUES" + "(" + addSingleQuotes(userId) + "," +
                                    addSingleQuotes(title) + "," +
                                    addSingleQuotes(description) + ")"
        , Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = statement.getGeneratedKeys();
        rs.next();
        System.out.println("Inserted a new record! New id: " + rs.getLong(1));
        return (rs.getLong(1));
    }

    public String addSingleQuotes(String str){
        return "'" + str + "'";
    }

    public String addSingleQuotes(Long numLong){
        return "'" + numLong + "'";
    }
}
