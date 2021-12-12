diff --git a/src/main/java/org/acra/ACRA.java b/src/main/java/org/acra/ACRA.java
index 79b3903..ddf96e7 100644
--- a/src/main/java/org/acra/ACRA.java
+++ b/src/main/java/org/acra/ACRA.java
@@ -259,7 +259,7 @@
      */
     private static boolean isACRASenderServiceProcess(Application app) {
         final String processName = getCurrentProcessName(app);
-        log.e(LOG_TAG, "ACRA processName='" + processName + "'");
+        log.i(LOG_TAG, "ACRA processName='" + processName + "'");
         return (processName != null) && processName.endsWith(ACRA_PRIVATE_PROCESS_NAME);
     }
 
