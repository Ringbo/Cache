diff --git a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/rules/HiveReduceExpressionsRule.java b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/rules/HiveReduceExpressionsRule.java
index 8f15ec7..1d2c4cc 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/rules/HiveReduceExpressionsRule.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/rules/HiveReduceExpressionsRule.java
@@ -582,7 +582,7 @@
       }
       node = super.visitCall(call);
       if (node != call) {
-        node = RexUtil.simplify(rexBuilder, node);
+        node = HiveRexUtil.simplify(rexBuilder, node);
       }
       return node;
     }
