diff --git a/library/src/main/java/com/lorentzos/flingswipe/FlingCardListener.java b/library/src/main/java/com/lorentzos/flingswipe/FlingCardListener.java
index e54e58e..e1011c8 100644
--- a/library/src/main/java/com/lorentzos/flingswipe/FlingCardListener.java
+++ b/library/src/main/java/com/lorentzos/flingswipe/FlingCardListener.java
@@ -36,14 +36,14 @@
 
     // The active pointer is the one currently moving our object.
     private int mActivePointerId = INVALID_POINTER_ID;
-    private TextView frame = null;
+    private View frame = null;
 
 
     private final int TOUCH_ABOVE = 0;
     private final int TOUCH_BELOW = 1;
     private int touchPosition;
 
-    public FlingCardListener(TextView frame, int parentWidth, float originalX, float originalY, int originalHeight, int originalWidth, HelperFlingListener helperFlingListener) {
+    public FlingCardListener(View frame, int parentWidth, float originalX, float originalY, int originalHeight, int originalWidth, HelperFlingListener helperFlingListener) {
         super();
         this.frame = frame;
         this.parentWidth = parentWidth;
