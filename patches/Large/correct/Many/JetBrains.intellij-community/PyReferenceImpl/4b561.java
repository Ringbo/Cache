diff --git a/python/src/com/jetbrains/python/psi/impl/references/PyReferenceImpl.java b/python/src/com/jetbrains/python/psi/impl/references/PyReferenceImpl.java
index 2ccbb0d..ae61edd 100644
--- a/python/src/com/jetbrains/python/psi/impl/references/PyReferenceImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/references/PyReferenceImpl.java
@@ -508,7 +508,7 @@
     final int underscores = PyUtil.getInitialUnderscores(element.getName());
     final CompletionVariantsProcessor processor = new CompletionVariantsProcessor(element);
     final ScopeOwner owner = realContext instanceof ScopeOwner ? (ScopeOwner)realContext : ScopeUtil.getScopeOwner(realContext);
-    if (owner != null) {
+    if (owner != null && originalElement != null) {
       PyResolveUtil.scopeCrawlUp(processor, owner, null);
     }
 
