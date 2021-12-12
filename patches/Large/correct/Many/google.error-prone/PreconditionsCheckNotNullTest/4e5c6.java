diff --git a/src/test/java/com/google/errorprone/PreconditionsCheckNotNullTest.java b/src/test/java/com/google/errorprone/PreconditionsCheckNotNullTest.java
index 30eef39..6b6dc6a 100644
--- a/src/test/java/com/google/errorprone/PreconditionsCheckNotNullTest.java
+++ b/src/test/java/com/google/errorprone/PreconditionsCheckNotNullTest.java
@@ -48,7 +48,7 @@
         .getResource("/" + this.getClass().getName().replaceAll("\\.", "/") + ".class")
         .toURI().getPath();
     projectRoot = new File(pathToFileInProject
-        .substring(0, pathToFileInProject.indexOf("error-prone") + "error-prone".length()));
+        .substring(0, pathToFileInProject.lastIndexOf("error-prone") + "error-prone".length()));
     compiler = ToolProvider.getSystemJavaCompiler();
     fileManager = compiler.getStandardFileManager(null, null, null);
     diagnostics = new DiagnosticCollector<JavaFileObject>();
