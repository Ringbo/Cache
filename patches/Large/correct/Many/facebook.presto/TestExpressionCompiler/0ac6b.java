diff --git a/presto-main/src/test/java/com/facebook/presto/sql/gen/TestExpressionCompiler.java b/presto-main/src/test/java/com/facebook/presto/sql/gen/TestExpressionCompiler.java
index 9c4e451..03cc31d 100644
--- a/presto-main/src/test/java/com/facebook/presto/sql/gen/TestExpressionCompiler.java
+++ b/presto-main/src/test/java/com/facebook/presto/sql/gen/TestExpressionCompiler.java
@@ -993,7 +993,7 @@
         ImmutableList.Builder<String> expressions = ImmutableList.builder();
         Set<List<String>> valueLists = Sets.cartesianProduct(unrolledValues);
         for (List<String> valueList : valueLists) {
-            expressions.add(String.format(expressionPattern, valueList.toArray(new String[valueList.size()])));
+            expressions.add(String.format(expressionPattern, valueList.toArray(new Object[valueList.size()])));
         }
         return expressions.build();
     }
