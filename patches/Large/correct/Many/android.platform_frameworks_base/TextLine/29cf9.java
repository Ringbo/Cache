diff --git a/core/java/android/text/TextLine.java b/core/java/android/text/TextLine.java
index 605b91d..39e8694 100644
--- a/core/java/android/text/TextLine.java
+++ b/core/java/android/text/TextLine.java
@@ -741,11 +741,11 @@
 
         if (needWidth || (c != null && (wp.bgColor != 0 || wp.underlineColor != 0 || runIsRtl))) {
             if (mCharsValid) {
-                ret = wp.getRunAdvance(mChars, start, contextEnd, contextStart, contextEnd,
+                ret = wp.getRunAdvance(mChars, start, end, contextStart, contextEnd,
                         runIsRtl, end);
             } else {
                 int delta = mStart;
-                ret = wp.getRunAdvance(mText, delta + start, delta + contextEnd,
+                ret = wp.getRunAdvance(mText, delta + start, delta + end,
                         delta + contextStart, delta + contextEnd, runIsRtl, delta + end);
             }
         }
