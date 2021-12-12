diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java
index 5683b43..70d4697 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java
@@ -823,7 +823,7 @@
          * @param importFullPath
          *        import full path variable.
          */
-        public void setImportFullPath(String importFullPath) {
+        public final void setImportFullPath(String importFullPath) {
             this.importFullPath = importFullPath;
         }
 
@@ -840,7 +840,7 @@
          * @param lineNumber
          *        import line number.
          */
-        public void setLineNumber(int lineNumber) {
+        public final void setLineNumber(int lineNumber) {
             this.lineNumber = lineNumber;
         }
 
@@ -857,7 +857,7 @@
          * @param importGroup
          *        import group.
          */
-        public void setImportGroup(String importGroup) {
+        public final void setImportGroup(String importGroup) {
             this.importGroup = importGroup;
         }
 
@@ -874,7 +874,7 @@
          * @param isStatic
          *        if import is static.
          */
-        public void setStaticImport(boolean isStatic) {
+        public final void setStaticImport(boolean isStatic) {
             this.staticImport = isStatic;
         }
     }
