diff --git a/src/org/pentaho/di/trans/steps/scriptvalues_mod/ScriptValuesMod.java b/src/org/pentaho/di/trans/steps/scriptvalues_mod/ScriptValuesMod.java
index 55f1f24..77f66b8 100644
--- a/src/org/pentaho/di/trans/steps/scriptvalues_mod/ScriptValuesMod.java
+++ b/src/org/pentaho/di/trans/steps/scriptvalues_mod/ScriptValuesMod.java
@@ -176,7 +176,7 @@
       
       try {
          String optimizationLevelAsString = environmentSubstitute(meta.getOptimizationLevel());
-         if (!Const.isEmpty(optimizationLevelAsString.trim())) {
+         if (!Const.isEmpty(Const.trim(optimizationLevelAsString))) {
             data.cx.setOptimizationLevel(Integer.parseInt(optimizationLevelAsString.trim()));
             logBasic(BaseMessages.getString(PKG, "ScriptValuesMod.Optimization.Level", environmentSubstitute(meta.getOptimizationLevel())));
          }
