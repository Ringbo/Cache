diff --git a/plugins/git4idea/src/git4idea/Git.java b/plugins/git4idea/src/git4idea/Git.java
index d226afd..cd43843 100644
--- a/plugins/git4idea/src/git4idea/Git.java
+++ b/plugins/git4idea/src/git4idea/Git.java
@@ -49,9 +49,9 @@
    * // TODO use common format
    */
   public static void init(Project project, VirtualFile root) throws VcsException {
-    GitLineHandler h = new GitLineHandler(project, root, GitCommand.INIT);
+    GitSimpleHandler h = new GitSimpleHandler(project, root, GitCommand.INIT);
     h.setNoSSH(true);
-    GitHandlerUtil.runInCurrentThread(h, null);
+    h.run();
     if (!h.errors().isEmpty()) {
       throw h.errors().get(0);
     }
