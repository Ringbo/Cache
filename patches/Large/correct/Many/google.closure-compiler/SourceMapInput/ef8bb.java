diff --git a/src/com/google/javascript/jscomp/SourceMapInput.java b/src/com/google/javascript/jscomp/SourceMapInput.java
index 645d34a..d35d559 100644
--- a/src/com/google/javascript/jscomp/SourceMapInput.java
+++ b/src/com/google/javascript/jscomp/SourceMapInput.java
@@ -33,10 +33,11 @@
   private transient volatile boolean cached = false;
 
   static final DiagnosticType SOURCEMAP_RESOLVE_FAILED =
-      DiagnosticType.warning("SOURCEMAP_RESOLVE_FAILED", "Failed to resolve sourcemap: {0}");
+      DiagnosticType.warning("SOURCEMAP_RESOLVE_FAILED", "Failed to resolve sourcemap at {0}: {1}");
 
   static final DiagnosticType SOURCEMAP_PARSE_FAILED =
-      DiagnosticType.warning("SOURCEMAP_PARSE_FAILED", "Failed to parse malformed sourcemap: {0}");
+      DiagnosticType.warning(
+          "SOURCEMAP_PARSE_FAILED", "Failed to parse malformed sourcemap in {0}: {1}");
 
   public SourceMapInput(SourceFile sourceFile) {
     this.sourceFile = sourceFile;
@@ -57,10 +58,12 @@
         consumer.parse(sourceMapContents);
         parsedSourceMap = consumer;
       } catch (IOException e) {
-        JSError error = JSError.make(SourceMapInput.SOURCEMAP_RESOLVE_FAILED, sourceMapPath);
+        JSError error =
+            JSError.make(SourceMapInput.SOURCEMAP_RESOLVE_FAILED, sourceMapPath, e.getMessage());
         errorManager.report(error.getDefaultLevel(), error);
       } catch (SourceMapParseException e) {
-        JSError error = JSError.make(SourceMapInput.SOURCEMAP_PARSE_FAILED, sourceMapPath);
+        JSError error =
+            JSError.make(SourceMapInput.SOURCEMAP_PARSE_FAILED, sourceMapPath, e.getMessage());
         errorManager.report(error.getDefaultLevel(), error);
       }
     }
