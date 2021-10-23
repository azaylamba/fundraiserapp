package com.relevel.fundraiserapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Campaign {

    @Id
    private long campaign_id;
}
