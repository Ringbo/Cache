diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/actions/ConfigureBranchesAction.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/actions/ConfigureBranchesAction.java
index dbb0dfe..af21c28 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/actions/ConfigureBranchesAction.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/actions/ConfigureBranchesAction.java
@@ -39,7 +39,8 @@
     final Project project = PlatformDataKeys.PROJECT.getData(e.getDataContext());
     final ChangeList[] cls = e.getData(VcsDataKeys.CHANGE_LISTS);
     if ((cls == null) || (cls.length == 0) ||
-        (! SvnVcs.getInstance(project).getName().equals(((CommittedChangeList) cls[0]).getVcs().getName()))) {
+        (! SvnVcs.getInstance(project).getName().equals(((CommittedChangeList) cls[0]).getVcs().getName())) ||
+        (((SvnChangeList) cls[0]).getVcsRoot() == null)) {
       return;
     }
     final SvnChangeList svnList = (SvnChangeList) cls[0];
