diff --git a/src/main/java/org/acra/ACRA.java b/src/main/java/org/acra/ACRA.java
index ddf96e7..682723e 100644
--- a/src/main/java/org/acra/ACRA.java
+++ b/src/main/java/org/acra/ACRA.java
@@ -259,7 +259,7 @@
      */
     private static boolean isACRASenderServiceProcess(Application app) {
         final String processName = getCurrentProcessName(app);
-        log.i(LOG_TAG, "ACRA processName='" + processName + "'");
+        log.d(LOG_TAG, "ACRA processName='" + processName + "'");
         return (processName != null) && processName.endsWith(ACRA_PRIVATE_PROCESS_NAME);
     }
 
