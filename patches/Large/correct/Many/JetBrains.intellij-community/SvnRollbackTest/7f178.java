diff --git a/plugins/svn4idea/testSource/org/jetbrains/idea/svn/SvnRollbackTest.java b/plugins/svn4idea/testSource/org/jetbrains/idea/svn/SvnRollbackTest.java
index 8d7d37d..002ecaf 100644
--- a/plugins/svn4idea/testSource/org/jetbrains/idea/svn/SvnRollbackTest.java
+++ b/plugins/svn4idea/testSource/org/jetbrains/idea/svn/SvnRollbackTest.java
@@ -544,13 +544,14 @@
     disableSilentOperation(VcsConfiguration.StandardConfirmation.REMOVE);
 
     deleteFileInCommand(tree.mySourceDir);
-    runAndVerifyStatusSorted(
+    runAndVerifyStatus(
+      "D root" + File.separator + "source",
+      "> moved to root" + File.separator + "target" + File.separator + "source",
+      "D root" + File.separator + "source" + File.separator + "s1.txt",
+      "D root" + File.separator + "source" + File.separator + "s2.txt",
       "! root" + File.separator + "target" + File.separator + "source",
       "! root" + File.separator + "target" + File.separator + "source" + File.separator + "s1.txt",
-      "! root" + File.separator + "target" + File.separator + "source" + File.separator + "s2.txt",
-           "D root" + File.separator + "source",
-           "D root" + File.separator + "source" + File.separator + "s1.txt",
-           "D root" + File.separator + "source" + File.separator + "s2.txt"
+      "! root" + File.separator + "target" + File.separator + "source" + File.separator + "s2.txt"
     );
 
     assertRollbackLocallyDeleted(singletonList(getFilePath(was, true)), emptyList());
