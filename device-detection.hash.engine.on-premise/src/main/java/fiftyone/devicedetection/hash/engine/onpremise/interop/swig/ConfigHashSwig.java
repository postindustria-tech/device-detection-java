/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package fiftyone.devicedetection.hash.engine.onpremise.interop.swig;

public class ConfigHashSwig extends ConfigDeviceDetectionSwig {
  private transient long swigCPtr;

  protected ConfigHashSwig(long cPtr, boolean cMemoryOwn) {
    super(DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConfigHashSwig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        DeviceDetectionHashEngineModuleJNI.delete_ConfigHashSwig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ConfigHashSwig() {
    this(DeviceDetectionHashEngineModuleJNI.new_ConfigHashSwig(), true);
  }

  public void setHighPerformance() {
    DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_setHighPerformance(swigCPtr, this);
  }

  public void setBalanced() {
    DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_setBalanced(swigCPtr, this);
  }

  public void setBalancedTemp() {
    DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_setBalancedTemp(swigCPtr, this);
  }

  public void setLowMemory() {
    DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_setLowMemory(swigCPtr, this);
  }

  public void setMaxPerformance() {
    DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_setMaxPerformance(swigCPtr, this);
  }

  public void setDrift(int drift) {
    DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_setDrift(swigCPtr, this, drift);
  }

  public void setDifference(int difference) {
    DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_setDifference(swigCPtr, this, difference);
  }

  public void setConcurrency(int concurrency) {
    DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_setConcurrency(swigCPtr, this, concurrency);
  }

  public void setUsePerformanceGraph(boolean use) {
    DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_setUsePerformanceGraph(swigCPtr, this, use);
  }

  public void setUsePredictiveGraph(boolean use) {
    DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_setUsePredictiveGraph(swigCPtr, this, use);
  }

  public void setTraceRoute(boolean trace) {
    DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_setTraceRoute(swigCPtr, this, trace);
  }

  public CollectionConfigSwig getStrings() {
    return new CollectionConfigSwig(DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_getStrings(swigCPtr, this), true);
  }

  public CollectionConfigSwig getProperties() {
    return new CollectionConfigSwig(DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_getProperties(swigCPtr, this), true);
  }

  public CollectionConfigSwig getValues() {
    return new CollectionConfigSwig(DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_getValues(swigCPtr, this), true);
  }

  public CollectionConfigSwig getProfiles() {
    return new CollectionConfigSwig(DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_getProfiles(swigCPtr, this), true);
  }

  public CollectionConfigSwig getNodes() {
    return new CollectionConfigSwig(DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_getNodes(swigCPtr, this), true);
  }

  public CollectionConfigSwig getProfileOffsets() {
    return new CollectionConfigSwig(DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_getProfileOffsets(swigCPtr, this), true);
  }

  public int getDrift() {
    return DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_getDrift(swigCPtr, this);
  }

  public int getDifference() {
    return DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_getDifference(swigCPtr, this);
  }

  public boolean getUsePerformanceGraph() {
    return DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_getUsePerformanceGraph(swigCPtr, this);
  }

  public boolean getUsePredictiveGraph() {
    return DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_getUsePredictiveGraph(swigCPtr, this);
  }

  public int getConcurrency() {
    return DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_getConcurrency(swigCPtr, this);
  }

  public boolean getTraceRoute() {
    return DeviceDetectionHashEngineModuleJNI.ConfigHashSwig_getTraceRoute(swigCPtr, this);
  }

}
