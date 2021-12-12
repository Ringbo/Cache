diff --git a/dubbo-common/src/main/java/org/apache/dubbo/common/utils/ConfigUtils.java b/dubbo-common/src/main/java/org/apache/dubbo/common/utils/ConfigUtils.java
index f112ec2..436cf8f 100644
--- a/dubbo-common/src/main/java/org/apache/dubbo/common/utils/ConfigUtils.java
+++ b/dubbo-common/src/main/java/org/apache/dubbo/common/utils/ConfigUtils.java
@@ -217,7 +217,8 @@
      */
     public static Properties loadProperties(String fileName, boolean allowMultiFile, boolean optional) {
         Properties properties = new Properties();
-        if (fileName.startsWith("/")) {
+        // add scene judgement in windows environment Fix 2557
+        if (fileName.startsWith("/") || fileName.matches("^[A-z]:\\\\\\S+$")) {
             try {
                 FileInputStream input = new FileInputStream(fileName);
                 try {
