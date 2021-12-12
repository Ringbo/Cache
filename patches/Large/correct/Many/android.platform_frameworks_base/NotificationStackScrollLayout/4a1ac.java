diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java b/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java
index a364b416..0e75acd 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java
@@ -1120,7 +1120,7 @@
     }
 
     public void onChildAnimationFinished() {
-        applyCurrentState();
+        updateChildren();
         mAnimationEvents.clear();
     }
 
