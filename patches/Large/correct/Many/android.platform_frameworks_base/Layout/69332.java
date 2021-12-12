diff --git a/core/java/android/text/Layout.java b/core/java/android/text/Layout.java
index 04dadc8e..62bd6e0 100644
--- a/core/java/android/text/Layout.java
+++ b/core/java/android/text/Layout.java
@@ -1242,7 +1242,7 @@
         final TextPaint paint = mWorkPaint;
         paint.set(mPaint);
         paint.setHyphenEdit(getHyphen(line));
-        tl.set(mPaint, mText, start, end, dir, directions, hasTabs, tabStops);
+        tl.set(paint, mText, start, end, dir, directions, hasTabs, tabStops);
         if (isJustificationRequired(line)) {
             tl.justify(getJustifyWidth(line));
         }
@@ -1270,7 +1270,7 @@
         final TextPaint paint = mWorkPaint;
         paint.set(mPaint);
         paint.setHyphenEdit(getHyphen(line));
-        tl.set(mPaint, mText, start, end, dir, directions, hasTabs, tabStops);
+        tl.set(paint, mText, start, end, dir, directions, hasTabs, tabStops);
         if (isJustificationRequired(line)) {
             tl.justify(getJustifyWidth(line));
         }
