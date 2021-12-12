diff --git a/core/java/android/text/StaticLayout.java b/core/java/android/text/StaticLayout.java
index 967e80c..0d35f9c 100644
--- a/core/java/android/text/StaticLayout.java
+++ b/core/java/android/text/StaticLayout.java
@@ -540,7 +540,7 @@
                 while (breakIndex < breakCount && paraStart + breaks[breakIndex] <= spanEnd) {
                     int endPos = paraStart + breaks[breakIndex];
 
-                    boolean moreChars = (endPos < paraEnd); // XXX is this the right way to calculate this?
+                    boolean moreChars = (endPos < bufEnd);
 
                     v = out(source, here, endPos,
                             fmAscent, fmDescent, fmTop, fmBottom,
