diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java
index e9f76d6..194ba15 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java
@@ -819,7 +819,7 @@
          * @param staticImport
          *        if import is static.
          */
-        public ImportDetails(String importFullPath,
+        ImportDetails(String importFullPath,
                 int lineNumber, String importGroup, boolean staticImport) {
             this.importFullPath = importFullPath;
             this.lineNumber = lineNumber;
