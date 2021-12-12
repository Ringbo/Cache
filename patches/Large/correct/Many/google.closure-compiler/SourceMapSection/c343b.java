diff --git a/src/com/google/debugging/sourcemap/SourceMapSection.java b/src/com/google/debugging/sourcemap/SourceMapSection.java
index baefc9f..d2e50c9 100644
--- a/src/com/google/debugging/sourcemap/SourceMapSection.java
+++ b/src/com/google/debugging/sourcemap/SourceMapSection.java
@@ -60,11 +60,11 @@
     this.column = column;
   }
 
-  static SourceMapSection forMap(String value, int line, int column) {
+  public static SourceMapSection forMap(String value, int line, int column) {
     return new SourceMapSection(SectionType.MAP, value, line, column);
   }
 
-  static SourceMapSection forURL(String value, int line, int column) {
+  public static SourceMapSection forURL(String value, int line, int column) {
     return new SourceMapSection(SectionType.URL, value, line, column);
   }
 
