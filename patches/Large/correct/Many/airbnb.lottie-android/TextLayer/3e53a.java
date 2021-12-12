diff --git a/lottie/src/main/java/com/airbnb/lottie/TextLayer.java b/lottie/src/main/java/com/airbnb/lottie/TextLayer.java
index 0171b3f..cd45da6 100644
--- a/lottie/src/main/java/com/airbnb/lottie/TextLayer.java
+++ b/lottie/src/main/java/com/airbnb/lottie/TextLayer.java
@@ -148,7 +148,7 @@
     }
     fillPaint.setTypeface(typeface);
     fillPaint.setTextSize(documentData.size * composition.getDpScale());
-    strokePaint.setTypeface(strokePaint.getTypeface());
+    strokePaint.setTypeface(fillPaint.getTypeface());
     strokePaint.setTextSize(fillPaint.getTextSize());
     for (int i = 0; i < text.length(); i++) {
       char character = text.charAt(i);
