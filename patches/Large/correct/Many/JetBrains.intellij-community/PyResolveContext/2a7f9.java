diff --git a/python/src/com/jetbrains/python/psi/resolve/PyResolveContext.java b/python/src/com/jetbrains/python/psi/resolve/PyResolveContext.java
index c61374a..9816e75 100644
--- a/python/src/com/jetbrains/python/psi/resolve/PyResolveContext.java
+++ b/python/src/com/jetbrains/python/psi/resolve/PyResolveContext.java
@@ -52,7 +52,7 @@
   }
 
   public TypeEvalContext getTypeEvalContext() {
-    return myTypeEvalContext != null ? myTypeEvalContext : TypeEvalContext.fast();
+    return myTypeEvalContext != null ? myTypeEvalContext : TypeEvalContext.fastStubOnly(null);
   }
 
   @Override
