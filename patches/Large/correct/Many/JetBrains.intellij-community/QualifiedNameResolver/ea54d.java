diff --git a/python/src/com/jetbrains/python/psi/resolve/QualifiedNameResolver.java b/python/src/com/jetbrains/python/psi/resolve/QualifiedNameResolver.java
index abe6c1d..7759de0 100644
--- a/python/src/com/jetbrains/python/psi/resolve/QualifiedNameResolver.java
+++ b/python/src/com/jetbrains/python/psi/resolve/QualifiedNameResolver.java
@@ -130,7 +130,7 @@
 
     if (myAcceptRootAsTopLevelPackage && myQualifiedName.matchesPrefix(PyQualifiedName.fromDottedString(root.getName()))) {
       resolveResult = resolveInRoot(root.getParent(), sdk);
-      if (module != null) {
+      if (resolveResult != null) {
         results.add(resolveResult);
       }
     }
