diff --git a/core/src/processing/core/PGraphics.java b/core/src/processing/core/PGraphics.java
index 9532783..971f255 100644
--- a/core/src/processing/core/PGraphics.java
+++ b/core/src/processing/core/PGraphics.java
@@ -4708,7 +4708,7 @@
       // boundary of a word or end of this sentence
       if ((buffer[index] == ' ') || (index == stop)) {
 //        System.out.println((index == stop) + " " + wordStart + " " + index);
-        if (wordStart == index) {  // end of line, nothing is fitting
+        if (start != stop && wordStart == index) {  // end of line, nothing is fitting
           return false;
         }
         float wordWidth = textWidthImpl(buffer, wordStart, index);
