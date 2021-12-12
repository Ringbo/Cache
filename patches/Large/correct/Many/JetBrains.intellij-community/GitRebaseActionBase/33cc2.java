diff --git a/plugins/git4idea/src/git4idea/actions/GitRebaseActionBase.java b/plugins/git4idea/src/git4idea/actions/GitRebaseActionBase.java
index 6131b76..0df9c7b 100644
--- a/plugins/git4idea/src/git4idea/actions/GitRebaseActionBase.java
+++ b/plugins/git4idea/src/git4idea/actions/GitRebaseActionBase.java
@@ -56,7 +56,7 @@
     affectedRoots.add(root);
     try {
       service.configureHandler(h, editor.getHandlerNo());
-      GitHandlerUtil.doSynchronously(h, GitBundle.getString("rebasing.title"), h.printableCommandLine());
+      GitHandlerUtil.doSynchronously(h, GitBundle.getString("rebasing.title"), h.printableCommandLine(), false);
     }
     finally {
       editor.close();
