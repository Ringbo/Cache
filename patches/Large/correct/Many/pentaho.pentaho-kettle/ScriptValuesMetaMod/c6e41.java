diff --git a/src/org/pentaho/di/trans/steps/scriptvalues_mod/ScriptValuesMetaMod.java b/src/org/pentaho/di/trans/steps/scriptvalues_mod/ScriptValuesMetaMod.java
index 1741d32..cbab881 100644
--- a/src/org/pentaho/di/trans/steps/scriptvalues_mod/ScriptValuesMetaMod.java
+++ b/src/org/pentaho/di/trans/steps/scriptvalues_mod/ScriptValuesMetaMod.java
@@ -450,7 +450,7 @@
 		Script jsscript;
 
 		jscx = Context.enter();
-		jsscope = jscx.initStandardObjects(null);
+		jsscope = jscx.initStandardObjects(null, false);
 		jscx.setOptimizationLevel(-1);
 			
 		// String strActiveScriptName="";
