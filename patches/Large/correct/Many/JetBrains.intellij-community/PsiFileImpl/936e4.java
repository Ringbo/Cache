diff --git a/platform/core-impl/src/com/intellij/psi/impl/source/PsiFileImpl.java b/platform/core-impl/src/com/intellij/psi/impl/source/PsiFileImpl.java
index d3ff3e9..60a49fa 100644
--- a/platform/core-impl/src/com/intellij/psi/impl/source/PsiFileImpl.java
+++ b/platform/core-impl/src/com/intellij/psi/impl/source/PsiFileImpl.java
@@ -250,12 +250,12 @@
   }
 
   public boolean isStubBasedChildValid(@NotNull StubBasedPsiElementBase psi) {
-    StubElement fileStub = getStub();
+    StubTree fileStub = derefStub();
     if (fileStub != null) {
       synchronized (myStubLock) {
-        fileStub = getStub();
+        fileStub = derefStub();
         StubElement childStub = psi.getStub();
-        if (fileStub != null && childStub != null && fileStub != childStub.getParentStub()) {
+        if (fileStub != null && childStub != null && fileStub.getRoot() != childStub.getParentStub()) {
           return false;
         }
       }
