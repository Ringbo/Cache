diff --git a/src/be/ibridge/kettle/spoon/SpoonGraph.java b/src/be/ibridge/kettle/spoon/SpoonGraph.java
index 3fd17bc..fb2ff41 100644
--- a/src/be/ibridge/kettle/spoon/SpoonGraph.java
+++ b/src/be/ibridge/kettle/spoon/SpoonGraph.java
@@ -754,7 +754,7 @@
     	                        String stepID = steploader.getStepPluginID(tii);
     	                        StepPlugin stepPlugin = steploader.findStepPluginWithID(stepID);
     	                        String stepName = spoon.getTransMeta().getAlternativeStepname(stepPlugin.getDescription());
-    	                        stepMeta = new StepMeta(log, stepID, stepName, tii);
+    	                        stepMeta = new StepMeta(stepID, stepName, tii);
     	                        if (spoon.editStepInfo(stepMeta) != null)
     	                        {
     	                            spoon.getTransMeta().addStep(stepMeta);
