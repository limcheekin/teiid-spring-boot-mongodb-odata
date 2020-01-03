package teiid.spring.boot.mongodb.odata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.teiid.spring.data.mongodb.MongoDBConfiguration;
import org.teiid.spring.data.mongodb.MongoDBConnectionFactory;
import org.teiid.spring.data.mongodb.MongoDBTemplate;

@Configuration
public class DataSources {
    @Bean
    public MongoDBConnectionFactory raasagent(@Qualifier("config") @Autowired MongoDBConfiguration config) {
        return new MongoDBConnectionFactory(new MongoDBTemplate(config));
    }

    @ConfigurationProperties("spring.teiid.data.mongodb.raasagent")
    @Bean("config")
    public MongoDBConfiguration mongoConfig() {
        return new MongoDBConfiguration();
    }
}