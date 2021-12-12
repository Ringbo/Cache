diff --git a/src-ui/org/pentaho/di/ui/trans/steps/userdefinedjavaclass/UserDefinedJavaClassDialog.java b/src-ui/org/pentaho/di/ui/trans/steps/userdefinedjavaclass/UserDefinedJavaClassDialog.java
index b700c5a..78ba617 100644
--- a/src-ui/org/pentaho/di/ui/trans/steps/userdefinedjavaclass/UserDefinedJavaClassDialog.java
+++ b/src-ui/org/pentaho/di/ui/trans/steps/userdefinedjavaclass/UserDefinedJavaClassDialog.java
@@ -694,7 +694,7 @@
 		fdlFields.top = new FormAttachment(0, 0);
 		wlFields.setLayoutData(fdlFields);
 
-		final int nrRows = input.getInfoStepDefinitions().size();
+		final int nrRows = input.getTargetStepDefinitions().size();
 		ColumnInfo[] colinf = new ColumnInfo[] {
 						new ColumnInfo(
 										BaseMessages.getString(PKG, "UserDefinedJavaClassDialog.ColumnInfo.StepTag"), ColumnInfo.COLUMN_TYPE_TEXT, false), //$NON-NLS-1$
