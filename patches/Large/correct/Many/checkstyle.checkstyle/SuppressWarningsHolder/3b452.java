diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/SuppressWarningsHolder.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/SuppressWarningsHolder.java
index 73ef8f1..b8f6a0c 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/SuppressWarningsHolder.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/SuppressWarningsHolder.java
@@ -449,7 +449,7 @@
          * @param lastLine the last line of the suppression region
          * @param lastColumn the last column of the suppression region
          */
-        public Entry(String checkName, int firstLine, int firstColumn,
+        Entry(String checkName, int firstLine, int firstColumn,
             int lastLine, int lastColumn) {
             this.checkName = checkName;
             this.firstLine = firstLine;
