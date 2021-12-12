diff --git a/sql/src/main/java/io/crate/metadata/settings/TimeSetting.java b/sql/src/main/java/io/crate/metadata/settings/TimeSetting.java
index 045c56c..2dd543e 100644
--- a/sql/src/main/java/io/crate/metadata/settings/TimeSetting.java
+++ b/sql/src/main/java/io/crate/metadata/settings/TimeSetting.java
@@ -59,7 +59,7 @@
     }
 
     public long extractMillis(Settings settings) {
-        return extractTimeValue(settings, null).millis();
+        return extractTimeValue(settings).millis();
     }
 
     public TimeValue extractTimeValue(Settings settings) {
