/* *********************************************************************
 * This Original Work is copyright of 51 Degrees Mobile Experts Limited.
 * Copyright 2019 51 Degrees Mobile Experts Limited, 5 Charlotte Close,
 * Caversham, Reading, Berkshire, United Kingdom RG4 7BY.
 *
 * This Original Work is licensed under the European Union Public Licence (EUPL) 
 * v.1.2 and is subject to its terms as set out below.
 *
 * If a copy of the EUPL was not distributed with this file, You can obtain
 * one at https://opensource.org/licenses/EUPL-1.2.
 *
 * The 'Compatible Licences' set out in the Appendix to the EUPL (as may be
 * amended by the European Commission) shall be deemed incompatible for
 * the purposes of the Work and the provisions of the compatibility
 * clause in Article 5 of the EUPL shall not apply.
 * 
 * If using the Work as, or as part of, a network application, by 
 * including the attribution notice(s) required under Article 5 of the EUPL
 * in the end user terms of the application under an appropriate heading, 
 * such notice(s) shall fulfill the requirements of that article.
 * ********************************************************************* */

package fiftyone.devicedetection.shared;
import fiftyone.pipeline.core.data.FlowData;
import fiftyone.pipeline.core.data.types.JavaScript;
import fiftyone.pipeline.engines.data.AspectDataBase;
import fiftyone.pipeline.engines.flowelements.AspectEngine;
import fiftyone.pipeline.engines.data.AspectPropertyValue;
import fiftyone.pipeline.engines.services.MissingPropertyService;
import org.slf4j.Logger;
import java.util.List;
public abstract class DeviceDataBase extends AspectDataBase implements DeviceData
{
    protected DeviceDataBase(
        Logger logger,
        FlowData flowData,
        AspectEngine engine,
        MissingPropertyService missingPropertyService) {
        super(logger, flowData, engine, missingPropertyService);
    }
    @Override
    public AspectPropertyValue<String> getDeviceId() { return getAs("deviceid", AspectPropertyValue.class, String.class); }
    @Override
    public AspectPropertyValue<Integer> getDifference() { return getAs("difference", AspectPropertyValue.class, Integer.class); }
    @Override
    public AspectPropertyValue<List<String>> getUserAgents() { return getAs("useragents", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the resolution of the device's back camera in megapixels. For a device that has a rotating camera the same value is returned for front and back megapixels properties.
     */
    @Override
    public AspectPropertyValue<Double> getBackCameraMegaPixels() { return getAs("backcameramegapixels", AspectPropertyValue.class, Double.class); }
    /**
     * Indicates the capacity of the device's standard battery in mAh. This property is not applicable for a device that does not have a battery.
     */
    @Override
    public AspectPropertyValue<Integer> getBatteryCapacity() { return getAs("batterycapacity", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the number of bits used to describe the colour of each individual pixel, also known as bit depth or colour depth.
     */
    @Override
    public AspectPropertyValue<Integer> getBitsPerPixel() { return getAs("bitsperpixel", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the list of camera types the device has. If the device has a rotating camera, this property refers to both front and back facing cameras.
     */
    @Override
    public AspectPropertyValue<List<String>> getCameraTypes() { return getAs("cameratypes", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the contrast ratio of the device. This property is applicable only for TVs.
     */
    @Override
    public AspectPropertyValue<String> getContrastRatio() { return getAs("contrastratio", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the official name of the CPU within the SoC, e.g. ARM Cortex A9 or Krait (Qualcomm).
     */
    @Override
    public AspectPropertyValue<String> getCPU() { return getAs("cpu", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the number of physical CPU cores the device has.
     */
    @Override
    public AspectPropertyValue<Integer> getCPUCores() { return getAs("cpucores", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the Semiconductor Company that designed the CPU.
     */
    @Override
    public AspectPropertyValue<String> getCPUDesigner() { return getAs("cpudesigner", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the maximum frequency of the CPU of the device in gigahertz (GHz).
     */
    @Override
    public AspectPropertyValue<Double> getCPUMaximumFrequency() { return getAs("cpumaximumfrequency", AspectPropertyValue.class, Double.class); }
    /**
     * Indicates what certifications apply to this device.
     */
    @Override
    public AspectPropertyValue<List<String>> getDeviceCertifications() { return getAs("devicecertifications", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the maximum volatile RAM capacity of the device in megabytes (MB). Where a device has different RAM capacity options, the largest option available is returned.
     */
    @Override
    public AspectPropertyValue<Integer> getDeviceRAM() { return getAs("deviceram", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the volatile RAM capacity options for the device in megabytes (MB). If no variants are found, then the value returned will be the same as "DeviceRAM".
     */
    @Override
    public AspectPropertyValue<List<String>> getDeviceRAMVariants() { return getAs("deviceramvariants", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the type of the device based on values set in other properties, such as IsMobile, IsTablet, IsSmartphone, IsSmallScreen etc.
     */
    @Override
    public AspectPropertyValue<String> getDeviceType() { return getAs("devicetype", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the device's Ingress Protection Rating against dust and water (http://en.wikipedia.org/wiki/IP_Code).
     */
    @Override
    public AspectPropertyValue<List<String>> getDurability() { return getAs("durability", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the dynamic contrast ratio of the device's screen. This property is applicable only for TVs.
     */
    @Override
    public AspectPropertyValue<String> getDynamicContrastRatio() { return getAs("dynamiccontrastratio", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the annual energy consumption of the device per year in kWh. This property is applicable only for TVs.
     */
    @Override
    public AspectPropertyValue<Integer> getEnergyConsumptionPerYear() { return getAs("energyconsumptionperyear", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the maximum amount of memory in gigabytes (GB) the expansion slot of the device can support.
     */
    @Override
    public AspectPropertyValue<Integer> getExpansionSlotMaxSize() { return getAs("expansionslotmaxsize", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the expansion slot type the device can support.
     */
    @Override
    public AspectPropertyValue<List<String>> getExpansionSlotType() { return getAs("expansionslottype", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the resolution of the device's front camera in megapixels. For a device that has a rotating camera the same value is returned for front and back megapixels' properties.
     */
    @Override
    public AspectPropertyValue<Double> getFrontCameraMegaPixels() { return getAs("frontcameramegapixels", AspectPropertyValue.class, Double.class); }
    /**
     * Indicates the official name of the graphical chip within the SoC.
     */
    @Override
    public AspectPropertyValue<String> getGPU() { return getAs("gpu", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the Semiconductor Company that designed the GPU.
     */
    @Override
    public AspectPropertyValue<String> getGPUDesigner() { return getAs("gpudesigner", AspectPropertyValue.class, String.class); }
    /**
     * Refers to the list of audio codecs supported for decoding by a Chipset. An audio codec is a program used to playback digital audio files. The values of this property are the codec's common name.
     */
    @Override
    public AspectPropertyValue<List<String>> getHardwareAudioCodecsDecode() { return getAs("hardwareaudiocodecsdecode", AspectPropertyValue.class, List.class); }
    /**
     * Refers to the list of audio codecs supported for encoding by a Chipset. An audio codec is a program used to capture digital audio files. The values of this property are the codec's common name.
     */
    @Override
    public AspectPropertyValue<List<String>> getHardwareAudioCodecsEncode() { return getAs("hardwareaudiocodecsencode", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the carrier when the device is sold by the HardwareVendor on a single carrier or as indicated via device User-Agent.
     */
    @Override
    public AspectPropertyValue<String> getHardwareCarrier() { return getAs("hardwarecarrier", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the name of a group of devices that only differ by model or region but are marketed under the same name, e.g. Galaxy Tab S 10.5.
     */
    @Override
    public AspectPropertyValue<String> getHardwareFamily() { return getAs("hardwarefamily", AspectPropertyValue.class, String.class); }
    /**
     * A list of images associated with the device. The string contains the caption, followed by the full image URL separated with a tab character.
     */
    @Override
    public AspectPropertyValue<List<String>> getHardwareImages() { return getAs("hardwareimages", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the model name or number used primarily by the hardware vendor to identify the device, e.g.SM-T805S. When a model identifier is not available the HardwareName will be used.
     */
    @Override
    public AspectPropertyValue<String> getHardwareModel() { return getAs("hardwaremodel", AspectPropertyValue.class, String.class); }
    /**
     * Indicates all model numbers used by the hardware vendor to identify the device. This property compliments 'HardwareModel', e.g. Hardware Model Variants A1660 and A1778 correlate to the Hardware Model - iPhone 7.
     */
    @Override
    public AspectPropertyValue<List<String>> getHardwareModelVariants() { return getAs("hardwaremodelvariants", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the primary marketing name associated with the device, e.g. Xperia Z5.
     */
    @Override
    public AspectPropertyValue<List<String>> getHardwareName() { return getAs("hardwarename", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the source of the profile's specifications. This property will return 'Manufacturer' value if the profile data was obtained from the manufacturer of the device or the device itself. This property will return 'Authoritative' value if the profile data was not obtained from the manufacturer or the device itself but other third party sources (this may include retailers, social media, carriers, etc). This property will return 'Legacy' value if the profile data was obtained prior to 51degrees differentiating between Manufacturer and Authoritative. This property will return 'N/A' value if the profile data was not obtained due to unidentifiable User-Agent. The example profiles are: Generic Android Unknown, Unknown Tablet, etc.
     */
    @Override
    public AspectPropertyValue<String> getHardwareProfileSource() { return getAs("hardwareprofilesource", AspectPropertyValue.class, String.class); }
    /**
     * A measure of the popularity of this device model. All models are ordered by the number of events associated with that model that occurred in the sampling period. The device with the most events is ranked 1, the second 2 and so on.
     */
    @Override
    public AspectPropertyValue<Integer> getHardwareRank() { return getAs("hardwarerank", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the name of the company that manufactures the device or primarily sells it, e.g. Samsung.
     */
    @Override
    public AspectPropertyValue<String> getHardwareVendor() { return getAs("hardwarevendor", AspectPropertyValue.class, String.class); }
    /**
     * Refers to the list of video codecs supported for decoding by a Chipset. An video codec is a program used to playback digital video files. The values of this property are the codec's common name.
     */
    @Override
    public AspectPropertyValue<List<String>> getHardwareVideoCodecsDecode() { return getAs("hardwarevideocodecsdecode", AspectPropertyValue.class, List.class); }
    /**
     * Refers to the list of video codecs supported for encoding by a Chipset. An video codec is a program used to capture digital video files. The values of this property are the codec's common name.
     */
    @Override
    public AspectPropertyValue<List<String>> getHardwareVideoCodecsEncode() { return getAs("hardwarevideocodecsencode", AspectPropertyValue.class, List.class); }
    /**
     * Indicates if the device has a camera capable of taking 3D images.
     */
    @Override
    public AspectPropertyValue<Boolean> getHas3DCamera() { return getAs("has3dcamera", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device has a screen capable of displaying 3D images.
     */
    @Override
    public AspectPropertyValue<Boolean> getHas3DScreen() { return getAs("has3dscreen", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device has a camera.
     */
    @Override
    public AspectPropertyValue<Boolean> getHasCamera() { return getAs("hascamera", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device has a click wheel such as found on Apple iPod devices.
     */
    @Override
    public AspectPropertyValue<Boolean> getHasClickWheel() { return getAs("hasclickwheel", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device has a physical numeric keypad.
     */
    @Override
    public AspectPropertyValue<Boolean> getHasKeypad() { return getAs("haskeypad", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device has embedded NFC (Near Field Communication) wireless technology.
     */
    @Override
    public AspectPropertyValue<Boolean> getHasNFC() { return getAs("hasnfc", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device has a physical qwerty keyboard.
     */
    @Override
    public AspectPropertyValue<Boolean> getHasQwertyPad() { return getAs("hasqwertypad", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device has a removable battery. This property is not applicable for devices that do not have batteries. Unless otherwise stated this property will return a 'False' value for tablets.
     */
    @Override
    public AspectPropertyValue<Boolean> getHasRemovableBattery() { return getAs("hasremovablebattery", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device has a touch screen. This property will return 'False' for a device that does not have an integrated screen.
     */
    @Override
    public AspectPropertyValue<Boolean> getHasTouchScreen() { return getAs("hastouchscreen", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device has a trackpad or trackball. Examples of devices that support this property are the Nexus One and Blackberry Curve.
     */
    @Override
    public AspectPropertyValue<Boolean> getHasTrackPad() { return getAs("hastrackpad", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device has a virtual qwerty keyboard capability.
     */
    @Override
    public AspectPropertyValue<Boolean> getHasVirtualQwerty() { return getAs("hasvirtualqwerty", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates the internal persistent storage (ROM capacity) options the device can be supplied with in gigabytes (GB), including the device's Operating System and bundled applications. This could also be referred to as "Electrically Erasable Programmable Read-Only Memory (EEPROM)" or "Non Volatile Random Access Memory (NVRAM)". If no variants are found, then the value returned will be the same as "MaxInternalStorage".
     */
    @Override
    public AspectPropertyValue<List<String>> getInternalStorageVariants() { return getAs("internalstoragevariants", AspectPropertyValue.class, List.class); }
    /**
     * Indicates if the device is primarily a game console, such as an Xbox or Playstation.
     */
    @Override
    public AspectPropertyValue<Boolean> getIsConsole() { return getAs("isconsole", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device is primarily advertised as an e-reader. If the device type is EReader then the device is not classified as a tablet.
     */
    @Override
    public AspectPropertyValue<Boolean> getIsEReader() { return getAs("isereader", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates a profile which contains more than a single hardware device. When this is true all returned properties represent the default value or lowest given specification of all grouped devices. E.g. the profile representing unknown Windows 10 tablets will return true. Apple devices detected through JavascriptHardwareProfile that do not uniquely identify a device will also return true, and HardwareModelVariants will return a list of model numbers associated with that device group.
     */
    @Override
    public AspectPropertyValue<Boolean> getIsHardwareGroup() { return getAs("ishardwaregroup", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device is a media hub or set top box that requires an external display(s).
     */
    @Override
    public AspectPropertyValue<Boolean> getIsMediaHub() { return getAs("ismediahub", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device's primary data connection is wireless and the device is designed to operate mostly by battery power (e.g. mobile phone, smartphone or tablet). This property does not indicate if the device is a mobile phone or not. Laptops are not classified as mobile devices under this definition and so 'IsMobile' will be 'False'.
     */
    @Override
    public AspectPropertyValue<Boolean> getIsMobile() { return getAs("ismobile", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device is a mobile with a screen size less than 2.5 inches even where the device is marketed as a Smartphone.
     */
    @Override
    public AspectPropertyValue<Boolean> getIsSmallScreen() { return getAs("issmallscreen", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates whether the device can make and receive phone calls, has a screen size greater than or equal to 2.5 inches, runs a modern operating system (Android, iOS, Windows Phone, BlackBerry etc.), is not designed to be a wearable technology and is marketed by the vendor as a Smartphone.
     */
    @Override
    public AspectPropertyValue<Boolean> getIsSmartPhone() { return getAs("issmartphone", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device is a web enabled computerised wristwatch with other capabilities beyond timekeeping, such as push notifications. It runs on a Smart Operating System i.e. Android, WatchOS, Tizen, Ubuntu Touch and is designed to be wearable technology.
     */
    @Override
    public AspectPropertyValue<Boolean> getIsSmartWatch() { return getAs("issmartwatch", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device is primarily marketed as a tablet or phablet and has a screen size equal to or greater than 7 inches.
     */
    @Override
    public AspectPropertyValue<Boolean> getIsTablet() { return getAs("istablet", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device is a TV running on a smart operating system e.g. Android.
     */
    @Override
    public AspectPropertyValue<Boolean> getIsTv() { return getAs("istv", AspectPropertyValue.class, Boolean.class); }
    /**
     * JavaScript that can override the profile found by the server using information on the client device. This property is applicable for Apple devices which do not provide information about the model in the User-Agent string.
     */
    @Override
    public AspectPropertyValue<JavaScript> getJavascriptHardwareProfile() { return getAs("javascripthardwareprofile", AspectPropertyValue.class, JavaScript.class); }
    /**
     * Indicates the maximum amount of internal persistent storage (ROM capacity) with which the device is supplied in gigabytes (GB), including the space used by the device's Operating System and bundled applications. This could also be referred to as "Electrically Erasable Programmable Read-Only Memory (EEPROM)" or "Non Volatile Random Access Memory (NVRAM)". Where a device has different internal storage options, the largest option available is returned.
     */
    @Override
    public AspectPropertyValue<Double> getMaxInternalStorage() { return getAs("maxinternalstorage", AspectPropertyValue.class, Double.class); }
    /**
     * Indicates the maximum number of "Universal Integrated Circuit Cards (UICC - more commonly known as, SIM)" the device can support including both removable and embedded. If the device doesn't support any UICC then a value of '0' is returned.
     */
    @Override
    public AspectPropertyValue<Integer> getMaxNumberOfSIMCards() { return getAs("maxnumberofsimcards", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the maximum standby time of the device in hours. This property is not applicable for a device without a battery.
     */
    @Override
    public AspectPropertyValue<Integer> getMaxStandbyTime() { return getAs("maxstandbytime", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the maximum talk time of the device in minutes. This property is not applicable for a device that does not have a battery or support phone calls.
     */
    @Override
    public AspectPropertyValue<Integer> getMaxTalkTime() { return getAs("maxtalktime", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the maximum general usage time of the device in minutes. This property is not applicable for a device without a battery.
     */
    @Override
    public AspectPropertyValue<Integer> getMaxUsageTime() { return getAs("maxusagetime", AspectPropertyValue.class, Integer.class); }
    /**
     * Refers to the 'Retail Branding' value returned for Android Google Play native applications, when the android.os.Build.BRAND javascript is used to display the class. This property is not applicable for hardware running on operating systems other than Android.
     */
    @Override
    public AspectPropertyValue<List<String>> getNativeBrand() { return getAs("nativebrand", AspectPropertyValue.class, List.class); }
    /**
     * Refers to the 'Device' value returned for Android Google Play native applications, when the android.os.Build.DEVICE javascript is used to display the class. This property is not applicable for hardware running on operating systems other than Android.
     */
    @Override
    public AspectPropertyValue<List<String>> getNativeDevice() { return getAs("nativedevice", AspectPropertyValue.class, List.class); }
    /**
     * Refers to the 'Model' value returned for Android Google Play native applications, when the android.os.Build.MODEL javascript is used to display the class. For Apple devices this property refers to the device identifier which appears in the native application from the developer usage log, for example 'iPad5,4'.
     */
    @Override
    public AspectPropertyValue<List<String>> getNativeModel() { return getAs("nativemodel", AspectPropertyValue.class, List.class); }
    /**
     * NativeName Refers to the 'Marketing Name' value that a device is registered with on the Google Play service. This property is not applicable for hardware running on operating systems other than Android.
     */
    @Override
    public AspectPropertyValue<List<String>> getNativeName() { return getAs("nativename", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the name of the mobile operating system (iOS, Android) for which an application program has been developed to be used by a device.
     */
    @Override
    public AspectPropertyValue<String> getNativePlatform() { return getAs("nativeplatform", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the name of the company that manufactures the device.
     */
    @Override
    public AspectPropertyValue<String> getOEM() { return getAs("oem", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the power consumption of the device while switched on. This property is applicable only for TVs.
     */
    @Override
    public AspectPropertyValue<Integer> getOnPowerConsumption() { return getAs("onpowerconsumption", AspectPropertyValue.class, Integer.class); }
    /**
     * Refers to the number of unique client IPs from which this device has been seen.
     */
    @Override
    public AspectPropertyValue<String> getPopularity() { return getAs("popularity", AspectPropertyValue.class, String.class); }
    /**
     * Indicates a price range describing the recommended retail price of the device at the date of release, inclusive of tax (where applicable).  Prices are in United States Dollars (USD); if the price is not originally in USD it will be converted to USD using the relevant exchange rate at the time of launch. Prices are for the SIM-free version of the device (if applicable). In cases where there are several versions of the same model of the device, the price will reflect the device that was used to populate the specifications.
     */
    @Override
    public AspectPropertyValue<String> getPriceBand() { return getAs("priceband", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the number of frames per second the television can display in Hertz. This property is applicable only for TVs.
     */
    @Override
    public AspectPropertyValue<Integer> getRefreshRate() { return getAs("refreshrate", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the age in months of the device since the ReleaseYear and ReleaseMonth.
     */
    @Override
    public AspectPropertyValue<Integer> getReleaseAge() { return getAs("releaseage", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the month in which the device was released or the month in which the device was first seen by 51Degrees (if the release date cannot be identified).
     */
    @Override
    public AspectPropertyValue<String> getReleaseMonth() { return getAs("releasemonth", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the year in which the device was released or the year in which the device was first seen by 51Degrees (if the release date cannot be identified).
     */
    @Override
    public AspectPropertyValue<Integer> getReleaseYear() { return getAs("releaseyear", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates  the device's supported satellite navigation types.
     */
    @Override
    public AspectPropertyValue<List<String>> getSatelliteNavigationTypes() { return getAs("satellitenavigationtypes", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the diagonal size of the device's screen in inches. This property is not applicable for a device that does not have a screen.
     */
    @Override
    public AspectPropertyValue<Double> getScreenInchesDiagonal() { return getAs("screeninchesdiagonal", AspectPropertyValue.class, Double.class); }
    /**
     * Indicates the diagonal size of the device's screen in inches rounded to the nearest whole number. This property will return the value 'Unknown' for desktop or for devices which do not have an integrated screen.
     */
    @Override
    public AspectPropertyValue<Integer> getScreenInchesDiagonalRounded() { return getAs("screeninchesdiagonalrounded", AspectPropertyValue.class, Integer.class); }
    /**
     * Refers to the height of the device's screen in inches. This property will return 'Unknown' for desktops or for devices which do not have an integrated screen.
     */
    @Override
    public AspectPropertyValue<Double> getScreenInchesHeight() { return getAs("screeninchesheight", AspectPropertyValue.class, Double.class); }
    /**
     * Indicates the area of the device's screen in square inches rounded to the nearest whole number. This property will return the value 'Unknown' for desktop or for devices which do not have an integrated screen.
     */
    @Override
    public AspectPropertyValue<Integer> getScreenInchesSquare() { return getAs("screeninchessquare", AspectPropertyValue.class, Integer.class); }
    /**
     * Refers to the width of the device's screen in inches. This property will return the value 'Unknown' for desktop or for devices which do not have an integrated screen.
     */
    @Override
    public AspectPropertyValue<Double> getScreenInchesWidth() { return getAs("screenincheswidth", AspectPropertyValue.class, Double.class); }
    /**
     * Refers to the diagonal size of the screen of the device in millimetres. This property will return 'Unknown' for desktops or for devices which do not have an integrated screen.
     */
    @Override
    public AspectPropertyValue<Double> getScreenMMDiagonal() { return getAs("screenmmdiagonal", AspectPropertyValue.class, Double.class); }
    /**
     * Indicate the diagonal size of the device's screen in millimetres rounded to the nearest whole number. This property will return the value 'Unknown' for desktop or for devices which do not have an integrated screen.
     */
    @Override
    public AspectPropertyValue<Integer> getScreenMMDiagonalRounded() { return getAs("screenmmdiagonalrounded", AspectPropertyValue.class, Integer.class); }
    /**
     * Refers to the screen height of the device in millimetres. This property will return 'Unknown' for desktops or for devices which do not have an integrated screen.
     */
    @Override
    public AspectPropertyValue<Double> getScreenMMHeight() { return getAs("screenmmheight", AspectPropertyValue.class, Double.class); }
    /**
     * Indicates the area of the device's screen in square millimetres rounded to the nearest whole number. This property will return the value  'Unknown' for desktop or for devices which do not have an integrated screen.
     */
    @Override
    public AspectPropertyValue<Integer> getScreenMMSquare() { return getAs("screenmmsquare", AspectPropertyValue.class, Integer.class); }
    /**
     * Refers to the screen width of the device in millimetres. This property will return 'Unknown' for desktops or for devices which do not have an integrated screen.
     */
    @Override
    public AspectPropertyValue<Double> getScreenMMWidth() { return getAs("screenmmwidth", AspectPropertyValue.class, Double.class); }
    /**
     * Indicates the height of the device's screen in pixels.This property is not applicable for a device that does not have a screen. For devices such as tablets or TV which are predominantly used in landscape mode, the pixel height will be the smaller value compared to the pixel width.
     */
    @Override
    public AspectPropertyValue<Integer> getScreenPixelsHeight() { return getAs("screenpixelsheight", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the width of the device's screen in pixels. This property is not applicable for a device that does not have a screen. For devices such as tablets or TV which are predominantly used in landscape mode, the pixel width will be the larger value compared to the pixel height.
     */
    @Override
    public AspectPropertyValue<Integer> getScreenPixelsWidth() { return getAs("screenpixelswidth", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the screen type of the device. This property is not applicable for a device that does not have an integrated screen, e.g. a media hub. If the device manufacturer or vendor does not specify what the screen type of the device is then it is assumed the device has an LCD screen.
     */
    @Override
    public AspectPropertyValue<String> getScreenType() { return getAs("screentype", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the resolution of the device's second back camera in megapixels.
     */
    @Override
    public AspectPropertyValue<String> getSecondBackCameraMegaPixels() { return getAs("secondbackcameramegapixels", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the resolution of the device's second front camera in megapixels.
     */
    @Override
    public AspectPropertyValue<String> getSecondFrontCameraMegaPixels() { return getAs("secondfrontcameramegapixels", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the primary marketing name of the System on Chip (chipset) which includes the CPU, GPU and modem. e.g. Snapdragon S4
     */
    @Override
    public AspectPropertyValue<String> getSoC() { return getAs("soc", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the Semiconductor Company that designed the System on Chip (chipset) e.g. Qualcomm, Intel or Mediatek.
     */
    @Override
    public AspectPropertyValue<String> getSoCDesigner() { return getAs("socdesigner", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the official model of the System on Chip (chipset) e.g. MSM8625, MT8312.
     */
    @Override
    public AspectPropertyValue<String> getSoCModel() { return getAs("socmodel", AspectPropertyValue.class, String.class); }
    /**
     * The Specific Absorbtion Rate (SAR) is a measure of the rate at which energy is absorbed by the human body when exposed by a radio frequency electromagnetic field. This property contains values in Watts per Kilogram (W/kg) in accordance with the European Committee for Electrotechnical Standardization (CENELEC).
     */
    @Override
    public AspectPropertyValue<String> getSpecificAbsorbtionRateEU() { return getAs("specificabsorbtionrateeu", AspectPropertyValue.class, String.class); }
    /**
     * The Specific Absorbtion Rate (SAR) is a measure of the rate at which energy is absorbed by the human body when exposed by a radio frequency electromagnetic field. This property contains values in Watts per Kilogram (W/kg) in accordance with the Federal Communications Commission (FCC).
     */
    @Override
    public AspectPropertyValue<Integer> getSpecificAbsorbtionRateUS() { return getAs("specificabsorbtionrateus", AspectPropertyValue.class, Integer.class); }
    /**
     * Refers to the suggested optimum height of a button in millimetres. Ensures the button is touchable on a touch screen and not too large on a non-touch screen. Assumes the actual device DPI (Dots Per Inch) is being used.
     */
    @Override
    public AspectPropertyValue<Double> getSuggestedImageButtonHeightMms() { return getAs("suggestedimagebuttonheightmms", AspectPropertyValue.class, Double.class); }
    /**
     * Refers to the suggested optimum height of a button in millimetres. Ensures the button is touchable on a touch screen and not too large on a non-touch screen.
     */
    @Override
    public AspectPropertyValue<Double> getSuggestedImageButtonHeightPixels() { return getAs("suggestedimagebuttonheightpixels", AspectPropertyValue.class, Double.class); }
    /**
     * Refers to the suggested optimum height of a hyperlink in pixels. Ensures the link is touchable on a touch screen and not too large on a non-touch screen. Assumes the actual device DPI is being used.
     */
    @Override
    public AspectPropertyValue<Double> getSuggestedLinkSizePixels() { return getAs("suggestedlinksizepixels", AspectPropertyValue.class, Double.class); }
    /**
     * Refers to the suggested optimum height of a hyperlink in points. Ensures the link is touchable on a touch screen and not too large on a non-touch screen.
     */
    @Override
    public AspectPropertyValue<Double> getSuggestedLinkSizePoints() { return getAs("suggestedlinksizepoints", AspectPropertyValue.class, Double.class); }
    /**
     * Indicate the list of wireless data technologies supported by the device, including Bluetooth. If the device supports phone calls, the SMS value is also returned.
     */
    @Override
    public AspectPropertyValue<List<String>> getSupportedBearers() { return getAs("supportedbearers", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the highest version of Bluetooth the device supports.
     */
    @Override
    public AspectPropertyValue<String> getSupportedBluetoothVersion() { return getAs("supportedbluetoothversion", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the list of features the device's camera supports.
     */
    @Override
    public AspectPropertyValue<List<String>> getSupportedCameraFeatures() { return getAs("supportedcamerafeatures", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the list of charger types supported by the device. For devices that operate via mains power only, e.g. TVs, MediaHubs (which technically aren't being charged) this property is not applicable.
     */
    @Override
    public AspectPropertyValue<List<String>> getSupportedChargerTypes() { return getAs("supportedchargertypes", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the list of input and output communications the device can support, for example 3.5mm audio jack, micro-USB etc.
     */
    @Override
    public AspectPropertyValue<List<String>> getSupportedIO() { return getAs("supportedi/o", AspectPropertyValue.class, List.class); }
    /**
     * Indicates the list of sensors supported by the device. This property may be not applicable for devices without sensors, such as most feature phones and media hubs.
     */
    @Override
    public AspectPropertyValue<List<String>> getSupportedSensorTypes() { return getAs("supportedsensortypes", AspectPropertyValue.class, List.class); }
    /**
     * Indicates whether the "Universal Integrated Circuit Card (UICC - more commonly known as, SIM)" is removable or embedded. If removable, the form factor of the UICC is returned.
     */
    @Override
    public AspectPropertyValue<List<String>> getSupportedSIMCardTypes() { return getAs("supportedsimcardtypes", AspectPropertyValue.class, List.class); }
    /**
     * Indicates if the device supports 24p; a video format that operates at 24 frames per second. This property is applicable only for TVs.
     */
    @Override
    public AspectPropertyValue<Boolean> getSupports24p() { return getAs("supports24p", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device can receive and make telephone calls using available bearers without any additional software such as VoIP. Devices that support voice calls do not necessarily support phone calls.
     */
    @Override
    public AspectPropertyValue<Boolean> getSupportsPhoneCalls() { return getAs("supportsphonecalls", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the device supports Wireless Display Technology. This property is only applicable for TVs.
     */
    @Override
    public AspectPropertyValue<Boolean> getSupportsWiDi() { return getAs("supportswidi", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates the weight of the device with battery in grams.
     */
    @Override
    public AspectPropertyValue<String> getWeightWithBattery() { return getAs("weightwithbattery", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the weight of the device without battery in grams.
     */
    @Override
    public AspectPropertyValue<String> getWeightWithoutBattery() { return getAs("weightwithoutbattery", AspectPropertyValue.class, String.class); }
    /**
     * Stands for Composite Capability/Preference Profiles.  Refers to the list of MIME types supported by the operating system. The list does not include MIME types that are only enabled through the use of 3rd party applications.
     */
    @Override
    public AspectPropertyValue<List<String>> getCcppAccept() { return getAs("ccppaccept", AspectPropertyValue.class, List.class); }
    /**
     * Indicates which version of the Connected Limited Device Configuration the device supports for use with Java ME.
     */
    @Override
    public AspectPropertyValue<Double> getCLDC() { return getAs("cldc", AspectPropertyValue.class, Double.class); }
    /**
     * Indicates which version of Mobile Information Device Profile the device supports, used with Java ME and CLDC.
     */
    @Override
    public AspectPropertyValue<Double> getMIDP() { return getAs("midp", AspectPropertyValue.class, Double.class); }
    /**
     * Indicates the age in months of the operating system since the PlatformReleaseYear and PlatformReleaseMonth.
     */
    @Override
    public AspectPropertyValue<Integer> getPlatformDiscontinuedAge() { return getAs("platformdiscontinuedage", AspectPropertyValue.class, Integer.class); }
    /**
     * The month in which further development for the platform version is stopped by the platform vendor. This occurs when a new stable version of the platform is released.
     */
    @Override
    public AspectPropertyValue<String> getPlatformDiscontinuedMonth() { return getAs("platformdiscontinuedmonth", AspectPropertyValue.class, String.class); }
    /**
     * The year in which further development for the platform version is stopped by the platform vendor. This occurs when a new stable version of the platform is released.
     */
    @Override
    public AspectPropertyValue<String> getPlatformDiscontinuedYear() { return getAs("platformdiscontinuedyear", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the name of the operating system the device is using.
     */
    @Override
    public AspectPropertyValue<String> getPlatformName() { return getAs("platformname", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the age in months of the operating system since the PlatformPreviewYear and PlatformPreviewMonth.
     */
    @Override
    public AspectPropertyValue<Integer> getPlatformPreviewAge() { return getAs("platformpreviewage", AspectPropertyValue.class, Integer.class); }
    /**
     * The month in which the platform version was originally released as a Beta/Developer version by the platform vendor. This is before it is officially released as a stable version, to ensure wider testing by the community can take place.
     */
    @Override
    public AspectPropertyValue<String> getPlatformPreviewMonth() { return getAs("platformpreviewmonth", AspectPropertyValue.class, String.class); }
    /**
     * The year in which the platform version was originally released as a Beta/Developer version by the platform vendor. This is before it is officially released as a stable version, to ensure wider testing by the community can take place.
     */
    @Override
    public AspectPropertyValue<String> getPlatformPreviewYear() { return getAs("platformpreviewyear", AspectPropertyValue.class, String.class); }
    /**
     * A measure of the popularity of this software platform (i.e. OS and version). All platforms are ordered by the number of events associated with that platform that occurred in the sampling period. The platform with the most events is ranked 1, the second 2 and so on.
     */
    @Override
    public AspectPropertyValue<Integer> getPlatformRank() { return getAs("platformrank", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the age in months of the operating system since the PlatformReleaseYear and PlatformReleaseMonth.
     */
    @Override
    public AspectPropertyValue<Integer> getPlatformReleaseAge() { return getAs("platformreleaseage", AspectPropertyValue.class, Integer.class); }
    /**
     * The month in which the platform version was officially released to users by the platform vendor. This version is called the stable version as any bugs or difficulties highlighted in the Beta/Developer version will have been fixed for this release.
     */
    @Override
    public AspectPropertyValue<String> getPlatformReleaseMonth() { return getAs("platformreleasemonth", AspectPropertyValue.class, String.class); }
    /**
     * The year in which the platform version was officially released to users by the platform vendor. This version is called the stable version as any bugs or difficulties highlighted in the Beta/Developer Version will have been fixed for this release.
     */
    @Override
    public AspectPropertyValue<String> getPlatformReleaseYear() { return getAs("platformreleaseyear", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the name of the company that developed the operating system.
     */
    @Override
    public AspectPropertyValue<String> getPlatformVendor() { return getAs("platformvendor", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the version or subversion of the software platform.
     */
    @Override
    public AspectPropertyValue<String> getPlatformVersion() { return getAs("platformversion", AspectPropertyValue.class, String.class); }
    /**
     * Refers to the list of audio codecs supported by an operating system. This list of codecs is supported for playback on a  basic software installation. The values of this property are the codec's common name.
     */
    @Override
    public AspectPropertyValue<List<String>> getSoftwareAudioCodecsDecode() { return getAs("softwareaudiocodecsdecode", AspectPropertyValue.class, List.class); }
    /**
     * Refers to the list of audio codecs supported by an operating system. This list of codecs is supported for capture on a basic software installation. The values of this property are the codec's common name.
     */
    @Override
    public AspectPropertyValue<List<String>> getSoftwareAudioCodecsEncode() { return getAs("softwareaudiocodecsencode", AspectPropertyValue.class, List.class); }
    /**
     * Refers to the list of video codecs supported by an operating system. This list of codecs is supported for playback on a  basic software installation. The values of this property are the codec's common name.
     */
    @Override
    public AspectPropertyValue<List<String>> getSoftwareVideoCodecsDecode() { return getAs("softwarevideocodecsdecode", AspectPropertyValue.class, List.class); }
    /**
     * Refers to the list of video codecs supported by an operating system. This list of codecs is supported for capture on a basic software installation. The values of this property are the codec's common name.
     */
    @Override
    public AspectPropertyValue<List<String>> getSoftwareVideoCodecsEncode() { return getAs("softwarevideocodecsencode", AspectPropertyValue.class, List.class); }
    /**
     * A list of MIME types the device can stream. The list does not include MIME types that are only supported through the use of 3rd party applications.
     */
    @Override
    public AspectPropertyValue<List<String>> getStreamingAccept() { return getAs("streamingaccept", AspectPropertyValue.class, List.class); }
    /**
     * Indicates what ajax request format should be used.
     */
    @Override
    public AspectPropertyValue<String> getAjaxRequestType() { return getAs("ajaxrequesttype", AspectPropertyValue.class, String.class); }
    /**
     * Indicates if the browser supports 'window.requestAnimationFrame()' method.
     */
    @Override
    public AspectPropertyValue<Boolean> getAnimationTiming() { return getAs("animationtiming", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser fully supports BlobBuilder, containing a BlobBuilder interface, a FileSaver interface, a FileWriter interface, and a FileWriterSync interface.
     */
    @Override
    public AspectPropertyValue<Boolean> getBlobBuilder() { return getAs("blobbuilder", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates the age in months of the browser since the BrowserDiscontinuedYear and BrowserDiscontinuedMonth.
     */
    @Override
    public AspectPropertyValue<Integer> getBrowserDiscontinuedAge() { return getAs("browserdiscontinuedage", AspectPropertyValue.class, Integer.class); }
    /**
     * The month in which further development of the browser version is stopped by the browser vendor.  This occurs when a new stable version of the brower is released.
     */
    @Override
    public AspectPropertyValue<String> getBrowserDiscontinuedMonth() { return getAs("browserdiscontinuedmonth", AspectPropertyValue.class, String.class); }
    /**
     * The year in which further development of the browser version is stopped by the browser vendor.  This occurs when a new stable version of the brower is released.
     */
    @Override
    public AspectPropertyValue<String> getBrowserDiscontinuedYear() { return getAs("browserdiscontinuedyear", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the name of the browser. Many mobile browsers, by default, come with an operating system (OS). Unless specifically named, these browsers are named after the accompanying OS and/or the layout engine.
     */
    @Override
    public AspectPropertyValue<String> getBrowserName() { return getAs("browsername", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the age in months of the browser since the BrowserPreviewYear and BrowserPreviewMonth.
     */
    @Override
    public AspectPropertyValue<Integer> getBrowserPreviewAge() { return getAs("browserpreviewage", AspectPropertyValue.class, Integer.class); }
    /**
     * The month in which the browser version is originally released as a Beta/Developer version by the browser vendor. This is before it is officially released as a stable version, to ensure wider testing by the community can take place.
     */
    @Override
    public AspectPropertyValue<String> getBrowserPreviewMonth() { return getAs("browserpreviewmonth", AspectPropertyValue.class, String.class); }
    /**
     * The year in which the browser version is originally released as a Beta/Developer version by the browser vendor. This is before it is officially released as a stable version, to ensure wider testing by the community can take place.
     */
    @Override
    public AspectPropertyValue<String> getBrowserPreviewYear() { return getAs("browserpreviewyear", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the source from which browser properties have been validated. Primary browser data are retrieved from the internal test and populated manually, then they might be validated against an external source such as Caniuse or RingMark.
     */
    @Override
    public AspectPropertyValue<String> getBrowserPropertySource() { return getAs("browserpropertysource", AspectPropertyValue.class, String.class); }
    /**
     * A measure of the popularity of this browser version. All browsers are ordered by the number of events associated with that browser that occurred in the sampling period. The browser with the most events is ranked 1, the second 2 and so on.
     */
    @Override
    public AspectPropertyValue<Integer> getBrowserRank() { return getAs("browserrank", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the age in months of the browser since the BrowserReleaseYear and BrowserReleaseMonth.
     */
    @Override
    public AspectPropertyValue<Integer> getBrowserReleaseAge() { return getAs("browserreleaseage", AspectPropertyValue.class, Integer.class); }
    /**
     * The month in which the browser version is officially released to users by the browser vendor. This version is called the stable version as any bugs or difficulties highlighted in the Beta/Developer Version will have been fixed for this release.
     */
    @Override
    public AspectPropertyValue<String> getBrowserReleaseMonth() { return getAs("browserreleasemonth", AspectPropertyValue.class, String.class); }
    /**
     * The year in which the browser version is officially released to users by the browser vendor. This version is called the stable version as any bugs or difficulties highlighted in the Beta/Developer Version will have been fixed for this release.
     */
    @Override
    public AspectPropertyValue<Integer> getBrowserReleaseYear() { return getAs("browserreleaseyear", AspectPropertyValue.class, Integer.class); }
    /**
     * Indicates the name of the company which created the browser.
     */
    @Override
    public AspectPropertyValue<String> getBrowserVendor() { return getAs("browservendor", AspectPropertyValue.class, String.class); }
    /**
     * Indicates the version or subversion of the browser.
     */
    @Override
    public AspectPropertyValue<String> getBrowserVersion() { return getAs("browserversion", AspectPropertyValue.class, String.class); }
    /**
     * Indicates if the browser supports the canvas element, useful for drawing graphics via scripting (usually JavaScript).
     */
    @Override
    public AspectPropertyValue<Boolean> getCanvas() { return getAs("canvas", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports http Cookies. However, the user may have disabled Cookies in their own configuration. Where data cannot be validated, it is assumed that the browser supports cookies.
     */
    @Override
    public AspectPropertyValue<Boolean> getCookiesCapable() { return getAs("cookiescapable", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports CSS3 background properties (such as background-image, background-color, etc.) that allow styling of the border and the background of an object, and create a shadow effect.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssBackground() { return getAs("cssbackground", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports border images, allowing decoration of the border around an object.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssBorderImage() { return getAs("cssborderimage", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser can draw CSS images into a Canvas.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssCanvas() { return getAs("csscanvas", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports CSS3 Color, allowing author control of the foreground colour and opacity of an element.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssColor() { return getAs("csscolor", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports CSS3 columns for setting column- width and column-count.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssColumn() { return getAs("csscolumn", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports flexbox, allowing the automatic reordering of elements on the page when accessed from devices with different screen sizes.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssFlexbox() { return getAs("cssflexbox", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports CSS3 fonts, including non-standard fonts, e.g. @font-face.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssFont() { return getAs("cssfont", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports CSS3 images, allowing for fall-back images, gradients and other effects.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssImages() { return getAs("cssimages", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports MediaQueries for dynamic CSS that uses the @media rule.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssMediaQueries() { return getAs("cssmediaqueries", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports the CSS 'min-width' and 'max-width' element.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssMinMax() { return getAs("cssminmax", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports overflowing of clipped blocks.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssOverflow() { return getAs("cssoverflow", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports CSS position, allowing for different box placement algorithms, e.g. static, relative, absolute, fixed and initial.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssPosition() { return getAs("cssposition", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports all CSS3 text features including: text-overflow, word-wrap and word-break.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssText() { return getAs("csstext", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports 2D transformations in CSS3 including rotating, scaling, etc. This property includes support for both transform and transform-origin properties.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssTransforms() { return getAs("csstransforms", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports CSS3 transitions elements, used for animating changes to properties.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssTransitions() { return getAs("csstransitions", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports CSS UI stylings, including text-overflow, css3-boxsizing and pointer properties.
     */
    @Override
    public AspectPropertyValue<Boolean> getCssUI() { return getAs("cssui", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser has the ability to embed custom data attributes on all HTML elements using the 'data-' prefix.
     */
    @Override
    public AspectPropertyValue<Boolean> getDataSet() { return getAs("dataset", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser allows encoded data to be contained in a URL.
     */
    @Override
    public AspectPropertyValue<Boolean> getDataUrl() { return getAs("dataurl", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports DOM events for device orientation, e.g. 'deviceorientation', 'devicemotion' and 'compassneedscalibration'.
     */
    @Override
    public AspectPropertyValue<Boolean> getDeviceOrientation() { return getAs("deviceorientation", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports file reading with events to show progress and errors.
     */
    @Override
    public AspectPropertyValue<Boolean> getFileReader() { return getAs("filereader", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser allows Blobs to be saved to client machines with events to show progress and errors. The End-User may opt to decline these files.
     */
    @Override
    public AspectPropertyValue<Boolean> getFileSaver() { return getAs("filesaver", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser allows files to be saved to client machines with events to show progress and errors. The End-User may opt to decline these files.
     */
    @Override
    public AspectPropertyValue<Boolean> getFileWriter() { return getAs("filewriter", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports the 'FormData' object. This property also refers to XMLHttpRequest. If the browser supports 'xhr2', the 'FormData' element will be also supported.
     */
    @Override
    public AspectPropertyValue<Boolean> getFormData() { return getAs("formdata", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports requests from a video or canvas element to be displayed in full-screen mode.
     */
    @Override
    public AspectPropertyValue<Boolean> getFullscreen() { return getAs("fullscreen", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports a feature to acquire the geographical location. For information on which GeoLoc API the browser supports, refer to another property called JavaScriptPreferredGeoLocApi.
     */
    @Override
    public AspectPropertyValue<Boolean> getGeoLocation() { return getAs("geolocation", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser stores the session history for a web page that contains the URLs visited by the browser's user.
     */
    @Override
    public AspectPropertyValue<Boolean> getHistory() { return getAs("history", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports the new markup in HTML 5 that also refers to 'New Semantic Elements' such as <header>, <nav>, <section>, <aside>,<footer> etc.
     */
    @Override
    public AspectPropertyValue<Boolean> getHtml5() { return getAs("html5", AspectPropertyValue.class, Boolean.class); }
    /**
     * Lists what audio formats, if any, the browser supports using the HTML5 <audio> tag.
     */
    @Override
    public AspectPropertyValue<List<String>> getHtml5Audio() { return getAs("html5audio", AspectPropertyValue.class, List.class); }
    /**
     * Lists what video formats, if any, the browser supports using the HTLM5 <video> tag.
     */
    @Override
    public AspectPropertyValue<List<String>> getHtml5Video() { return getAs("html5video", AspectPropertyValue.class, List.class); }
    /**
     * Indicates if the browser is able to use media inputs, e.g. webcam and microphone, in a script and as an input for forms, e.g. '&lt;input type="file" accept="image/*" id="capture"&gt;' would prompt image- capturing software to open.
     */
    @Override
    public AspectPropertyValue<Boolean> getHtmlMediaCapture() { return getAs("html-media-capture", AspectPropertyValue.class, Boolean.class); }
    /**
     * Refers to the latest version of HyperText Markup Language (HTML) supported by the browser.
     */
    @Override
    public AspectPropertyValue<Double> getHtmlVersion() { return getAs("htmlversion", AspectPropertyValue.class, Double.class); }
    /**
     * Indicates if the browser supports HTTP Live Streaming, also known as HLS.
     */
    @Override
    public AspectPropertyValue<String> getHttpLiveStreaming() { return getAs("httplivestreaming", AspectPropertyValue.class, String.class); }
    /**
     * Indicates if the browser supports the 'Iframe' element, used to embed another document within a current HTML document.
     */
    @Override
    public AspectPropertyValue<Boolean> getIframe() { return getAs("iframe", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports an indexed local database.
     */
    @Override
    public AspectPropertyValue<Boolean> getIndexedDB() { return getAs("indexeddb", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if a web page is accessed through a VR headset.
     */
    @Override
    public AspectPropertyValue<String> getInVRMode() { return getAs("invrmode", AspectPropertyValue.class, String.class); }
    /**
     * Indicates if the browser may be optimised for low bandwidth. A true value indicates the browser supports a feature that can improve performance on low bandwidth connections, either via the removal of elements, features, a proxy or other methods.
     */
    @Override
    public AspectPropertyValue<Boolean> getIsDataMinimising() { return getAs("isdataminimising", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the application is an email browser (Outlook, Gmail, YahooMail, etc.) that is primarily used to access and manage emails (usually from mobile devices).
     */
    @Override
    public AspectPropertyValue<Boolean> getIsEmailBrowser() { return getAs("isemailbrowser", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the mobile device accessing a web page emulates a desktop computer. This property is not applicable for desktops, media hubs, TVs and consoles.
     */
    @Override
    public AspectPropertyValue<String> getIsEmulatingDesktop() { return getAs("isemulatingdesktop", AspectPropertyValue.class, String.class); }
    /**
     * Indicates a browser that does not correctly identify the physical hardware device and instead reports an emulated device.
     */
    @Override
    public AspectPropertyValue<Boolean> getIsEmulatingDevice() { return getAs("isemulatingdevice", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if a web page is accessed from an application whose main function is not browsing the World Wide Web or managing emails, e.g. the Facebook App. The application must be downloaded and installed onto the device from an app marketplace such as Apple's App Store or the Google Play Store, or via a third party as an .apk file or similar. This property will return a 'False' value for mobile browsers such as Chrome Mobile or email browsers (such as Hotmail).
     */
    @Override
    public AspectPropertyValue<String> getIsWebApp() { return getAs("iswebapp", AspectPropertyValue.class, String.class); }
    /**
     * Indicates if the browser supports JavaScript.
     */
    @Override
    public AspectPropertyValue<Boolean> getJavascript() { return getAs("javascript", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports the JavaScript that can manipulate CSS on the browser's web page.
     */
    @Override
    public AspectPropertyValue<Boolean> getJavascriptCanManipulateCSS() { return getAs("javascriptcanmanipulatecss", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports the JavaScript that can manipulate the Document Object Model on the browser's web page.
     */
    @Override
    public AspectPropertyValue<Boolean> getJavascriptCanManipulateDOM() { return getAs("javascriptcanmanipulatedom", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports JavaScript that is able to access HTML elements from their ID using the getElementById method.
     */
    @Override
    public AspectPropertyValue<Boolean> getJavascriptGetElementById() { return getAs("javascriptgetelementbyid", AspectPropertyValue.class, Boolean.class); }
    /**
     * Refers to the JavaScript snippet used to optimise images.
     */
    @Override
    public AspectPropertyValue<String> getJavascriptImageOptimiser() { return getAs("javascriptimageoptimiser", AspectPropertyValue.class, String.class); }
    /**
     * Indicates which GeoLoc API JavaScript the browser supports. If a browser supports a feature to acquire the user's geographical location, another property called 'GeoLocation' will be set to True.
     */
    @Override
    public AspectPropertyValue<String> getJavascriptPreferredGeoLocApi() { return getAs("javascriptpreferredgeolocapi", AspectPropertyValue.class, String.class); }
    /**
     * Indicates if the browser allows registration of event listeners on event targets by using the addEventListener() method.
     */
    @Override
    public AspectPropertyValue<Boolean> getJavascriptSupportsEventListener() { return getAs("javascriptsupportseventlistener", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports the JavaScript events 'onload', 'onclick' and 'onselect'.
     */
    @Override
    public AspectPropertyValue<Boolean> getJavascriptSupportsEvents() { return getAs("javascriptsupportsevents", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports the JavaScript that is able to insert HTML into a DIV tag.
     */
    @Override
    public AspectPropertyValue<Boolean> getJavascriptSupportsInnerHtml() { return getAs("javascriptsupportsinnerhtml", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates which JavaScript version the browser uses. The number refers to JavaScript versioning, not ECMAscript or Jscript. If the browser doesn't support JavaScript then 'NotSupported' value is returned.
     */
    @Override
    public AspectPropertyValue<String> getJavascriptVersion() { return getAs("javascriptversion", AspectPropertyValue.class, String.class); }
    /**
     * Refers to the grade of the level the device has with the jQuery Mobile Framework, as posted by jQuery.
     */
    @Override
    public AspectPropertyValue<String> getjQueryMobileSupport() { return getAs("jquerymobilesupport", AspectPropertyValue.class, String.class); }
    /**
     * Indicates if the browser supports the 'JSON' object. This property may need a vendor prefix, e.g. webkit, moz, etc.
     */
    @Override
    public AspectPropertyValue<Boolean> getJson() { return getAs("json", AspectPropertyValue.class, Boolean.class); }
    /**
     * Refers to the name of the embedded technology the browser uses to display formatted content on the screen.
     */
    @Override
    public AspectPropertyValue<String> getLayoutEngine() { return getAs("layoutengine", AspectPropertyValue.class, String.class); }
    /**
     * Indicates if the browser supports the CSS-mask element that allows users to alter the visibility of an item by either partially or fully hiding the item.
     */
    @Override
    public AspectPropertyValue<Boolean> getMasking() { return getAs("masking", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports a meter element that represents a scalar measurement within a known range or fractional value. This property does not indicate whether the browser supports the progress bar indication. For this purpose, the progress property should be used.
     */
    @Override
    public AspectPropertyValue<Boolean> getMeter() { return getAs("meter", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports messages between different documents.
     */
    @Override
    public AspectPropertyValue<Boolean> getPostMessage() { return getAs("postmessage", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports progress reports, such as with HTTP requests. The progress element can be used to display the progress of the task. This property doesn't represent a scalar measurement. If the browser supports a gauge, the meter property should be used.
     */
    @Override
    public AspectPropertyValue<Boolean> getProgress() { return getAs("progress", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates the level of support for the Promise object. The Promise object represents the eventual completion (or failure) of an asynchronous operation, and its resulting value.
     */
    @Override
    public AspectPropertyValue<String> getPromise() { return getAs("promise", AspectPropertyValue.class, String.class); }
    /**
     * Indicates if the browser supports simple dialogues (window.alert, window.confirm and window.prompt).
     */
    @Override
    public AspectPropertyValue<Boolean> getPrompts() { return getAs("prompts", AspectPropertyValue.class, Boolean.class); }
    /**
     * JavaScript that can override the property value found by the server using information on the client device. This property is applicable for browsers that support screen pixels height cookie.
     */
    @Override
    public AspectPropertyValue<JavaScript> getScreenPixelsHeightJavaScript() { return getAs("screenpixelsheightjavascript", AspectPropertyValue.class, JavaScript.class); }
    /**
     * JavaScript that can override the property value found by the server using information on the client device. This property is applicable for browsers that support screen pixels width cookie.
     */
    @Override
    public AspectPropertyValue<JavaScript> getScreenPixelsWidthJavaScript() { return getAs("screenpixelswidthjavascript", AspectPropertyValue.class, JavaScript.class); }
    /**
     * Indicates if the browser supports the querySelector() method that returns the first element matching a specified CSS selector(s) in the document.
     */
    @Override
    public AspectPropertyValue<Boolean> getSelector() { return getAs("selector", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports TLS or SSL, essential for secure protocols such as HTTPS.
     */
    @Override
    public AspectPropertyValue<Boolean> getSupportsTlsSsl() { return getAs("supportstls/ssl", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports WebGL technology to generate hardware-accelerated 3D graphics.
     */
    @Override
    public AspectPropertyValue<Boolean> getSupportsWebGL() { return getAs("supportswebgl", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports SVG (scalable vector graphics), useful for 2D animations and applications where all objects within the SVG can be accessed via the DOM and can have assigned event listener elements.
     */
    @Override
    public AspectPropertyValue<Boolean> getSvg() { return getAs("svg", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports the method of registering and interpreting finder (or stylus) activity on touch screens or trackpads.
     */
    @Override
    public AspectPropertyValue<Boolean> getTouchEvents() { return getAs("touchevents", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports a method of tracking text being played with media, e.g. subtitles and captions.
     */
    @Override
    public AspectPropertyValue<Boolean> getTrack() { return getAs("track", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports the 'Video' element for playing videos on web pages without requiring a plug-in.
     */
    @Override
    public AspectPropertyValue<Boolean> getVideo() { return getAs("video", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports Viewport, to give control over view for different screen sizes and resolutions of devices accessing a website.
     */
    @Override
    public AspectPropertyValue<Boolean> getViewport() { return getAs("viewport", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports background workers in JavaScript.
     */
    @Override
    public AspectPropertyValue<Boolean> getWebWorkers() { return getAs("webworkers", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates if the browser supports client-to-server communication with XmlHttpRequests. If the browser supports 'Xhr2' will also support 'DataForm' element. This property may need a vendor prefix, e.g. webkit, moz, etc.
     */
    @Override
    public AspectPropertyValue<Boolean> getXhr2() { return getAs("xhr2", AspectPropertyValue.class, Boolean.class); }
    /**
     * Indicates the crawler name when applicable. Returns NotCrawler when the device is not a crawler.
     */
    @Override
    public AspectPropertyValue<String> getCrawlerName() { return getAs("crawlername", AspectPropertyValue.class, String.class); }
    /**
     * Indicates if the source of the web traffic identifies itself as operating without human interaction for the purpose of monitoring the availability or performance of a web site, retrieving a response for inclusion in a search engine or is requesting structured data such as via an API. Such sources are often referred to as crawlers, bots, robots, spiders, probes, monitors or HTTP services among other terms. Where the source pretends to be a device operating with human interaction, such as a smartphone or tablet, this property will return, 'False'.
     */
    @Override
    public AspectPropertyValue<Boolean> getIsCrawler() { return getAs("iscrawler", AspectPropertyValue.class, Boolean.class); }
}
