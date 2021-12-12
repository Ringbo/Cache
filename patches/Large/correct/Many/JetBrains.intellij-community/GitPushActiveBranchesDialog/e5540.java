diff --git a/plugins/git4idea/src/git4idea/checkin/GitPushActiveBranchesDialog.java b/plugins/git4idea/src/git4idea/checkin/GitPushActiveBranchesDialog.java
index cc8cfd1..76a37d7ab 100644
--- a/plugins/git4idea/src/git4idea/checkin/GitPushActiveBranchesDialog.java
+++ b/plugins/git4idea/src/git4idea/checkin/GitPushActiveBranchesDialog.java
@@ -759,12 +759,12 @@
         }
 
         if (postUiTask != null) {
-          ApplicationManager.getApplication().invokeAndWait(new Runnable() {
+          UIUtil.invokeAndWaitIfNeeded(new Runnable() {
             @Override
             public void run() {
               postUiTask.run(roots);
             }
-          }, ModalityState.stateForComponent(getRootPane()));
+          });
         }
       }
     };
