diff --git a/sql/src/test/java/io/crate/operation/scalar/cast/ToFloatFunctionTest.java b/sql/src/test/java/io/crate/operation/scalar/cast/ToFloatFunctionTest.java
index 85f35be..5e41be9 100644
--- a/sql/src/test/java/io/crate/operation/scalar/cast/ToFloatFunctionTest.java
+++ b/sql/src/test/java/io/crate/operation/scalar/cast/ToFloatFunctionTest.java
@@ -87,7 +87,7 @@
     public void testEvaluate() throws Exception {
         assertThat(evaluate("123", DataTypes.STRING), is(123f));
         assertThat(evaluate(null, DataTypes.STRING), nullValue());
-        assertThat(evaluate(123.5, DataTypes.FLOAT), is(123.5f));
+        assertThat(evaluate(123.5f, DataTypes.FLOAT), is(123.5f));
         assertThat(evaluate(123.5d, DataTypes.DOUBLE), is(123.5f));
         assertThat(evaluate(null, DataTypes.FLOAT), nullValue());
         assertThat(evaluate(42L, DataTypes.LONG), is(42.0f));
