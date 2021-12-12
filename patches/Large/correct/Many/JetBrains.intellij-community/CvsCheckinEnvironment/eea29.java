diff --git a/plugins/cvs2/source/com/intellij/cvsSupport2/checkinProject/CvsCheckinEnvironment.java b/plugins/cvs2/source/com/intellij/cvsSupport2/checkinProject/CvsCheckinEnvironment.java
index 2b4e2a3..74b39fd 100644
--- a/plugins/cvs2/source/com/intellij/cvsSupport2/checkinProject/CvsCheckinEnvironment.java
+++ b/plugins/cvs2/source/com/intellij/cvsSupport2/checkinProject/CvsCheckinEnvironment.java
@@ -51,7 +51,7 @@
 
 
   public RollbackProvider createRollbackProviderOn(AbstractRevisions[] selectedRevisions, final boolean containsExcluded) {
-    return new CvsRollbackProvider(myProject, selectedRevisions, containsExcluded);
+    return new CvsRollbackProvider(myProject, selectedRevisions);
   }
 
   public DifferenceType[] getAdditionalDifferenceTypes() {
