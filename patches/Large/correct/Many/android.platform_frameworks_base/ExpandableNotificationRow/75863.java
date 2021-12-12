diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java b/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java
index 7277ff9..30bb181 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java
@@ -1271,7 +1271,7 @@
 
     @Override
     public float getTranslation() {
-        if (mShouldTranslateContents) {
+        if (!mShouldTranslateContents) {
             return getTranslationX();
         }
 
