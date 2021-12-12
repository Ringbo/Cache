diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java b/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java
index 0c74f45..9829920 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java
@@ -1273,7 +1273,7 @@
 
     @Override
     public float getTranslation() {
-        if (mShouldTranslateContents) {
+        if (!mShouldTranslateContents) {
             return getTranslationX();
         }
 
