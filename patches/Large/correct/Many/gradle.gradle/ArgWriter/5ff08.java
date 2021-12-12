diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/ArgWriter.java b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/ArgWriter.java
index 6d901cf..1dba211 100755
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/ArgWriter.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/ArgWriter.java
@@ -44,7 +44,8 @@
     }
 
     public static ArgWriter windowsStyle(PrintWriter writer) {
-        return new ArgWriter(writer, false);
+        // TODO:DAZ Should find a way _not_ to escape file names, although Visual Studio seems to handle them escaped
+        return new ArgWriter(writer, true);
     }
 
     public static Transformer<ArgWriter, PrintWriter> windowsStyleFactory() {
