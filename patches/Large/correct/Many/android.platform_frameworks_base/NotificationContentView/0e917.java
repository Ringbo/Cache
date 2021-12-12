diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/NotificationContentView.java b/packages/SystemUI/src/com/android/systemui/statusbar/NotificationContentView.java
index e6eca22..8b4c2c4 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/NotificationContentView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/NotificationContentView.java
@@ -202,7 +202,7 @@
     }
 
     public void setDark(boolean dark, boolean fade) {
-        if (mDark == dark) return;
+        if (mDark == dark || mContractedChild == null) return;
         mDark = dark;
         setImageViewDark(dark, fade, com.android.internal.R.id.right_icon);
         setImageViewDark(dark, fade, com.android.internal.R.id.icon);
