diff --git a/java/org/apache/catalina/core/AprLifecycleListener.java b/java/org/apache/catalina/core/AprLifecycleListener.java
index c0b7498..4c5771c 100644
--- a/java/org/apache/catalina/core/AprLifecycleListener.java
+++ b/java/org/apache/catalina/core/AprLifecycleListener.java
@@ -141,7 +141,7 @@
         }
         if ((major != TCN_REQUIRED_MAJOR)  ||
             (minor < TCN_REQUIRED_MINOR) ||
-            (patch <  TCN_REQUIRED_PATCH)) {
+            (minor == TCN_REQUIRED_MINOR && patch <  TCN_REQUIRED_PATCH)) {
             log.error(sm.getString("aprListener.tcnInvalid", major + "."
                     + minor + "." + patch,
                     TCN_REQUIRED_MAJOR + "." +
@@ -157,7 +157,7 @@
             return false;
         }
         if (minor < TCN_RECOMMENDED_MIN ||
-                (minor >= TCN_RECOMMENDED_MIN && patch <  TCN_RECOMMENDED_PV)) {
+                (minor == TCN_RECOMMENDED_MIN && patch <  TCN_RECOMMENDED_PV)) {
             log.info(sm.getString("aprListener.tcnVersion", major + "."
                     + minor + "." + patch,
                     TCN_REQUIRED_MAJOR + "." +
