/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcExchangeCombActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeCombActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeCombActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcExchangeCombActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDirection(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_Direction_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_Volume_get(swigCPtr, this);
  }

  public void setCombDirection(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_CombDirection_set(swigCPtr, this, value);
  }

  public char getCombDirection() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_CombDirection_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_InstallID_get(swigCPtr, this);
  }

  public void setActionStatus(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_ActionStatus_set(swigCPtr, this, value);
  }

  public char getActionStatus() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_ActionStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_SettlementID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_SequenceNo_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_MacAddress_get(swigCPtr, this);
  }

  public void setComTradeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_ComTradeID_set(swigCPtr, this, value);
  }

  public String getComTradeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_ComTradeID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeCombActionField_BranchID_get(swigCPtr, this);
  }

  public CThostFtdcExchangeCombActionField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcExchangeCombActionField(), true);
  }

}