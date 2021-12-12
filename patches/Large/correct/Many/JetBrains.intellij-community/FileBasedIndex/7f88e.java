diff --git a/lang-impl/src/com/intellij/util/indexing/FileBasedIndex.java b/lang-impl/src/com/intellij/util/indexing/FileBasedIndex.java
index 625fa97..0cc0919 100644
--- a/lang-impl/src/com/intellij/util/indexing/FileBasedIndex.java
+++ b/lang-impl/src/com/intellij/util/indexing/FileBasedIndex.java
@@ -563,7 +563,7 @@
 
   private final class ChangedFilesUpdater extends VirtualFileAdapter implements CacheUpdater{
     private final Set<VirtualFile> myFileToUpdate = Collections.synchronizedSet(new HashSet<VirtualFile>());
-    private BlockingQueue<RunnableFuture<?>> myFutureInvalidations = new LinkedBlockingQueue<RunnableFuture<?>>();
+    private BlockingQueue<FutureTask<?>> myFutureInvalidations = new LinkedBlockingQueue<FutureTask<?>>();
     // No need to react on movement events since files stay valid, their ids don't change and all associated attributes remain intact.
 
     public void fileCreated(final VirtualFileEvent event) {
@@ -619,7 +619,7 @@
         if (toUpdate.size() > 0) {
           includeToUpdateSet(file);
           final FileContent fc = new FileContent(file, loadContent(file));
-          final RunnableFuture<?> future = (RunnableFuture<?>)myInvalidationService.submit(new Runnable() {
+          final FutureTask<?> future = (FutureTask<?>)myInvalidationService.submit(new Runnable() {
             public void run() {
               for (String indexId : toUpdate) {
                 try {
@@ -638,7 +638,7 @@
 
     private void ensureAllInvalidateTasksCompleted() {
       while (true) {
-        final RunnableFuture<?> future = myFutureInvalidations.poll();
+        final FutureTask<?> future = myFutureInvalidations.poll();
         if (future == null) {
           return;
         }
