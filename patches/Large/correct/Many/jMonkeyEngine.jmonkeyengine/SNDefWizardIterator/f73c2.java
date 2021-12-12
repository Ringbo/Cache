diff --git a/sdk/jme3-materialeditor/src/com/jme3/gde/shadernodedefinition/wizard/SNDefWizardIterator.java b/sdk/jme3-materialeditor/src/com/jme3/gde/shadernodedefinition/wizard/SNDefWizardIterator.java
index 0fdabe1..6ced1f1 100644
--- a/sdk/jme3-materialeditor/src/com/jme3/gde/shadernodedefinition/wizard/SNDefWizardIterator.java
+++ b/sdk/jme3-materialeditor/src/com/jme3/gde/shadernodedefinition/wizard/SNDefWizardIterator.java
@@ -102,7 +102,7 @@
 
         //Get the template and convert it:
         FileObject tplSnd = Templates.getTemplate(wizard);
-        FileObject tplShd = tplSnd.getParent().getChildren()[1];
+        FileObject tplShd = tplSnd.getParent().getChildren()[0];
 
         DataObject templateSnd = DataObject.find(tplSnd);
         DataObject templateShd = DataObject.find(tplShd);
