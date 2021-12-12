diff --git a/h2/src/main/org/h2/util/SourceCompiler.java b/h2/src/main/org/h2/util/SourceCompiler.java
index d8fc8c3..4d730a7 100644
--- a/h2/src/main/org/h2/util/SourceCompiler.java
+++ b/h2/src/main/org/h2/util/SourceCompiler.java
@@ -420,7 +420,7 @@
         final BufferedReader reader = new BufferedReader(new StringReader(output));
         try {
             for (String line; (line = reader.readLine()) != null;) {
-                if (line.endsWith("warning")) {
+                if (line.endsWith("warning") || line.endsWith("warnings")) {
                     // ignore summary line
                 } else if (line.startsWith("Note:")
                         || line.startsWith("warning:")) {
