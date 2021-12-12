diff --git a/src-ui/org/pentaho/di/ui/trans/steps/textfileoutput/TextFileOutputDialog.java b/src-ui/org/pentaho/di/ui/trans/steps/textfileoutput/TextFileOutputDialog.java
index 982fd1c..9545d55 100644
--- a/src-ui/org/pentaho/di/ui/trans/steps/textfileoutput/TextFileOutputDialog.java
+++ b/src-ui/org/pentaho/di/ui/trans/steps/textfileoutput/TextFileOutputDialog.java
@@ -1243,7 +1243,7 @@
 		wAddDate.setSelection(input.isDateInFilename());
 		wAddTime.setSelection(input.isTimeInFilename());
 		if (input.getDateTimeFormat()!= null) wDateTimeFormat.setText( input.getDateTimeFormat() );
-		wSpecifyFormat.setSelection(input.isSpecifyFormat());
+		wSpecifyFormat.setSelection(input.isSpecifyingFormat());
 		
 		wAppend.setSelection(input.isFileAppended());
 		wAddStepnr.setSelection(input.isStepNrInFilename());
@@ -1313,7 +1313,7 @@
 		tfoi.setDateInFilename( wAddDate.getSelection() );
 		tfoi.setTimeInFilename( wAddTime.getSelection() );
 		tfoi.setDateTimeFormat(wDateTimeFormat.getText());
-		tfoi.setSpecifyFormat(wSpecifyFormat.getSelection());
+		tfoi.setSpecifyingFormat(wSpecifyFormat.getSelection());
 		tfoi.setPadded( wPad.getSelection() );
 		tfoi.setAddToResultFiles( wAddToResult.getSelection() );
 		tfoi.setFastDump( wFastDump.getSelection() );
