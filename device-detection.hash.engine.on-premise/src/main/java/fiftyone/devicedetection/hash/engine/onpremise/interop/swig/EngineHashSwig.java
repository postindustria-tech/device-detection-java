/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package fiftyone.devicedetection.hash.engine.onpremise.interop.swig;

public class EngineHashSwig extends EngineDeviceDetectionSwig {
  private transient long swigCPtr;

  protected EngineHashSwig(long cPtr, boolean cMemoryOwn) {
    super(DeviceDetectionHashEngineModuleJNI.EngineHashSwig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EngineHashSwig obj) {
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
        DeviceDetectionHashEngineModuleJNI.delete_EngineHashSwig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public EngineHashSwig(String fileName, ConfigHashSwig config, RequiredPropertiesConfigSwig properties) {
    this(DeviceDetectionHashEngineModuleJNI.new_EngineHashSwig__SWIG_0(fileName, ConfigHashSwig.getCPtr(config), config, RequiredPropertiesConfigSwig.getCPtr(properties), properties), true);
  }

  public EngineHashSwig(byte[] data, ConfigHashSwig config, RequiredPropertiesConfigSwig properties) {
    this(DeviceDetectionHashEngineModuleJNI.new_EngineHashSwig__SWIG_1(data, ConfigHashSwig.getCPtr(config), config, RequiredPropertiesConfigSwig.getCPtr(properties), properties), true);
  }

  public ResultsHashSwig process(EvidenceDeviceDetectionSwig evidence, int drift, int difference) {
    long cPtr = DeviceDetectionHashEngineModuleJNI.EngineHashSwig_process__SWIG_0(swigCPtr, this, EvidenceDeviceDetectionSwig.getCPtr(evidence), evidence, drift, difference);
    return (cPtr == 0) ? null : new ResultsHashSwig(cPtr, true);
  }

  public ResultsHashSwig process(String userAgent, int drift, int difference) {
    long cPtr = DeviceDetectionHashEngineModuleJNI.EngineHashSwig_process__SWIG_1(swigCPtr, this, userAgent, drift, difference);
    return (cPtr == 0) ? null : new ResultsHashSwig(cPtr, true);
  }

  public ResultsHashSwig process(EvidenceDeviceDetectionSwig evidence) {
    long cPtr = DeviceDetectionHashEngineModuleJNI.EngineHashSwig_process__SWIG_2(swigCPtr, this, EvidenceDeviceDetectionSwig.getCPtr(evidence), evidence);
    return (cPtr == 0) ? null : new ResultsHashSwig(cPtr, true);
  }

  public ResultsHashSwig process(String userAgent) {
    long cPtr = DeviceDetectionHashEngineModuleJNI.EngineHashSwig_process__SWIG_3(swigCPtr, this, userAgent);
    return (cPtr == 0) ? null : new ResultsHashSwig(cPtr, true);
  }

}
