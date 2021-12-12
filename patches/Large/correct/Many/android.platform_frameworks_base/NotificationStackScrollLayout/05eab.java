diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java b/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java
index 9a43e37..ea34506 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java
@@ -1077,7 +1077,7 @@
     }
 
     public void onChildAnimationFinished() {
-        applyCurrentState();
+        updateChildren();
         mAnimationEvents.clear();
     }
 
