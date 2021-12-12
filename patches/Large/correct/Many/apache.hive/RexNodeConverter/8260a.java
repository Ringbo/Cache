diff --git a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/translator/RexNodeConverter.java b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/translator/RexNodeConverter.java
index 9c929af..ee4f4ea 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/translator/RexNodeConverter.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/translator/RexNodeConverter.java
@@ -455,7 +455,7 @@
         // An alternative would be to throw CboSemanticException and fall back
         // to no CBO.
         RelDataType relType = cluster.getTypeFactory().createSqlType(SqlTypeName.DECIMAL,
-            bd.scale(), unscaled.toString().length());
+            unscaled.toString().length(), bd.scale());
         calciteLiteral = rexBuilder.makeExactLiteral(bd, relType);
       }
       break;
