diff --git a/ql/src/java/org/apache/hadoop/hive/ql/Driver.java b/ql/src/java/org/apache/hadoop/hive/ql/Driver.java
index 424f4fa..cc85f31 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/Driver.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/Driver.java
@@ -410,7 +410,7 @@
               HiveSemanticAnalyzerHook.class);
 
       // Do semantic analysis and plan generation
-      if (saHooks != null) {
+      if (saHooks != null && !saHooks.isEmpty()) {
         HiveSemanticAnalyzerHookContext hookCtx = new HiveSemanticAnalyzerHookContextImpl();
         hookCtx.setConf(conf);
         hookCtx.setUserName(userName);
