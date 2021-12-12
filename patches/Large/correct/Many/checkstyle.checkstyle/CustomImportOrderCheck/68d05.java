diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java
index 9b2992c..a7f5d23 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java
@@ -789,7 +789,7 @@
      */
     private static String getFirstDomainsFromIdent(
             final int firstPackageDomainsCount, final String packageFullPath) {
-        final StringBuilder builder = new StringBuilder();
+        final StringBuilder builder = new StringBuilder(256);
         final StringTokenizer tokens = new StringTokenizer(packageFullPath, ".");
         int count = firstPackageDomainsCount;
 
