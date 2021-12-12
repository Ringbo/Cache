diff --git a/services/core/java/com/android/server/TelephonyRegistry.java b/services/core/java/com/android/server/TelephonyRegistry.java
index 95f1852..a5b0e59 100644
--- a/services/core/java/com/android/server/TelephonyRegistry.java
+++ b/services/core/java/com/android/server/TelephonyRegistry.java
@@ -368,7 +368,7 @@
             return;
         }
 
-        final Record r;
+        Record r;
 
         synchronized (mRecords) {
             // register
