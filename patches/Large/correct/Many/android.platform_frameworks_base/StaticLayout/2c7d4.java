diff --git a/core/java/android/text/StaticLayout.java b/core/java/android/text/StaticLayout.java
index 4144a75..e623522 100644
--- a/core/java/android/text/StaticLayout.java
+++ b/core/java/android/text/StaticLayout.java
@@ -483,7 +483,7 @@
                 mLineCount < mMaximumVisibleLineCount) {
             // Log.e("text", "output last " + bufEnd);
 
-            measured.setPara(source, bufStart, bufEnd, textDir);
+            measured.setPara(source, bufEnd, bufEnd, textDir);
 
             paint.getFontMetricsInt(fm);
 
