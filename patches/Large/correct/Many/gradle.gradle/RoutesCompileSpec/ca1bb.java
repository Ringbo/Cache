diff --git a/subprojects/platform-play/src/main/java/org/gradle/play/internal/routes/RoutesCompileSpec.java b/subprojects/platform-play/src/main/java/org/gradle/play/internal/routes/RoutesCompileSpec.java
index 264364c..a25c99b 100644
--- a/subprojects/platform-play/src/main/java/org/gradle/play/internal/routes/RoutesCompileSpec.java
+++ b/subprojects/platform-play/src/main/java/org/gradle/play/internal/routes/RoutesCompileSpec.java
@@ -37,7 +37,7 @@
         this.additionalImports.addAll(additionalImports);
         generateReverseRoute = true;
         generateRefReverseRouter = true;
-        namespaceReverseRouter = false;
+        namespaceReverseRouter = true;
     }
 
     public Iterable<File> getSources() {
