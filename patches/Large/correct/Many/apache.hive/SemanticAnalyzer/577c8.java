diff --git a/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java b/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
index 590b828..15c86d2 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
@@ -8289,7 +8289,7 @@
       }
     }
 
-    if ( targetCondn == null ) {
+    if ( targetCondn == null || (nodeCondn.size() != targetCondn.size())) {
       return new ObjectPair(-1, null);
     }
 
