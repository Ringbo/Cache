diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java b/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
index 91889d3..e40b441 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
@@ -2483,7 +2483,7 @@
     }
 
     protected boolean shouldPeek(Entry entry, StatusBarNotification sbn) {
-        if (isDeviceInVrMode()) {
+        if (!mUseHeadsUp || isDeviceInVrMode()) {
             return false;
         }
 
