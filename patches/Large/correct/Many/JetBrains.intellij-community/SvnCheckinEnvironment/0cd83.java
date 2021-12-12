diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/checkin/SvnCheckinEnvironment.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/checkin/SvnCheckinEnvironment.java
index 7fe426c..517618c 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/checkin/SvnCheckinEnvironment.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/checkin/SvnCheckinEnvironment.java
@@ -64,7 +64,7 @@
   }
 
   public RollbackProvider createRollbackProviderOn(AbstractRevisions[] selectedRevisions, final boolean containsExcluded) {
-    return new SvnRollbackProvider(selectedRevisions, mySvnVcs, containsExcluded);
+    return new SvnRollbackProvider(selectedRevisions, mySvnVcs);
   }
 
   public DifferenceType[] getAdditionalDifferenceTypes() {
