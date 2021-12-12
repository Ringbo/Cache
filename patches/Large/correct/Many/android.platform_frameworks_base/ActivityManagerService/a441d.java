diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index ee2fdba..5703d5b 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -5026,7 +5026,7 @@
             try {
                 r.forceNewConfig = true;
                 r.ensureActivityConfigurationLocked(0 /* globalChanges */,
-                        false /* preserveWindow */);
+                        true /* preserveWindow */);
             } finally {
                 Binder.restoreCallingIdentity(origId);
             }
