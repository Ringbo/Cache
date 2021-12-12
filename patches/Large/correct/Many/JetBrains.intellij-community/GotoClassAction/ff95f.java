diff --git a/platform/lang-impl/src/com/intellij/ide/actions/GotoClassAction.java b/platform/lang-impl/src/com/intellij/ide/actions/GotoClassAction.java
index a5217c1..3b8c239 100644
--- a/platform/lang-impl/src/com/intellij/ide/actions/GotoClassAction.java
+++ b/platform/lang-impl/src/com/intellij/ide/actions/GotoClassAction.java
@@ -40,7 +40,7 @@
       DumbService.getInstance(project).showDumbModeNotification("Goto Class action is not available until indices are built, using Goto File instead");
 
       myInAction = null;
-      new GotoFileAction().gotoActionPerformed(e);
+      new GotoFileAction().actionPerformed(e);
       return;
     }
 
