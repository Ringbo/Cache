diff --git a/hazelcast/src/main/java/com/hazelcast/management/ManagementCenterService.java b/hazelcast/src/main/java/com/hazelcast/management/ManagementCenterService.java
index f1c1f27..5132ddf 100644
--- a/hazelcast/src/main/java/com/hazelcast/management/ManagementCenterService.java
+++ b/hazelcast/src/main/java/com/hazelcast/management/ManagementCenterService.java
@@ -531,7 +531,7 @@
                 GroupConfig groupConfig = instance.getConfig().getGroupConfig();
                 while (running.get()) {
                     if (versionMismatch) {
-                        Thread.sleep(1000 * 5);
+                        Thread.sleep(1000 * 60);
                         versionMismatch = false;
                     }
                     try {
