diff --git a/camel-core/src/main/java/org/apache/camel/converter/IOConverterOptimised.java b/camel-core/src/main/java/org/apache/camel/converter/IOConverterOptimised.java
index 590b398..6ae8779 100644
--- a/camel-core/src/main/java/org/apache/camel/converter/IOConverterOptimised.java
+++ b/camel-core/src/main/java/org/apache/camel/converter/IOConverterOptimised.java
@@ -5,9 +5,9 @@
  * The ASF licenses this file to You under the Apache License, Version 2.0
  * (the "License"); you may not use this file except in compliance with
  * the License.  You may obtain a copy of the License at
- * <p>
+ *
  * http://www.apache.org/licenses/LICENSE-2.0
- * <p>
+ *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@@ -34,11 +34,12 @@
 /**
  * Optimised {@link IOConverter}
  */
-public class IOConverterOptimised {
+public final class IOConverterOptimised {
 
     private IOConverterOptimised() {
     }
 
+    // CHECKSTYLE:OFF
     public static Object convertTo(final Class<?> type, final Exchange exchange, final Object value) throws Exception {
         Class fromType = value.getClass();
 
@@ -159,5 +160,6 @@
         // no optimised type converter found
         return null;
     }
+    // CHECKSTYLE:ON
 
 }
