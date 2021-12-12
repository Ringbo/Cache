diff --git a/util/src/main/java/org/jf/util/IndentingWriter.java b/util/src/main/java/org/jf/util/IndentingWriter.java
index 95d6c32..8e4ca62 100644
--- a/util/src/main/java/org/jf/util/IndentingWriter.java
+++ b/util/src/main/java/org/jf/util/IndentingWriter.java
@@ -120,7 +120,7 @@
         int pos = start;
         while (pos < end) {
             pos = str.indexOf('\n', start);
-            if (pos == -1) {
+            if (pos == -1 || pos >= end) {
                 writeLine(str, start, end-start);
                 return;
             } else {
