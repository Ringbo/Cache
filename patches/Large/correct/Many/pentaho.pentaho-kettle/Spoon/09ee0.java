diff --git a/src/be/ibridge/kettle/spoon/Spoon.java b/src/be/ibridge/kettle/spoon/Spoon.java
index 333280a..3a26756 100644
--- a/src/be/ibridge/kettle/spoon/Spoon.java
+++ b/src/be/ibridge/kettle/spoon/Spoon.java
@@ -2119,7 +2119,7 @@
             for (int i=0;i<nr;i++)
             {
                 Node stepnode = XMLHandler.getSubNodeByNr(stepsnode, "step", i);
-                steps[i] = new StepMeta(log, stepnode, transMeta.getDatabases(), transMeta.getCounters());
+                steps[i] = new StepMeta(stepnode, transMeta.getDatabases(), transMeta.getCounters());
 
                 if (loc!=null)
                 {
@@ -3440,7 +3440,7 @@
                     StepDialogInterface dialog = info.getDialog(shell, info, transMeta, name);
                     name = dialog.open();
                 }
-                inf=new StepMeta(log, stepPlugin.getID()[0], name, info);
+                inf=new StepMeta(stepPlugin.getID()[0], name, info);
     
                 if (name!=null) // OK pressed in the dialog: we have a step-name
                 {
@@ -4532,7 +4532,7 @@
             StepLoader steploader = StepLoader.getInstance();
             
             String fromstepid = steploader.getStepPluginID(tii);
-            StepMeta fromstep = new StepMeta(log, fromstepid, fromstepname, (StepMetaInterface)tii );
+            StepMeta fromstep = new StepMeta(fromstepid, fromstepname, (StepMetaInterface)tii );
             fromstep.setLocation(150,100);
             fromstep.setDraw(true);
             fromstep.setDescription(Messages.getString("Spoon.Message.Note.ReadInformationFromTableOnDB",tablename,sourceDBInfo.getDatabaseName() ));
@@ -4568,7 +4568,7 @@
                 
                 String selstepname =Messages.getString("Spoon.Message.Note.HandleReservedWords"); //"Handle reserved words";
                 String selstepid = steploader.getStepPluginID(svi);
-                StepMeta selstep = new StepMeta(log, selstepid, selstepname, (StepMetaInterface)svi );
+                StepMeta selstep = new StepMeta(selstepid, selstepname, (StepMetaInterface)svi );
                 selstep.setLocation(350,100);
                 selstep.setDraw(true);
                 selstep.setDescription(Messages.getString("Spoon.Message.Note.RenamesReservedWords",targetDBInfo.getDatabaseTypeDesc()) );//"Renames reserved words for "+targetDBInfo.getDatabaseTypeDesc()
@@ -4593,7 +4593,7 @@
             toi.setTruncateTable( true );
             
             String tostepid = steploader.getStepPluginID(toi);
-            StepMeta tostep = new StepMeta(log, tostepid, tostepname, (StepMetaInterface)toi );
+            StepMeta tostep = new StepMeta(tostepid, tostepname, (StepMetaInterface)toi );
             tostep.setLocation(550,100);
             tostep.setDraw(true);
             tostep.setDescription(Messages.getString("Spoon.Message.Note.WriteInformationToTableOnDB2",tablename,targetDBInfo.getDatabaseName() ));//"Write information to table ["+tablename+"] on database ["+targetDBInfo+"]"
@@ -4991,7 +4991,7 @@
                     String stepName = stepMeta.getName()+" Mapping";
                     stepName = transMeta.getAlternativeStepname(stepName);  // if it's already there, rename it.
                     
-                    StepMeta newStep = new StepMeta(log, "SelectValues", stepName, svm);
+                    StepMeta newStep = new StepMeta("SelectValues", stepName, svm);
                     newStep.setLocation(stepMeta.getLocation().x+20, stepMeta.getLocation().y+20);
                     newStep.setDraw(true);
 
