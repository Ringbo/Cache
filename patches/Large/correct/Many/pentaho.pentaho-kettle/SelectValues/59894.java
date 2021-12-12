diff --git a/src/org/pentaho/di/trans/steps/selectvalues/SelectValues.java b/src/org/pentaho/di/trans/steps/selectvalues/SelectValues.java
index a22e84f..1e51310 100644
--- a/src/org/pentaho/di/trans/steps/selectvalues/SelectValues.java
+++ b/src/org/pentaho/di/trans/steps/selectvalues/SelectValues.java
@@ -374,7 +374,7 @@
         // Send the row on its way
 		putRow(data.metadataRowMeta, outputData);
         
-		if (log.isRowLevel()) logRowlevel(Messages.getString("SelectValues.Log.WroteRowToNextStep")+data.metadataRowMeta.getString(rowData)); //$NON-NLS-1$
+		if (log.isRowLevel()) logRowlevel(Messages.getString("SelectValues.Log.WroteRowToNextStep")+data.metadataRowMeta.getString(outputData)); //$NON-NLS-1$
 
         if (checkFeedback(getLinesRead())) logBasic(Messages.getString("SelectValues.Log.LineNumber")+getLinesRead()); //$NON-NLS-1$
 			
