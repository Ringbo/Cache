diff --git a/java/src/processing/mode/java/pdex/SourceUtils.java b/java/src/processing/mode/java/pdex/SourceUtils.java
index 1c7ae1d..46dd1ab 100644
--- a/java/src/processing/mode/java/pdex/SourceUtils.java
+++ b/java/src/processing/mode/java/pdex/SourceUtils.java
@@ -284,7 +284,7 @@
           }
           break;
         case IN_BLOCK_COMMENT:
-          if (pch == '*' && ch == '/' && (i - blockStart) > 1) {
+          if (pch == '*' && ch == '/' && (i - blockStart) > 0) {
             state = OUT;
           }
           break;
