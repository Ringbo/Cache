diff --git a/dialogplus/src/main/java/com/orhanobut/dialogplus/HeightAnimation.java b/dialogplus/src/main/java/com/orhanobut/dialogplus/HeightAnimation.java
index 4f2b384..40796eb 100644
--- a/dialogplus/src/main/java/com/orhanobut/dialogplus/HeightAnimation.java
+++ b/dialogplus/src/main/java/com/orhanobut/dialogplus/HeightAnimation.java
@@ -10,7 +10,7 @@
   protected final View view;
   protected float perValue;
 
-  public HeightAnimation(View view, int fromHeight, int toHeight) {
+  HeightAnimation(View view, int fromHeight, int toHeight) {
     this.view = view;
     this.originalHeight = fromHeight;
     this.perValue = (toHeight - fromHeight);
