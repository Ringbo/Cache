diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/UniquePropertiesCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/UniquePropertiesCheckTest.java
index 18daf6f..c5ba375 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/UniquePropertiesCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/UniquePropertiesCheckTest.java
@@ -114,7 +114,7 @@
      * @param file to be opened
      * @return detail message of {@link FileNotFoundException}
      */
-    private String getFileNotFoundDetail(File file) throws Exception {
+    private static String getFileNotFoundDetail(File file) throws Exception {
         // Create exception to know detail message we should wait in
         // LocalisedMessage
         try {
