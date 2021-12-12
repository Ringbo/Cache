diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/MultipleStringLiteralsCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/MultipleStringLiteralsCheck.java
index ea72bb3..f5e341f 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/MultipleStringLiteralsCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/MultipleStringLiteralsCheck.java
@@ -202,7 +202,7 @@
          * @param line int
          * @param col int
          */
-        public StringInfo(int line, int col) {
+        StringInfo(int line, int col) {
             this.line = line;
             this.col = col;
         }
