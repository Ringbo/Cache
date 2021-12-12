diff --git a/ql/src/java/org/apache/hadoop/hive/ql/parse/ImportSemanticAnalyzer.java b/ql/src/java/org/apache/hadoop/hive/ql/parse/ImportSemanticAnalyzer.java
index 3001575..5a8118c 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/parse/ImportSemanticAnalyzer.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/parse/ImportSemanticAnalyzer.java
@@ -309,7 +309,8 @@
               Warehouse.makePartPath(addPartitionDesc.getPartSpec()));
         }
       } else {
-        tgtPath = new Path(tblDesc.getLocation());
+        tgtPath = new Path(tblDesc.getLocation(),
+            Warehouse.makePartPath(addPartitionDesc.getPartSpec()));
       }
       checkTargetLocationEmpty(fs, tgtPath);
       addPartitionDesc.setLocation(tgtPath.toString());
