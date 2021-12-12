diff --git a/engine/src/android/com/jme3/system/android/JmeAndroidSystem.java b/engine/src/android/com/jme3/system/android/JmeAndroidSystem.java
index e3409f1..31833d2 100644
--- a/engine/src/android/com/jme3/system/android/JmeAndroidSystem.java
+++ b/engine/src/android/com/jme3/system/android/JmeAndroidSystem.java
@@ -80,7 +80,7 @@
             do {
                 log.setLevel(Level.ALL);
                 if (log.getHandlers().length == 0) {
-                    log = logger.getParent();
+                    log = log.getParent();
                     if (log != null) {
                         for (Handler h : log.getHandlers()) {
                             h.setFormatter(new JmeFormatter());
