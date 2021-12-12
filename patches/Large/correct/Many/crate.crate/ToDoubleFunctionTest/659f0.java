diff --git a/sql/src/test/java/io/crate/operation/scalar/cast/ToDoubleFunctionTest.java b/sql/src/test/java/io/crate/operation/scalar/cast/ToDoubleFunctionTest.java
index 17a7733..72bca60 100644
--- a/sql/src/test/java/io/crate/operation/scalar/cast/ToDoubleFunctionTest.java
+++ b/sql/src/test/java/io/crate/operation/scalar/cast/ToDoubleFunctionTest.java
@@ -86,7 +86,7 @@
     public void testEvaluate() throws Exception {
         assertThat(evaluate("123", DataTypes.STRING), is(123d));
         assertThat(evaluate(null, DataTypes.STRING), nullValue());
-        assertThat(evaluate(123.5, DataTypes.FLOAT), is(123.5d));
+        assertThat(evaluate(123.5f, DataTypes.FLOAT), is(123.5d));
         assertThat(evaluate(123.5d, DataTypes.DOUBLE), is(123.5d));
         assertThat(evaluate(null, DataTypes.FLOAT), nullValue());
         assertThat(evaluate(42L, DataTypes.LONG), is(42d));
