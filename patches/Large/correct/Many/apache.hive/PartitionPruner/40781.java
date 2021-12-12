diff --git a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/ppr/PartitionPruner.java b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/ppr/PartitionPruner.java
index c08c253..da3b1fe 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/ppr/PartitionPruner.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/ppr/PartitionPruner.java
@@ -202,7 +202,8 @@
         }
 
         if (prunerExpr == null) {
-          // add all partitions corresponding to the table
+          // This can happen when hive.mapred.mode=nonstrict and there is no predicates at all
+          // Add all partitions to the unknown_parts so that a MR job is generated.
           true_parts.addAll(Hive.get().getPartitions(tab));
         } else {
           // remove non-partition columns
@@ -213,7 +214,9 @@
               "; filter w/o compacting: " +
               ((prunerExpr != null) ? prunerExpr.getExprString(): "null"));
           if (compactExpr == null) {
-            true_parts.addAll(Hive.get().getPartitions(tab));
+            // This could happen when hive.mapred.mode=nonstrict and all the predicates
+            // are on non-partition columns.
+            unkn_parts.addAll(Hive.get().getPartitions(tab));
           } else if (Utilities.checkJDOPushDown(tab, compactExpr)) {
             String filter = compactExpr.getExprString();
             String oldFilter = prunerExpr.getExprString();
