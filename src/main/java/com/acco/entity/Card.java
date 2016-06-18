package com.acco.entity;

import org.springframework.data.annotation.Id;

/**
 * Created by Salman on 5/19/2016.
 */
public class Card extends MongoEntity {
    @Id
    private String id;

    private String customerId;

    public Card (String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
