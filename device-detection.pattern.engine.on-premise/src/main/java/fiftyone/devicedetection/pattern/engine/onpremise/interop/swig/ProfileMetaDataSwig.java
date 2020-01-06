/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package fiftyone.devicedetection.pattern.engine.onpremise.interop.swig;

public class ProfileMetaDataSwig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ProfileMetaDataSwig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ProfileMetaDataSwig obj) {
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
        DeviceDetectionPatternEngineModuleJNI.delete_ProfileMetaDataSwig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public long getProfileId() {
    return DeviceDetectionPatternEngineModuleJNI.ProfileMetaDataSwig_getProfileId(swigCPtr, this);
  }

  public long getSignatureCount() {
    return DeviceDetectionPatternEngineModuleJNI.ProfileMetaDataSwig_getSignatureCount(swigCPtr, this);
  }

}
