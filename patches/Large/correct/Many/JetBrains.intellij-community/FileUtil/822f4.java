diff --git a/util/src/com/intellij/openapi/util/io/FileUtil.java b/util/src/com/intellij/openapi/util/io/FileUtil.java
index c564f9a..b8f0b91 100644
--- a/util/src/com/intellij/openapi/util/io/FileUtil.java
+++ b/util/src/com/intellij/openapi/util/io/FileUtil.java
@@ -814,7 +814,7 @@
   public static void setExectuableAttribute(String path, boolean executableFlag) throws IOException {
     if (IO_FILE_SET_EXECUTABLE_METHOD != null) {
       try {
-        IO_FILE_SET_EXECUTABLE_METHOD.invoke(new File(path), !executableFlag);
+        IO_FILE_SET_EXECUTABLE_METHOD.invoke(new File(path), executableFlag);
         return;
       }
       catch (IllegalAccessException e) {
@@ -827,7 +827,7 @@
     Process process;
     if (!SystemInfo.isWindows) {
       // UNIXes go here
-      process = Runtime.getRuntime().exec(new String[]{"chmod", executableFlag ? "u-x" : "u+x", path});
+      process = Runtime.getRuntime().exec(new String[]{"chmod", executableFlag ? "u+x" : "u-x", path});
       try {
         process.waitFor();
       }
