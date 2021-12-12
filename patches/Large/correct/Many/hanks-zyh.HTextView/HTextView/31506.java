diff --git a/htextview-library/src/main/java/com/hanks/htextview/HTextView.java b/htextview-library/src/main/java/com/hanks/htextview/HTextView.java
index 60ce6b9..23c448b 100644
--- a/htextview-library/src/main/java/com/hanks/htextview/HTextView.java
+++ b/htextview-library/src/main/java/com/hanks/htextview/HTextView.java
@@ -157,8 +157,8 @@
     
     @Override
     public void setTextColor(@ColorInt int color) {
-        //Check for SparkleText. Do not alter color if on that type due to paint conflicts
-        if(animateType != 3){
+        //Check for RainbowText. Do not alter color if on that type due to paint conflicts
+        if(animateType != 8){
             super.setTextColor(color);
         }
     }
