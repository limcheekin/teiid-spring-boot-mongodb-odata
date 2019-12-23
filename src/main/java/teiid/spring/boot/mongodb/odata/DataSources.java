package teiid.spring.boot.mongodb.odata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.teiid.spring.data.mongodb.MongoDBConnectionFactory;

@Configuration
public class DataSources {
    @Bean
    public MongoDBConnectionFactory raasagent(@Autowired MongoTemplate template) {
        return new MongoDBConnectionFactory(template);
    }
}