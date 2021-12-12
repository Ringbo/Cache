diff --git a/src/org/pentaho/di/trans/steps/scriptvalues_mod/ScriptValuesMod.java b/src/org/pentaho/di/trans/steps/scriptvalues_mod/ScriptValuesMod.java
index dba5394..c2ea6c8 100644
--- a/src/org/pentaho/di/trans/steps/scriptvalues_mod/ScriptValuesMod.java
+++ b/src/org/pentaho/di/trans/steps/scriptvalues_mod/ScriptValuesMod.java
@@ -143,7 +143,7 @@
 
             data.cx = Context.enter();
             data.cx.setOptimizationLevel(9);
-            data.scope = data.cx.initStandardObjects(null, true);
+            data.scope = data.cx.initStandardObjects(null, false);
 
             bFirstRun = true;
 
