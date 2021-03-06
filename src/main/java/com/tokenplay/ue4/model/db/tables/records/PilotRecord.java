/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.records;


import java.time.OffsetDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import com.tokenplay.ue4.model.db.tables.Tue4Pilot;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class PilotRecord extends UpdatableRecordImpl<PilotRecord>
    implements
    Record18<String, String, Long, String, String, OffsetDateTime, String, String, OffsetDateTime, Boolean, String, String, Boolean, String, OffsetDateTime, Boolean, String, Boolean> {

    private static final long serialVersionUID = 1864026771;

    /**
     * Setter for <code>tue4_pilot.pil_id</code>.
     */
    public void setPilId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_id</code>.
     */
    @NotNull
    public String getPilId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>tue4_pilot.pil_callsign</code>.
     */
    public void setPilCallsign(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_callsign</code>.
     */
    @NotNull
    public String getPilCallsign() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tue4_pilot.pil_usu_id</code>.
     */
    public void setPilUsuId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_usu_id</code>.
     */
    @NotNull
    public Long getPilUsuId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>tue4_pilot.pil_srv_id</code>.
     */
    public void setPilSrvId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_srv_id</code>.
     */
    public String getPilSrvId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>tue4_pilot.pil_token</code>.
     */
    public void setPilToken(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_token</code>.
     */
    public String getPilToken() {
        return (String) get(4);
    }

    /**
     * Setter for <code>tue4_pilot.pil_last_ping</code>.
     */
    public void setPilLastPing(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_last_ping</code>.
     */
    public OffsetDateTime getPilLastPing() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for <code>tue4_pilot.pil_last_ip</code>.
     */
    public void setPilLastIp(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_last_ip</code>.
     */
    public String getPilLastIp() {
        return (String) get(6);
    }

    /**
     * Setter for <code>tue4_pilot.pil_last_version</code>.
     */
    public void setPilLastVersion(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_last_version</code>.
     */
    public String getPilLastVersion() {
        return (String) get(7);
    }

    /**
     * Setter for <code>tue4_pilot.pil_last_login</code>.
     */
    public void setPilLastLogin(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_last_login</code>.
     */
    public OffsetDateTime getPilLastLogin() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for <code>tue4_pilot.pil_disable_chat</code>.
     */
    public void setPilDisableChat(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_disable_chat</code>.
     */
    public Boolean getPilDisableChat() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>tue4_pilot.pil_rmbr_token</code>.
     */
    public void setPilRmbrToken(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_rmbr_token</code>.
     */
    public String getPilRmbrToken() {
        return (String) get(10);
    }

    /**
     * Setter for <code>tue4_pilot.pil_uth_id</code>.
     */
    public void setPilUthId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_uth_id</code>.
     */
    public String getPilUthId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>tue4_pilot.pil_disable_requests</code>.
     */
    public void setPilDisableRequests(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_disable_requests</code>.
     */
    public Boolean getPilDisableRequests() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>tue4_pilot.pil_leave_reason</code>.
     */
    public void setPilLeaveReason(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_leave_reason</code>.
     */
    public String getPilLeaveReason() {
        return (String) get(13);
    }

    /**
     * Setter for <code>tue4_pilot.pil_leave_date</code>.
     */
    public void setPilLeaveDate(OffsetDateTime value) {
        set(14, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_leave_date</code>.
     */
    public OffsetDateTime getPilLeaveDate() {
        return (OffsetDateTime) get(14);
    }

    /**
     * Setter for <code>tue4_pilot.pil_off_limits</code>.
     */
    public void setPilOffLimits(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_off_limits</code>.
     */
    public Boolean getPilOffLimits() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>tue4_pilot.pil_default_scheme</code>.
     */
    public void setPilDefaultScheme(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_default_scheme</code>.
     */
    public String getPilDefaultScheme() {
        return (String) get(16);
    }

    /**
     * Setter for <code>tue4_pilot.pil_use_custom_scheme</code>.
     */
    public void setPilUseCustomScheme(Boolean value) {
        set(17, value);
    }

    /**
     * Getter for <code>tue4_pilot.pil_use_custom_scheme</code>.
     */
    public Boolean getPilUseCustomScheme() {
        return (Boolean) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, Long, String, String, OffsetDateTime, String, String, OffsetDateTime, Boolean, String, String, Boolean, String, OffsetDateTime, Boolean, String, Boolean> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, Long, String, String, OffsetDateTime, String, String, OffsetDateTime, Boolean, String, String, Boolean, String, OffsetDateTime, Boolean, String, Boolean> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Tue4Pilot.PILOT.PIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tue4Pilot.PILOT.PIL_CALLSIGN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Tue4Pilot.PILOT.PIL_USU_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Tue4Pilot.PILOT.PIL_SRV_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Tue4Pilot.PILOT.PIL_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field6() {
        return Tue4Pilot.PILOT.PIL_LAST_PING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Tue4Pilot.PILOT.PIL_LAST_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Tue4Pilot.PILOT.PIL_LAST_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field9() {
        return Tue4Pilot.PILOT.PIL_LAST_LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return Tue4Pilot.PILOT.PIL_DISABLE_CHAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Tue4Pilot.PILOT.PIL_RMBR_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Tue4Pilot.PILOT.PIL_UTH_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return Tue4Pilot.PILOT.PIL_DISABLE_REQUESTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Tue4Pilot.PILOT.PIL_LEAVE_REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field15() {
        return Tue4Pilot.PILOT.PIL_LEAVE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field16() {
        return Tue4Pilot.PILOT.PIL_OFF_LIMITS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Tue4Pilot.PILOT.PIL_DEFAULT_SCHEME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field18() {
        return Tue4Pilot.PILOT.PIL_USE_CUSTOM_SCHEME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getPilId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPilCallsign();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getPilUsuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPilSrvId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPilToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component6() {
        return getPilLastPing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPilLastIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getPilLastVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component9() {
        return getPilLastLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getPilDisableChat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getPilRmbrToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getPilUthId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
        return getPilDisableRequests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getPilLeaveReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component15() {
        return getPilLeaveDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component16() {
        return getPilOffLimits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getPilDefaultScheme();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component18() {
        return getPilUseCustomScheme();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getPilId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPilCallsign();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getPilUsuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPilSrvId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPilToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value6() {
        return getPilLastPing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPilLastIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPilLastVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value9() {
        return getPilLastLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getPilDisableChat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getPilRmbrToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPilUthId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getPilDisableRequests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getPilLeaveReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value15() {
        return getPilLeaveDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value16() {
        return getPilOffLimits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getPilDefaultScheme();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value18() {
        return getPilUseCustomScheme();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value1(String value) {
        setPilId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value2(String value) {
        setPilCallsign(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value3(Long value) {
        setPilUsuId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value4(String value) {
        setPilSrvId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value5(String value) {
        setPilToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value6(OffsetDateTime value) {
        setPilLastPing(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value7(String value) {
        setPilLastIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value8(String value) {
        setPilLastVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value9(OffsetDateTime value) {
        setPilLastLogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value10(Boolean value) {
        setPilDisableChat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value11(String value) {
        setPilRmbrToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value12(String value) {
        setPilUthId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value13(Boolean value) {
        setPilDisableRequests(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value14(String value) {
        setPilLeaveReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value15(OffsetDateTime value) {
        setPilLeaveDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value16(Boolean value) {
        setPilOffLimits(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value17(String value) {
        setPilDefaultScheme(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord value18(Boolean value) {
        setPilUseCustomScheme(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PilotRecord values(String value1, String value2, Long value3, String value4, String value5, OffsetDateTime value6, String value7,
        String value8, OffsetDateTime value9, Boolean value10, String value11, String value12, Boolean value13, String value14,
        OffsetDateTime value15, Boolean value16, String value17, Boolean value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PilotRecord
     */
    public PilotRecord() {
        super(Tue4Pilot.PILOT);
    }

    /**
     * Create a detached, initialised PilotRecord
     */
    public PilotRecord(String id, String callsign, Long usuId, String srvId, String token, OffsetDateTime lastPing, String lastIp,
        String lastVersion, OffsetDateTime lastLogin, Boolean disableChat, String rmbrToken, String uthId, Boolean disableRequests,
        String leaveReason, OffsetDateTime leaveDate, Boolean offLimits, String defaultScheme, Boolean useCustomScheme) {
        super(Tue4Pilot.PILOT);

        set(0, id);
        set(1, callsign);
        set(2, usuId);
        set(3, srvId);
        set(4, token);
        set(5, lastPing);
        set(6, lastIp);
        set(7, lastVersion);
        set(8, lastLogin);
        set(9, disableChat);
        set(10, rmbrToken);
        set(11, uthId);
        set(12, disableRequests);
        set(13, leaveReason);
        set(14, leaveDate);
        set(15, offLimits);
        set(16, defaultScheme);
        set(17, useCustomScheme);
    }
}
