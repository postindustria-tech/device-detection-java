/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package fiftyone.devicedetection.pattern.engine.onpremise.interop.swig;

public class EvidenceDeviceDetectionSwig extends EvidenceBaseSwig {
  private transient long swigCPtr;

  protected EvidenceDeviceDetectionSwig(long cPtr, boolean cMemoryOwn) {
    super(DeviceDetectionPatternEngineModuleJNI.EvidenceDeviceDetectionSwig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EvidenceDeviceDetectionSwig obj) {
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
        DeviceDetectionPatternEngineModuleJNI.delete_EvidenceDeviceDetectionSwig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public EvidenceDeviceDetectionSwig() {
    this(DeviceDetectionPatternEngineModuleJNI.new_EvidenceDeviceDetectionSwig(), true);
  }

}
