/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package fiftyone.devicedetection.hash.engine.onpremise.interop.swig;

public class ValueMetaDataCollectionSwig implements AutoCloseable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ValueMetaDataCollectionSwig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ValueMetaDataCollectionSwig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        DeviceDetectionHashEngineModuleJNI.delete_ValueMetaDataCollectionSwig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  @Override
  public void close() {
    this.delete();
  }

  public ValueMetaDataSwig getByKey(ValueMetaDataKeySwig key) {
    long cPtr = DeviceDetectionHashEngineModuleJNI.ValueMetaDataCollectionSwig_getByKey(swigCPtr, this, ValueMetaDataKeySwig.getCPtr(key), key);
    return (cPtr == 0) ? null : new ValueMetaDataSwig(cPtr, true);
  }

  public ValueMetaDataSwig getByIndex(long index) {
    long cPtr = DeviceDetectionHashEngineModuleJNI.ValueMetaDataCollectionSwig_getByIndex(swigCPtr, this, index);
    return (cPtr == 0) ? null : new ValueMetaDataSwig(cPtr, true);
  }

  public long getSize() {
    return DeviceDetectionHashEngineModuleJNI.ValueMetaDataCollectionSwig_getSize(swigCPtr, this);
  }

}
