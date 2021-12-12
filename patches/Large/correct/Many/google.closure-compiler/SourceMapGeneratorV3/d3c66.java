diff --git a/src/com/google/debugging/sourcemap/SourceMapGeneratorV3.java b/src/com/google/debugging/sourcemap/SourceMapGeneratorV3.java
index cb4d2ad..06041ce 100644
--- a/src/com/google/debugging/sourcemap/SourceMapGeneratorV3.java
+++ b/src/com/google/debugging/sourcemap/SourceMapGeneratorV3.java
@@ -478,7 +478,7 @@
     addNameMap(out, originalNameMap);
   }
 
-  private void addNameMap(Appendable out, Map<String, Integer> map)
+  private static void addNameMap(Appendable out, Map<String, Integer> map)
       throws IOException {
     int i = 0;
     for (Entry<String, Integer> entry : map.entrySet()) {
@@ -801,7 +801,7 @@
     out.append("\n}\n");
   }
 
-  private CharSequence offsetValue(int line, int column) throws IOException {
+  private static CharSequence offsetValue(int line, int column) throws IOException {
     StringBuilder out = new StringBuilder();
     out.append("{\n");
     appendFirstField(out, "line", String.valueOf(line));
