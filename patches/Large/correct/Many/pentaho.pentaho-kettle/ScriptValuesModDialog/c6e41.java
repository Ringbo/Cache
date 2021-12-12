diff --git a/src-ui/org/pentaho/di/ui/trans/steps/scriptvalues_mod/ScriptValuesModDialog.java b/src-ui/org/pentaho/di/ui/trans/steps/scriptvalues_mod/ScriptValuesModDialog.java
index d4bba43..626589c 100644
--- a/src-ui/org/pentaho/di/ui/trans/steps/scriptvalues_mod/ScriptValuesModDialog.java
+++ b/src-ui/org/pentaho/di/ui/trans/steps/scriptvalues_mod/ScriptValuesModDialog.java
@@ -900,7 +900,7 @@
 		
 		jscx = Context.enter();
 		jscx.setOptimizationLevel(-1);
-		jsscope = jscx.initStandardObjects(null);
+		jsscope = jscx.initStandardObjects(null, false);
 				
 		// Adding the existing Scripts to the Context
 		for(int i=0;i<folder.getItemCount();i++){
