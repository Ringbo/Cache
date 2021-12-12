diff --git a/ql/src/test/org/apache/hadoop/hive/ql/exec/TestOperators.java b/ql/src/test/org/apache/hadoop/hive/ql/exec/TestOperators.java
index 79385dc..44398a5 100644
--- a/ql/src/test/org/apache/hadoop/hive/ql/exec/TestOperators.java
+++ b/ql/src/test/org/apache/hadoop/hive/ql/exec/TestOperators.java
@@ -262,7 +262,7 @@
       cdop1.setConf(cd);
       CollectOperator cdop2 = (CollectOperator) OperatorFactory.get(collectDesc.class);
       cdop2.setConf(cd);
-      HashMap<String,Operator<? extends Serializable>> aliasToWork = new HashMap<String,Operator<? extends Serializable>> ();
+      LinkedHashMap<String,Operator<? extends Serializable>> aliasToWork = new LinkedHashMap<String,Operator<? extends Serializable>> ();
       aliasToWork.put("a", cdop1);
       aliasToWork.put("b", cdop2);
 
