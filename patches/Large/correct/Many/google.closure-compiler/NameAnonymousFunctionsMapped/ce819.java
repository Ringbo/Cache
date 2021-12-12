diff --git a/src/com/google/javascript/jscomp/NameAnonymousFunctionsMapped.java b/src/com/google/javascript/jscomp/NameAnonymousFunctionsMapped.java
index 5cdadd7..d0edb5c 100644
--- a/src/com/google/javascript/jscomp/NameAnonymousFunctionsMapped.java
+++ b/src/com/google/javascript/jscomp/NameAnonymousFunctionsMapped.java
@@ -66,7 +66,7 @@
     AnonymousFunctionNamingCallback namingCallback =
         new AnonymousFunctionNamingCallback(new MappedFunctionNamer());
     NodeTraversal.traverse(compiler, root, namingCallback);
-    logger.info("Named " + namedCount + " anon functions using " +
+    logger.fine("Named " + namedCount + " anon functions using " +
         bytesUsed + " bytes");
     if (namedCount > 0) {
       compiler.reportCodeChange();
