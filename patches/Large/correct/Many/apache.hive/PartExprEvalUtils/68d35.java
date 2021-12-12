diff --git a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/ppr/PartExprEvalUtils.java b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/ppr/PartExprEvalUtils.java
index 1103d35..d80c8f5 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/ppr/PartExprEvalUtils.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/ppr/PartExprEvalUtils.java
@@ -61,7 +61,7 @@
     String[] partKeyTypes = pcolTypes.trim().split(":");
 
     if (partSpec.size() != partKeyTypes.length) {
-        throw new HiveException("Internal error : Partition Spec size, " + partProps.size() +
+        throw new HiveException("Internal error : Partition Spec size, " + partSpec.size() +
                 " doesn't match partition key definition size, " + partKeyTypes.length);
     }
     boolean hasVC = vcs != null && !vcs.isEmpty();
