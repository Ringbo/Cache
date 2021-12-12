diff --git a/ql/src/test/org/apache/hadoop/hive/ql/exec/TestPlan.java b/ql/src/test/org/apache/hadoop/hive/ql/exec/TestPlan.java
index e9f4fde..680e674 100644
--- a/ql/src/test/org/apache/hadoop/hive/ql/exec/TestPlan.java
+++ b/ql/src/test/org/apache/hadoop/hive/ql/exec/TestPlan.java
@@ -61,7 +61,7 @@
       LinkedHashMap<String, partitionDesc> pt = new LinkedHashMap<String, partitionDesc> ();
       pt.put("/tmp/testfolder", partDesc);
 
-      HashMap<String, Operator<? extends Serializable>> ao = new HashMap<String, Operator<? extends Serializable>> ();
+      LinkedHashMap<String, Operator<? extends Serializable>> ao = new LinkedHashMap<String, Operator<? extends Serializable>> ();
       ao.put("a", op);
 
       mapredWork mrwork = new mapredWork();
