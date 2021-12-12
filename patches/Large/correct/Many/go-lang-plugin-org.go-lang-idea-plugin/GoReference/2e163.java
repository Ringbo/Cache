diff --git a/src/com/goide/psi/impl/GoReference.java b/src/com/goide/psi/impl/GoReference.java
index f40cff5..10b759f 100644
--- a/src/com/goide/psi/impl/GoReference.java
+++ b/src/com/goide/psi/impl/GoReference.java
@@ -247,7 +247,7 @@
     if (resolve instanceof GoTypeSpec) {
       GoType resolveType = ((GoTypeSpec)resolve).getType();
       if (resolveType != null && (recursiveStopper == null || !resolveType.textMatches(recursiveStopper)) &&
-          !processExistingType(resolveType, processor, state)) {
+          !processGoType(resolveType, processor, state)) {
         return false;
       }
     }
