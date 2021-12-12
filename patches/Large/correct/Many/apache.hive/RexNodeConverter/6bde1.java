diff --git a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/translator/RexNodeConverter.java b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/translator/RexNodeConverter.java
index f53739d..39ff591 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/translator/RexNodeConverter.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/translator/RexNodeConverter.java
@@ -337,7 +337,7 @@
         // If it is a floor <date> operator, we need to rewrite it
         childRexNodeLst = rewriteFloorDateChildren(calciteOp, childRexNodeLst);
       }
-      expr = cluster.getRexBuilder().makeCall(calciteOp, childRexNodeLst);
+      expr = cluster.getRexBuilder().makeCall(retType, calciteOp, childRexNodeLst);
     } else {
       retType = expr.getType();
     }
