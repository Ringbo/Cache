diff --git a/subprojects/core/src/main/groovy/org/gradle/cache/internal/DefaultFileLockManager.java b/subprojects/core/src/main/groovy/org/gradle/cache/internal/DefaultFileLockManager.java
index 570c580..a328e8a 100644
--- a/subprojects/core/src/main/groovy/org/gradle/cache/internal/DefaultFileLockManager.java
+++ b/subprojects/core/src/main/groovy/org/gradle/cache/internal/DefaultFileLockManager.java
@@ -240,7 +240,7 @@
                     LOGGER.debug("Could not lock information region for {}. Ignoring.", displayName);
                 } else {
                     try {
-                        if (lockFileAccess.length() < INFORMATION_REGION_POS) {
+                        if (lockFileAccess.length() <= INFORMATION_REGION_POS) {
                             LOGGER.debug("Lock file for {} is too short to contain information region. Ignoring.", displayName);
                         } else {
                             lockFileAccess.seek(INFORMATION_REGION_POS);
