diff --git a/src-ui/org/pentaho/di/ui/trans/steps/xmlinputsax/XMLInputSaxDialog.java b/src-ui/org/pentaho/di/ui/trans/steps/xmlinputsax/XMLInputSaxDialog.java
index 9831c0c..785e2ed 100644
--- a/src-ui/org/pentaho/di/ui/trans/steps/xmlinputsax/XMLInputSaxDialog.java
+++ b/src-ui/org/pentaho/di/ui/trans/steps/xmlinputsax/XMLInputSaxDialog.java
@@ -568,13 +568,13 @@
 		fdAttributes = new FormData();
 		fdAttributes.left = new FormAttachment(0, 0);
 		fdAttributes.top = new FormAttachment(0, 0);
-		fdAttributes.right = new FormAttachment(20, 0);
+		fdAttributes.right = new FormAttachment(100, 0);
 		fdAttributes.bottom = new FormAttachment(15, 0);
 		wAttributes.setLayoutData(fdAttributes);
 
 		fdFields = new FormData();
 		fdFields.left = new FormAttachment(0, 0);
-		fdFields.top = new FormAttachment(wAttributes);
+		fdFields.top = new FormAttachment(wAttributes,margin*3);
 		fdFields.right = new FormAttachment(100, 0);
 		fdFields.bottom = new FormAttachment(wGet, -margin);
 		wFields.setLayoutData(fdFields);
