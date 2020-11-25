/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package fiftyone.devicedetection.hash.engine.onpremise.interop.swig;

public class MetaDataSwig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MetaDataSwig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MetaDataSwig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        DeviceDetectionHashEngineModuleJNI.delete_MetaDataSwig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ComponentMetaDataCollectionSwig getComponents() {
    long cPtr = DeviceDetectionHashEngineModuleJNI.MetaDataSwig_getComponents(swigCPtr, this);
    return (cPtr == 0) ? null : new ComponentMetaDataCollectionSwig(cPtr, true);
  }

  public PropertyMetaDataCollectionSwig getProperties() {
    long cPtr = DeviceDetectionHashEngineModuleJNI.MetaDataSwig_getProperties(swigCPtr, this);
    return (cPtr == 0) ? null : new PropertyMetaDataCollectionSwig(cPtr, true);
  }

  public ProfileMetaDataCollectionSwig getProfiles() {
    long cPtr = DeviceDetectionHashEngineModuleJNI.MetaDataSwig_getProfiles(swigCPtr, this);
    return (cPtr == 0) ? null : new ProfileMetaDataCollectionSwig(cPtr, true);
  }

  public ValueMetaDataCollectionSwig getValues() {
    long cPtr = DeviceDetectionHashEngineModuleJNI.MetaDataSwig_getValues(swigCPtr, this);
    return (cPtr == 0) ? null : new ValueMetaDataCollectionSwig(cPtr, true);
  }

  public ValueMetaDataCollectionSwig getValuesForProperty(PropertyMetaDataSwig property) {
    long cPtr = DeviceDetectionHashEngineModuleJNI.MetaDataSwig_getValuesForProperty(swigCPtr, this, PropertyMetaDataSwig.getCPtr(property), property);
    return (cPtr == 0) ? null : new ValueMetaDataCollectionSwig(cPtr, true);
  }

  public ValueMetaDataCollectionSwig getValuesForProfile(ProfileMetaDataSwig profile) {
    long cPtr = DeviceDetectionHashEngineModuleJNI.MetaDataSwig_getValuesForProfile(swigCPtr, this, ProfileMetaDataSwig.getCPtr(profile), profile);
    return (cPtr == 0) ? null : new ValueMetaDataCollectionSwig(cPtr, true);
  }

  public ComponentMetaDataSwig getComponentForProfile(ProfileMetaDataSwig profile) {
    long cPtr = DeviceDetectionHashEngineModuleJNI.MetaDataSwig_getComponentForProfile(swigCPtr, this, ProfileMetaDataSwig.getCPtr(profile), profile);
    return (cPtr == 0) ? null : new ComponentMetaDataSwig(cPtr, true);
  }

  public ComponentMetaDataSwig getComponentForProperty(PropertyMetaDataSwig property) {
    long cPtr = DeviceDetectionHashEngineModuleJNI.MetaDataSwig_getComponentForProperty(swigCPtr, this, PropertyMetaDataSwig.getCPtr(property), property);
    return (cPtr == 0) ? null : new ComponentMetaDataSwig(cPtr, true);
  }

  public ProfileMetaDataSwig getDefaultProfileForComponent(ComponentMetaDataSwig component) {
    long cPtr = DeviceDetectionHashEngineModuleJNI.MetaDataSwig_getDefaultProfileForComponent(swigCPtr, this, ComponentMetaDataSwig.getCPtr(component), component);
    return (cPtr == 0) ? null : new ProfileMetaDataSwig(cPtr, true);
  }

  public ValueMetaDataSwig getDefaultValueForProperty(PropertyMetaDataSwig property) {
    long cPtr = DeviceDetectionHashEngineModuleJNI.MetaDataSwig_getDefaultValueForProperty(swigCPtr, this, PropertyMetaDataSwig.getCPtr(property), property);
    return (cPtr == 0) ? null : new ValueMetaDataSwig(cPtr, true);
  }

  public PropertyMetaDataCollectionSwig getPropertiesForComponent(ComponentMetaDataSwig component) {
    long cPtr = DeviceDetectionHashEngineModuleJNI.MetaDataSwig_getPropertiesForComponent(swigCPtr, this, ComponentMetaDataSwig.getCPtr(component), component);
    return (cPtr == 0) ? null : new PropertyMetaDataCollectionSwig(cPtr, true);
  }

  public PropertyMetaDataSwig getPropertyForValue(ValueMetaDataSwig value) {
    long cPtr = DeviceDetectionHashEngineModuleJNI.MetaDataSwig_getPropertyForValue(swigCPtr, this, ValueMetaDataSwig.getCPtr(value), value);
    return (cPtr == 0) ? null : new PropertyMetaDataSwig(cPtr, true);
  }

}
