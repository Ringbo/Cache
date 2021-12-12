diff --git a/src/main/java/com/google/devtools/build/lib/query2/ConfiguredTargetQueryEnvironment.java b/src/main/java/com/google/devtools/build/lib/query2/ConfiguredTargetQueryEnvironment.java
index 0dfff29..c87583d 100644
--- a/src/main/java/com/google/devtools/build/lib/query2/ConfiguredTargetQueryEnvironment.java
+++ b/src/main/java/com/google/devtools/build/lib/query2/ConfiguredTargetQueryEnvironment.java
@@ -180,14 +180,17 @@
   }
 
   private ConfiguredTarget getConfiguredTarget(Label label) throws InterruptedException {
-    // Try with host configuration.
+    // Try with target configuration.
     ConfiguredTarget configuredTarget =
-        getConfiguredTarget(ConfiguredTargetValue.key(label, hostConfiguration));
+        getConfiguredTarget(ConfiguredTargetValue.key(label, defaultTargetConfiguration));
     if (configuredTarget != null) {
       return configuredTarget;
     }
+    // Try with host configuration (even when --nohost_deps is set in the case that top-level
+    // targets are configured in the host configuration so we are doing a host-configuration-only
+    // query).
     configuredTarget =
-        getConfiguredTarget(ConfiguredTargetValue.key(label, defaultTargetConfiguration));
+        getConfiguredTarget(ConfiguredTargetValue.key(label, hostConfiguration));
     if (configuredTarget != null) {
       return configuredTarget;
     }
