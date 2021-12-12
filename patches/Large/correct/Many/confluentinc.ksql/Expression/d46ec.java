diff --git a/ksql-core/src/main/java/io/confluent/ksql/parser/tree/Expression.java b/ksql-core/src/main/java/io/confluent/ksql/parser/tree/Expression.java
index ad182d1..2c311fc 100644
--- a/ksql-core/src/main/java/io/confluent/ksql/parser/tree/Expression.java
+++ b/ksql-core/src/main/java/io/confluent/ksql/parser/tree/Expression.java
@@ -36,7 +36,7 @@
     try {
       return CodegenExpressionFormatter.formatExpression(this, schema);
     } catch (Exception e) {
-      throw new KsqlException(e.getMessage());
+      throw new KsqlException(e.getMessage(), e);
     }
   }
 }
