diff --git a/app/src/main/java/com/hippo/drawable/UnikeryDrawable.java b/app/src/main/java/com/hippo/drawable/UnikeryDrawable.java
index 414d61f..0b735aa 100644
--- a/app/src/main/java/com/hippo/drawable/UnikeryDrawable.java
+++ b/app/src/main/java/com/hippo/drawable/UnikeryDrawable.java
@@ -100,7 +100,7 @@
         removeDrawableAndHolder();
 
         mHolder = holder;
-        Drawable drawable = new BitmapDrawable(holder.getValue());
+        Drawable drawable = new BitmapDrawable(mTextView.getResources(), holder.getValue());
 
         setDrawable(drawable);
 
