diff --git a/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsDirtyScopeImpl.java b/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsDirtyScopeImpl.java
index 2b5aad3..f5146b0 100644
--- a/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsDirtyScopeImpl.java
+++ b/vcs-impl/src/com/intellij/openapi/vcs/changes/VcsDirtyScopeImpl.java
@@ -72,7 +72,7 @@
     return new THashSet<FilePath>(myDirtyDirectoriesRecursively);
   }
 
-  public synchronized void addDirtyDirRecursively(final FilePath newcomer) {
+  public void addDirtyDirRecursively(final FilePath newcomer) {
     ApplicationManager.getApplication().runReadAction(new Runnable() {
       public void run() {
         synchronized (VcsDirtyScopeImpl.this) {
