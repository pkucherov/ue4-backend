/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class Relationship implements Serializable {

    private static final long serialVersionUID = 686877969;

    private String pilIdSource;
    private String pilIdTarget;
    private OffsetDateTime lastUpdate;
    private String status;

    public Relationship() {
    }

    public Relationship(Relationship value) {
        this.pilIdSource = value.pilIdSource;
        this.pilIdTarget = value.pilIdTarget;
        this.lastUpdate = value.lastUpdate;
        this.status = value.status;
    }

    public Relationship(String pilIdSource, String pilIdTarget, OffsetDateTime lastUpdate, String status) {
        this.pilIdSource = pilIdSource;
        this.pilIdTarget = pilIdTarget;
        this.lastUpdate = lastUpdate;
        this.status = status;
    }

    @NotNull
    public String getRelPilIdSource() {
        return this.pilIdSource;
    }

    public void setRelPilIdSource(String pilIdSource) {
        this.pilIdSource = pilIdSource;
    }

    @NotNull
    public String getRelPilIdTarget() {
        return this.pilIdTarget;
    }

    public void setRelPilIdTarget(String pilIdTarget) {
        this.pilIdTarget = pilIdTarget;
    }

    public OffsetDateTime getRelLastUpdate() {
        return this.lastUpdate;
    }

    public void setRelLastUpdate(OffsetDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @NotNull
    public String getRelStatus() {
        return this.status;
    }

    public void setRelStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Relationship (");

        sb.append(pilIdSource);
        sb.append(", ").append(pilIdTarget);
        sb.append(", ").append(lastUpdate);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}