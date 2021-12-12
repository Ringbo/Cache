diff --git a/packages/SystemUI/src/com/android/systemui/BeanBagDream.java b/packages/SystemUI/src/com/android/systemui/BeanBagDream.java
index 12e45c7..6b5c9c0 100644
--- a/packages/SystemUI/src/com/android/systemui/BeanBagDream.java
+++ b/packages/SystemUI/src/com/android/systemui/BeanBagDream.java
@@ -19,7 +19,7 @@
     public void onAttachedToWindow() {
         super.onAttachedToWindow();
         setContentView(mBoard);
-        lightsOut();
+        setFullscreen(true);
         mBoard.startAnimation();
     }
 
