/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package fiftyone.devicedetection.pattern.engine.onpremise.interop.swig;

public class ResultsDeviceDetectionSwig extends ResultsBaseSwig {
  private transient long swigCPtr;

  protected ResultsDeviceDetectionSwig(long cPtr, boolean cMemoryOwn) {
    super(DeviceDetectionPatternEngineModuleJNI.ResultsDeviceDetectionSwig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ResultsDeviceDetectionSwig obj) {
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
        DeviceDetectionPatternEngineModuleJNI.delete_ResultsDeviceDetectionSwig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String getDeviceId() {
    return DeviceDetectionPatternEngineModuleJNI.ResultsDeviceDetectionSwig_getDeviceId(swigCPtr, this);
  }

  public String getUserAgent(long resultIndex) {
    return DeviceDetectionPatternEngineModuleJNI.ResultsDeviceDetectionSwig_getUserAgent(swigCPtr, this, resultIndex);
  }

  public int getUserAgents() {
    return DeviceDetectionPatternEngineModuleJNI.ResultsDeviceDetectionSwig_getUserAgents(swigCPtr, this);
  }

}
