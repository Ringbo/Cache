diff --git a/platform/lang-impl/src/com/intellij/openapi/roots/impl/OrderRootsEnumeratorImpl.java b/platform/lang-impl/src/com/intellij/openapi/roots/impl/OrderRootsEnumeratorImpl.java
index e5f1622..1f2d867 100644
--- a/platform/lang-impl/src/com/intellij/openapi/roots/impl/OrderRootsEnumeratorImpl.java
+++ b/platform/lang-impl/src/com/intellij/openapi/roots/impl/OrderRootsEnumeratorImpl.java
@@ -85,7 +85,7 @@
   }
 
   private void checkCanUseCache() {
-    LOG.assertTrue(myCustomRootProvider != null, "Caching not supported for OrderRootsEnumerator with 'usingCustomRootProvider' option");
+    LOG.assertTrue(myCustomRootProvider == null, "Caching not supported for OrderRootsEnumerator with 'usingCustomRootProvider' option");
   }
 
   private Collection<VirtualFile> computeRoots() {
