diff --git a/ql/src/java/org/apache/hadoop/hive/ql/plan/PlanUtils.java b/ql/src/java/org/apache/hadoop/hive/ql/plan/PlanUtils.java
index 7fd7bcd..03bfaaa 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/plan/PlanUtils.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/plan/PlanUtils.java
@@ -49,7 +49,7 @@
     return new mapredWork("", 
                           new LinkedHashMap<String, ArrayList<String>> (),
                           new LinkedHashMap<String, partitionDesc> (),
-                          new HashMap<String, Operator<? extends Serializable>> (),
+                          new LinkedHashMap<String, Operator<? extends Serializable>> (),
                           new tableDesc(),
                           new ArrayList<tableDesc> (),
                           null,
