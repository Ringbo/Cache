diff --git a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/GenMapRedUtils.java b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/GenMapRedUtils.java
index e350fe7..f86941b 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/GenMapRedUtils.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/GenMapRedUtils.java
@@ -324,7 +324,7 @@
     mapredWork work = new mapredWork();
     work.setPathToAliases(new LinkedHashMap<String, ArrayList<String>>());
     work.setPathToPartitionInfo(new LinkedHashMap<String, partitionDesc>());
-    work.setAliasToWork(new HashMap<String, Operator<? extends Serializable>>());
+    work.setAliasToWork(new LinkedHashMap<String, Operator<? extends Serializable>>());
     work.setTagToValueDesc(new ArrayList<tableDesc>());
     work.setReducer(null);
     return work;
