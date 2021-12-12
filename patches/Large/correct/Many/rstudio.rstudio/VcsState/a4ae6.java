diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/vcs/common/model/VcsState.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/vcs/common/model/VcsState.java
index 7582f5d..c43dede 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/vcs/common/model/VcsState.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/vcs/common/model/VcsState.java
@@ -100,7 +100,7 @@
                return;
             }
 
-            if (status_ != null)
+            if (status_ != null && status != null)
             {
                for (int i = 0; i < status_.size(); i++)
                {
