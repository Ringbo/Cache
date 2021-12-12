diff --git a/core/camel-management-impl/src/main/java/org/apache/camel/management/mbean/ManagedPerformanceCounter.java b/core/camel-management-impl/src/main/java/org/apache/camel/management/mbean/ManagedPerformanceCounter.java
index 95269f4..3368bc4 100644
--- a/core/camel-management-impl/src/main/java/org/apache/camel/management/mbean/ManagedPerformanceCounter.java
+++ b/core/camel-management-impl/src/main/java/org/apache/camel/management/mbean/ManagedPerformanceCounter.java
@@ -293,7 +293,7 @@
     }
 
     private static String dateAsString(long value) {
-        if (value == 0) {
+        if (value <= 0) {
             return "";
         }
         return new SimpleDateFormat(TIMESTAMP_FORMAT).format(value);
