import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class TestConfiguration {
    @Bean
    public CommandLineRunner runner(JdbcTemplate jdbcTemplate) {
        return args -> {
            String sql = "SELECT 1";
            jdbcTemplate.execute(sql);
        };
    }
}
