diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QSTileHost.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QSTileHost.java
index 493b23f..29b4db1 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QSTileHost.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QSTileHost.java
@@ -211,7 +211,7 @@
 
     public void animateToggleQSExpansion() {
         // TODO: Better path to animated panel expansion.
-        mHeader.performClick();
+        mHeader.callOnClick();
     }
 
     @Override
