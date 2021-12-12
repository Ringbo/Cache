diff --git a/src/com/google/javascript/jscomp/deps/DepsFileParser.java b/src/com/google/javascript/jscomp/deps/DepsFileParser.java
index 28b725c..e6deb73 100644
--- a/src/com/google/javascript/jscomp/deps/DepsFileParser.java
+++ b/src/com/google/javascript/jscomp/deps/DepsFileParser.java
@@ -120,7 +120,7 @@
    */
   public List<DependencyInfo> parseFileReader(String filePath, Reader reader) {
     depInfos = Lists.newArrayList();
-    logger.info("Parsing Dep: " + filePath);
+    logger.fine("Parsing Dep: " + filePath);
     doParse(filePath, reader);
     return depInfos;
   }
