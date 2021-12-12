diff --git a/plugins/groovy/rt/src/org/jetbrains/groovy/compiler/rt/AstAwareResourceLoader.java b/plugins/groovy/rt/src/org/jetbrains/groovy/compiler/rt/AstAwareResourceLoader.java
index 51e6fd0..9b5aca5 100644
--- a/plugins/groovy/rt/src/org/jetbrains/groovy/compiler/rt/AstAwareResourceLoader.java
+++ b/plugins/groovy/rt/src/org/jetbrains/groovy/compiler/rt/AstAwareResourceLoader.java
@@ -35,7 +35,7 @@
     if (className == null) return null;
 
     File file = getSourceFile(className);
-    if (file != null) {
+    if (file != null && file.exists()) {
       return file.toURL();
     }
 
