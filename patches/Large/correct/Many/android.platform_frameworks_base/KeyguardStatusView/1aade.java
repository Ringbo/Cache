diff --git a/packages/SystemUI/src/com/android/keyguard/KeyguardStatusView.java b/packages/SystemUI/src/com/android/keyguard/KeyguardStatusView.java
index 80b4da8..b2b0ee4 100644
--- a/packages/SystemUI/src/com/android/keyguard/KeyguardStatusView.java
+++ b/packages/SystemUI/src/com/android/keyguard/KeyguardStatusView.java
@@ -301,7 +301,7 @@
 
     private void updateDozeVisibleViews() {
         for (View child : mVisibleInDoze) {
-            child.setAlpha(mDark && mPulsing ? 0.5f : 1);
+            child.setAlpha(mDark && mPulsing ? 0.8f : 1);
         }
     }
 }
