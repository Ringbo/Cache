diff --git a/plugins/git4idea/src/git4idea/ui/branch/GitBranchWidget.java b/plugins/git4idea/src/git4idea/ui/branch/GitBranchWidget.java
index 80074fb..4d3497f 100644
--- a/plugins/git4idea/src/git4idea/ui/branch/GitBranchWidget.java
+++ b/plugins/git4idea/src/git4idea/ui/branch/GitBranchWidget.java
@@ -136,7 +136,7 @@
       @Override
       public void run() {
         Project project = getProject();
-        if (project == null) {
+        if (project == null || project.isDisposed()) {
           emptyTextAndTooltip();
           return;
         }
