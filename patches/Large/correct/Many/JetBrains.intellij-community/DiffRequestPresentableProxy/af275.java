diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/DiffRequestPresentableProxy.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/DiffRequestPresentableProxy.java
index 95afea7..b80bf64 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/DiffRequestPresentableProxy.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/DiffRequestPresentableProxy.java
@@ -58,7 +58,7 @@
       myStepResult = request.step(context);
     }
     catch (VcsException e) {
-      myStepResult = new MyResult(null, DiffPresentationReturnValue.quit);
+      myStepResult = new MyResult(null, DiffPresentationReturnValue.quit, e.getMessage());
     }
     return myStepResult;
   }
