# salesfly-java

[![Build Status](https://travis-ci.org/salesfly/salesfly-java.svg?branch=master)](https://travis-ci.org/salesfly/salesfly-java)

<!--[![codecov](https://codecov.io/gh/salesfly/salesfly-java/branch/master/graph/badge.svg)](https://codecov.io/gh/salesfly/salesfly-java)-->

Java client for [Salesfly API](https://salesfly.com)&reg;

## Documentation

See the [Java API docs](https://docs.salesfly.com/java/).

## Requirements

Java 11 or later.

## Installation

### Maven

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.salesfly</groupId>
  <artifactId>salesfly-java</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Gradle

Add this dependency to your project's build file:

```groovy
compile "com.salesfly:salesfly-java:1.0.0"
```

### Others

You'll need to manually install the following JARs:

- [Salesfly-java](https://github.com/salesfly/salesfly-java/releases/latest)
- [Google Gson](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.6)
- [Apache HttpClient](https://repo1.maven.org/maven2/org/apache/httpcomponents/httpclient/4.5.10)

### [ProGuard](http://proguard.sourceforge.net/)

If you're planning on using ProGuard, make sure that you exclude the salesfly bindings. You can do this by adding the following to your `proguard.cfg` file:

```
-keep class com.salesfly.** { *; }
```

## Usage

Example.java

```java
package examples;

import com.salesfly.SalesflyClient;
import com.salesfly.api.GeoLocation;
import com.salesfly.exceptions.APIException;
import com.salesfly.exceptions.ResponseException;
import com.salesfly.models.IPLocation;

public class Example {
    public static void main(String[] args) {
        String apiKey = System.getenv("SALESFLY_APIKEY");

        try {
            SalesflyClient.init(apiKey);
            IPLocation location = GeoLocation.get("8.8.8.8");
            System.err.println("Country code: " + location.getCountryCode());
        } catch (ResponseException e) {
            System.err.println("Response error: " + e.getMessage());
        } catch (APIException e) {
            System.err.println("API error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
```

## License and Trademarks

Copyright (c) 2018-20 UAB Salesfly.

Licensed under the [MIT license](https://en.wikipedia.org/wiki/MIT_License).

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

Salesfly is a registered trademark of [UAB Salesfly](https://www.salesfly.com).
