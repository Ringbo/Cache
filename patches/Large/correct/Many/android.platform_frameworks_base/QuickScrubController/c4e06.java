diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickScrubController.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickScrubController.java
index e93e985..bb2f597 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickScrubController.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickScrubController.java
@@ -371,7 +371,7 @@
     }
 
     boolean isQuickScrubEnabled() {
-        return SystemProperties.getBoolean("persist.quickstep.scrub.enabled", false);
+        return SystemProperties.getBoolean("persist.quickstep.scrub.enabled", true);
     }
 
     private void startQuickScrub() {
