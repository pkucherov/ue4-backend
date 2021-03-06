/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class Mapmode implements Serializable {

    private static final long serialVersionUID = -708284913;

    private String gamId;
    private String mapId;
    private Boolean enabled;
    private Boolean aiEnabled;
    private String srvId;
    private String id;
    private Long matchTime;

    public Mapmode() {
    }

    public Mapmode(Mapmode value) {
        this.gamId = value.gamId;
        this.mapId = value.mapId;
        this.enabled = value.enabled;
        this.aiEnabled = value.aiEnabled;
        this.srvId = value.srvId;
        this.id = value.id;
        this.matchTime = value.matchTime;
    }

    public Mapmode(String gamId, String mapId, Boolean enabled, Boolean aiEnabled, String srvId, String id, Long matchTime) {
        this.gamId = gamId;
        this.mapId = mapId;
        this.enabled = enabled;
        this.aiEnabled = aiEnabled;
        this.srvId = srvId;
        this.id = id;
        this.matchTime = matchTime;
    }

    @NotNull
    public String getMamGamId() {
        return this.gamId;
    }

    public void setMamGamId(String gamId) {
        this.gamId = gamId;
    }

    @NotNull
    public String getMamMapId() {
        return this.mapId;
    }

    public void setMamMapId(String mapId) {
        this.mapId = mapId;
    }

    public Boolean getMamEnabled() {
        return this.enabled;
    }

    public void setMamEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getMamAiEnabled() {
        return this.aiEnabled;
    }

    public void setMamAiEnabled(Boolean aiEnabled) {
        this.aiEnabled = aiEnabled;
    }

    public String getMamSrvId() {
        return this.srvId;
    }

    public void setMamSrvId(String srvId) {
        this.srvId = srvId;
    }

    @NotNull
    public String getMamId() {
        return this.id;
    }

    public void setMamId(String id) {
        this.id = id;
    }

    public Long getMamMatchTime() {
        return this.matchTime;
    }

    public void setMamMatchTime(Long matchTime) {
        this.matchTime = matchTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Mapmode (");

        sb.append(gamId);
        sb.append(", ").append(mapId);
        sb.append(", ").append(enabled);
        sb.append(", ").append(aiEnabled);
        sb.append(", ").append(srvId);
        sb.append(", ").append(id);
        sb.append(", ").append(matchTime);

        sb.append(")");
        return sb.toString();
    }
}
