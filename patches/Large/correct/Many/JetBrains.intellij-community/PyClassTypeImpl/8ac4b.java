diff --git a/python/src/com/jetbrains/python/psi/types/PyClassTypeImpl.java b/python/src/com/jetbrains/python/psi/types/PyClassTypeImpl.java
index 10a6f23..fc32159 100644
--- a/python/src/com/jetbrains/python/psi/types/PyClassTypeImpl.java
+++ b/python/src/com/jetbrains/python/psi/types/PyClassTypeImpl.java
@@ -192,7 +192,7 @@
           }
         }
         if (type != null) {
-          final List<? extends RatedResolveResult> results = type.resolveMember(name, location, direction, resolveContext);
+          final List<? extends RatedResolveResult> results = type.resolveMember(name, location, direction, resolveContext, false);
           if (results != null && !results.isEmpty()) {
             return results;
           }
