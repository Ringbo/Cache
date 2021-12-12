diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/IllegalImportCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/IllegalImportCheck.java
index 8b5a17a..cb72825 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/IllegalImportCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/IllegalImportCheck.java
@@ -80,7 +80,7 @@
      * Set the list of illegal packages.
      * @param from array of illegal packages
      */
-    public void setIllegalPkgs(String... from) {
+    public final void setIllegalPkgs(String... from) {
         illegalPkgs = from.clone();
     }
 
