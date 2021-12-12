diff --git a/sdks/java/extensions/sql/src/test/java/org/apache/beam/sdk/extensions/sql/BeamSqlDslUdfUdafTest.java b/sdks/java/extensions/sql/src/test/java/org/apache/beam/sdk/extensions/sql/BeamSqlDslUdfUdafTest.java
index 01e45c1..4589d39 100644
--- a/sdks/java/extensions/sql/src/test/java/org/apache/beam/sdk/extensions/sql/BeamSqlDslUdfUdafTest.java
+++ b/sdks/java/extensions/sql/src/test/java/org/apache/beam/sdk/extensions/sql/BeamSqlDslUdfUdafTest.java
@@ -98,7 +98,7 @@
 
     RowType subStrRowType = RowSqlType.builder()
         .withIntegerField("f_int")
-        .withIntegerField("sub_string")
+        .withVarcharField("sub_string")
         .build();
     Row subStrRow = Row.withRowType(subStrRowType).addValues(2, "s").build();
     PAssert.that(result3).containsInAnyOrder(subStrRow);
