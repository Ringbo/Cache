diff --git a/packages/SystemUI/src/com/android/systemui/pip/phone/PipMenuActivity.java b/packages/SystemUI/src/com/android/systemui/pip/phone/PipMenuActivity.java
index 766914c..824f4a7 100644
--- a/packages/SystemUI/src/com/android/systemui/pip/phone/PipMenuActivity.java
+++ b/packages/SystemUI/src/com/android/systemui/pip/phone/PipMenuActivity.java
@@ -221,9 +221,9 @@
     protected void onUserLeaveHint() {
         super.onUserLeaveHint();
 
-        // If another task is starting on top of the menu, then finish it so that it can be
+        // If another task is starting on top of the menu, then hide and finish it so that it can be
         // recreated on the top next time it starts
-        finish();
+        hideMenu();
     }
 
     @Override
