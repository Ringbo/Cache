diff --git a/source/com/intellij/psi/impl/search/PsiSearchHelperImpl.java b/source/com/intellij/psi/impl/search/PsiSearchHelperImpl.java
index 785162b..5aa320b 100644
--- a/source/com/intellij/psi/impl/search/PsiSearchHelperImpl.java
+++ b/source/com/intellij/psi/impl/search/PsiSearchHelperImpl.java
@@ -533,7 +533,7 @@
       }
 
       // if we are under write action, additional threads will never get read action
-      if (!application.isUnitTestMode() && !application.isWriteAccessAllowed() && POOL_SIZE > 1) {
+      if (!application.isUnitTestMode() && !application.isWriteAccessAllowed() && POOL_SIZE > 0) {
         final int chunkSize = Math.max(10, files.length / POOL_SIZE / 20); // make at least 20 chunks per proc to balance load
         ArrayList<Callable<Boolean>> callables = new ArrayList<Callable<Boolean>>(files.length/chunkSize);
         final AtomicInteger counter = new AtomicInteger(0);
