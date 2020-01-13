package src;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateConfig {

    public SessionFactory getSessionFactory(){

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build(); // get defolt conf. from hibernate.cfg.xml
        MetadataSources sources = new MetadataSources(registry); // read data to metasource
        Metadata metadata= sources.getMetadataBuilder().build();// let as create session factory
        return metadata.getSessionFactoryBuilder().build();// create session factory
    }
}
