diff --git a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/health/DaemonStatus.java b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/health/DaemonStatus.java
index d89583a..6e41f0f 100644
--- a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/health/DaemonStatus.java
+++ b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/health/DaemonStatus.java
@@ -23,12 +23,14 @@
 class DaemonStatus {
 
     static final String EXPIRE_AT_PROPERTY = "org.gradle.daemon.performance.expire-at";
-    static final int DEFAULT_EXPIRE_AT = 0;
+    static final int DEFAULT_EXPIRE_AT = 80;
 
     boolean isDaemonTired(DaemonStats stats) {
         String expireAt = System.getProperty(EXPIRE_AT_PROPERTY);
         int threshold = parseValue(expireAt, DEFAULT_EXPIRE_AT);
-        return threshold != 0 && stats.getCurrentPerformance() <= threshold;
+        return threshold != 0 //zero means the feature is off
+                && stats.getMemoryUsed() > 85 //the daemon is not tired if the memory is not sufficiently exhausted
+                && stats.getCurrentPerformance() <= threshold; //performance below threshold
     }
 
     private static int parseValue(String expireAt, int defaultValue) {
