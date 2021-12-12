diff --git a/packages/SystemUI/src/com/android/systemui/DreamsDockLauncher.java b/packages/SystemUI/src/com/android/systemui/DreamsDockLauncher.java
index 1db2a7f..73249b4 100644
--- a/packages/SystemUI/src/com/android/systemui/DreamsDockLauncher.java
+++ b/packages/SystemUI/src/com/android/systemui/DreamsDockLauncher.java
@@ -59,7 +59,7 @@
         public void onReceive(Context context, Intent intent) {
             final boolean activateOnDock = 0 != Settings.Secure.getInt(
                 context.getContentResolver(), 
-                Settings.Secure.SCREENSAVER_ACTIVATE_ON_DOCK, 1);
+                Settings.Secure.SCREENSAVER_ACTIVATE_ON_DOCK, 0);
 
             if (!activateOnDock) return;
 
