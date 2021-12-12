diff --git a/tools/java/src/com/twitter/bazel/checkstyle/JavaCheckstyle.java b/tools/java/src/com/twitter/bazel/checkstyle/JavaCheckstyle.java
index 743d3f5..6f2b0ec 100644
--- a/tools/java/src/com/twitter/bazel/checkstyle/JavaCheckstyle.java
+++ b/tools/java/src/com/twitter/bazel/checkstyle/JavaCheckstyle.java
@@ -120,7 +120,8 @@
     ));
   }
 
-  private static String[] getSourceFiles(String extraActionFile, Predicate<String> predicate) {
+  private static String[] getSourceFiles(String extraActionFile,
+                                         Predicate<CharSequence> predicate) {
     ExtraActionInfo info = ExtraActionUtils.getExtraActionInfo(extraActionFile);
     JavaCompileInfo jInfo = info.getExtension(JavaCompileInfo.javaCompileInfo);
 
