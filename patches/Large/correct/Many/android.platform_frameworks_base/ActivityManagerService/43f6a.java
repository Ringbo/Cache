diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 09f24ed..79257e6 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -18714,7 +18714,7 @@
                 starting = mainStack.topRunningActivityLocked();
             }
 
-            if (starting != null) {
+            if (starting != null && starting.state != ActivityState.STOPPED) {
                 kept = mainStack.ensureActivityConfigurationLocked(starting, changes, false);
                 // And we need to make sure at this point that all other activities
                 // are made visible with the correct configuration.
