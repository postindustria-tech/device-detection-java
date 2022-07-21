# 51Degrees Device Detection Engines

![51Degrees](https://51degrees.com/img/logo.png?utm_source=github&utm_medium=repository&utm_content=readme_main&utm_campaign=java-open-source "Data rewards the curious") **Java Device Detection**

[Developer Documentation](https://51degrees.com/device-detection-java/index.html?utm_source=github&utm_medium=repository&utm_content=documentation&utm_campaign=java-open-source "developer documentation")

## Introduction

This repository contains the device detection engines for the Java implementation of the Pipeline API.

## Dependencies

For runtime dependencies, see our [dependencies](http://51degrees.com/documentation/_info__dependencies.html) page.
The [tested versions](https://51degrees.com/documentation/_info__tested_versions.html) page shows 
the JDK versions that we currently test against. The software may run fine against other versions, 
but additional caution should be applied.

### Data

The Java API can either use our cloud service to get its data or it can use a local (on-premise) copy of the data.

#### Cloud

You will require [resource keys](https://51degrees.com/documentation/_info__resource_keys.html)
to use the Cloud API, as described on our website. Get resource keys from
our [configurator](https://configure.51degrees.com/), see our [documentation](https://51degrees.com/documentation/_concepts__configurator.html) on 
how to use this.

#### On-Premise

If you are using on-premise detection, a "Lite" version of the data required is packaged 
in this repository. It contains only a limited set of "essential" device detection properties. 

You may want to license our complete data file containing all properties. 
[Details of our licenses](https://51degrees.com/pricing) are available on our website.

If you want to use the lite file, you will need to install [GitLFS](https://git-lfs.github.com/), then:

```
git lfs install
```

Then, navigate to 'device-detection.hash.engine.on-premise/src/main/cxx/device-detection-cxx/device-detection-data' and execute:

```
git lfs pull
```

## Installation

Our latest release is available as compiled JARs on Maven - or you can compile from source as described below.

### Maven

The 51Degrees Java Device Detection package is available on maven. Make sure to select
the [latest version](https://mvnrepository.com/artifact/com.51degrees/device-detection).

```xml
<!-- Make sure to select the latest version from https://mvnrepository.com/artifact/com.51degrees/pipeline.device-detection -->
<dependency>
    <groupId>com.51degrees</groupId>
    <artifactId>device-detection</artifactId>
    <version>4.4.9</version>
</dependency>
```

This package includes the Cloud and on-premise APIs.

### Build and Install from source

Device detection on-premise uses a native binary. (i.e. compiled from C code to target a specific 
platform/architecture) This section explains how to build this binary.

#### Pre-requisites

- Install C build tools:
  - Windows:
    - You will need either Visual Studio 2019 or the [C++ Build Tools](https://visualstudio.microsoft.com/visual-cpp-build-tools/) installed.
      - Minimum platform toolset version is `v142`
      - Minimum Windows SDK version is `10.0.18362.0`
    - Set the CMake command path in the PATH environment variable: 
      - `set PATH="[Visual Studio Installation Path]\[Visual Studio Version]\BuildTools\Common7\IDE\CommonExtensions\Microsoft\CMake\CMake\bin\";%PATH%`

  - Linux:
    - `sudo apt-get install g++ make libatomic1 cmake`
- Maven version 3.8.4 or higher is recommended, and what is used for our own build.
- If you have not already done so, pull the git submodules that contain the native code:
  - `git submodule update --init --recursive`

#### Build steps

Batch script and Bash script are provided to support building native binaries on Windows and Linux/macOS.
These scripts are implicitly called by the Maven build step.

```
mvn clean install
```

On Windows, the Platform Toolset version and Windows 10 SDK version can be overwritten when 
running `mvn` by adding following options:
- `-DplatformToolsetVersion=[ Platform Toolset Version ]`
- `-DwindowsSDKVersion=[ Windows 10 SDK Version ]`

This is not recommended unless absolutely necessary and should be used with caution.

## Tests

You will need [resource keys](https://51degrees.com/documentation/_info__resource_keys.html)
(see above) to complete the tests and run examples which include exercising the cloud API.

To verify the code:

```
mvn clean test -DTestResourceKey=[Resource Key]
```
For tests and examples that require a license key add the following option:
- `-DLicenseKey=[License Key]`

## Projects

- **device-detection** - This is the project to get all Device Detection capabilities.
- **device-detection.hash.engine.on-premise** - when you want to use local detection.
- **device-detection.cloud** - when you want to use our cloud detection.
- **device-detection.shared** - Shared classes.

The following examples are not distributed as maven jars and need to be built by you, please
see the respective README for these projects:

- **device-detection.examples** - Device detection getting started and other introductory examples [README](./device-detection.examples/README.md).

## Examples

The tables below describe the examples available in this repository under 
`device-detection.examples`.

### Cloud

| Example                                | Description                                                                                                                                        |
|----------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------|
| GettingStarted (Console)               | How to use the 51Degrees Cloud service to determine details about a device based on its User-Agent and User-Agent Client Hints HTTP header values. |
| GettingStarted (Web)                   | How to use the 51Degrees Cloud service to determine details about a device as part of a simple Java servlet website.                               |
| Metadata                               | How to access the meta-data that relates to things like the properties populated device detection                                                  |
| TacLookup                              | How to get device details from a TAC (Type Allocation Code) using the 51Degrees cloud service.                                                     |
| NativeModelLookup                      | How to get device details from a native model name using the 51Degrees cloud service.                                                              |

### On-Premise

| Example                  | Description                                                                                                                                                                                                                    |
|--------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| GettingStarted (Console) | How to use the 51Degrees on-premise device detection API to determine details about a device based on its User-Agent and User-Agent Client Hints HTTP header values.                                                           |
| GettingStarted (Web)     | How to use the 51Degrees Cloud service to determine details about a device as part of a simple Java servlet website.                                                                                                           |
| Metadata                 | How to access the meta-data that relates to things like the properties populated device detection.                                                                                                                             |
| MatchMetrics             | How to view metrics associated with the properties of processing with a Device Detection engine.                                                                                                                               |
| OfflineProcessing        | Example showing how to ingest a file containing data from web requests and perform detection against the entries.                                                                                                              |
| PerformanceBenchmark     | How to configure the various performance options and run some simple performance tests.                                                                                                                                        |
| UpdateOnStartup          | How to configure the Pipeline to automatically update the device detection data file on startup. Also illustrates 'file watcher'. This will refresh the device detection engine if the specified data file is updated on disk. |
