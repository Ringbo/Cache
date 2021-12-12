diff --git a/commons/src/main/java/com/afollestad/materialdialogs/color/CircleView.java b/commons/src/main/java/com/afollestad/materialdialogs/color/CircleView.java
index 8fb67b2..dd1ebb6 100644
--- a/commons/src/main/java/com/afollestad/materialdialogs/color/CircleView.java
+++ b/commons/src/main/java/com/afollestad/materialdialogs/color/CircleView.java
@@ -128,7 +128,7 @@
 
     @Override
     protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
-        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
+        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
         setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
     }
 
