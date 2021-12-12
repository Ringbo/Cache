diff --git a/src-ui/org/pentaho/di/ui/trans/steps/xslt/XsltDialog.java b/src-ui/org/pentaho/di/ui/trans/steps/xslt/XsltDialog.java
index 44df995..342d8a8 100644
--- a/src-ui/org/pentaho/di/ui/trans/steps/xslt/XsltDialog.java
+++ b/src-ui/org/pentaho/di/ui/trans/steps/xslt/XsltDialog.java
@@ -483,7 +483,7 @@
 	     fdlOutputProperties.top  = new FormAttachment(0, margin);
 	     wlOutputProperties.setLayoutData(fdlOutputProperties);
 
-	     final int OutputPropertiesRows=input.getParameterField().length;
+	     final int OutputPropertiesRows=input.getOutputPropertyName().length;
 		
 		 colinf=new ColumnInfo[] { 
 		  new ColumnInfo(BaseMessages.getString(PKG, "XsltDialog.ColumnInfo.OutputProperties.Name"),      ColumnInfo.COLUMN_TYPE_CCOMBO, new String[] { "" }, false),
