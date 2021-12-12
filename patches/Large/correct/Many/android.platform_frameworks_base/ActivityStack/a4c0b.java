diff --git a/services/core/java/com/android/server/am/ActivityStack.java b/services/core/java/com/android/server/am/ActivityStack.java
index 837a1c1..b043311 100644
--- a/services/core/java/com/android/server/am/ActivityStack.java
+++ b/services/core/java/com/android/server/am/ActivityStack.java
@@ -4362,12 +4362,12 @@
         if (DEBUG_SWITCH || DEBUG_CONFIGURATION) Slog.v(TAG_CONFIGURATION,
                 "Ensuring correct configuration: " + r);
 
-        // Short circuit: if the two configurations are the exact same
-        // object (the common case), then there is nothing to do.
+        // Short circuit: if the two configurations are equal (the common case), then there is
+        // nothing to do.
         final Configuration newConfig = mService.mConfiguration;
         final Configuration taskConfig = r.task.mOverrideConfig;
-        if (r.configuration == newConfig
-                && r.taskConfigOverride == taskConfig
+        if (r.configuration.equals(newConfig)
+                && r.taskConfigOverride.equals(taskConfig)
                 && !r.forceNewConfig) {
             if (DEBUG_SWITCH || DEBUG_CONFIGURATION) Slog.v(TAG_CONFIGURATION,
                     "Configuration unchanged in " + r);
@@ -4396,7 +4396,7 @@
                     "Configuration no differences in " + r);
             // There are no significant differences, so we won't relaunch but should still deliver
             // the new configuration to the client process.
-            r.scheduleConfigurationChanged(taskConfig, false);
+            r.scheduleConfigurationChanged(taskConfig, true);
             return true;
         }
 
