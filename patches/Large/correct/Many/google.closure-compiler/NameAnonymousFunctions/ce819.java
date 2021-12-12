diff --git a/src/com/google/javascript/jscomp/NameAnonymousFunctions.java b/src/com/google/javascript/jscomp/NameAnonymousFunctions.java
index d58507a..9f85ad0 100644
--- a/src/com/google/javascript/jscomp/NameAnonymousFunctions.java
+++ b/src/com/google/javascript/jscomp/NameAnonymousFunctions.java
@@ -53,7 +53,7 @@
     AnonymousFunctionNamingCallback namingCallback =
         new AnonymousFunctionNamingCallback(new AnonymousFunctionNamer());
     NodeTraversal.traverse(compiler, root, namingCallback);
-    logger.info("Named " + namedCount + " anon functions using " +
+    logger.fine("Named " + namedCount + " anon functions using " +
         bytesUsed + " bytes");
   }
 
