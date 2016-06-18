package com.acco.repo;

import com.acco.entity.MongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Salman on 5/19/2016.
 */
public interface MongoEntityRepository extends MongoRepository<MongoEntity , String> {
}
