diff --git a/services/core/java/com/android/server/InputMethodManagerService.java b/services/core/java/com/android/server/InputMethodManagerService.java
index f6ff359..40f9476 100644
--- a/services/core/java/com/android/server/InputMethodManagerService.java
+++ b/services/core/java/com/android/server/InputMethodManagerService.java
@@ -266,9 +266,9 @@
         @GuardedBy("LOCK")
         private boolean mValue;
 
-        public DebugFlag(String key) {
+        public DebugFlag(String key, boolean defaultValue) {
             mKey = key;
-            refresh();
+            mValue = SystemProperties.getBoolean(key, defaultValue);
         }
 
         void refresh() {
@@ -290,7 +290,7 @@
      */
     private static final class DebugFlags {
         static final DebugFlag FLAG_OPTIMIZE_START_INPUT =
-                new DebugFlag("debug.optimize_startinput");
+                new DebugFlag("debug.optimize_startinput", false);
     }
 
 
