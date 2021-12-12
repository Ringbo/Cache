diff --git a/src/org/pentaho/di/trans/steps/gpload/GPLoadMeta.java b/src/org/pentaho/di/trans/steps/gpload/GPLoadMeta.java
index ab1eb65..e209412 100644
--- a/src/org/pentaho/di/trans/steps/gpload/GPLoadMeta.java
+++ b/src/org/pentaho/di/trans/steps/gpload/GPLoadMeta.java
@@ -494,7 +494,7 @@
 			rep.saveStepAttribute(id_transformation, id_step, "update_condition", updateCondition);//$NON-NLS-1$
 
 			for (int i=0;i <localHosts.length; i++) {
-			   rep.saveStepAttribute(id_transformation, id_step, i, "local_host", fieldTable[i]);  //$NON-NLS-1$
+			   rep.saveStepAttribute(id_transformation, id_step, i, "local_host", localHosts[i]);  //$NON-NLS-1$
 			}
 			
 			for (int i=0;i<fieldTable.length;i++)
