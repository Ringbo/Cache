diff --git a/sql/src/test/java/io/crate/operation/scalar/cast/ToLongFunctionTest.java b/sql/src/test/java/io/crate/operation/scalar/cast/ToLongFunctionTest.java
index 12d5145..dd26dd8 100644
--- a/sql/src/test/java/io/crate/operation/scalar/cast/ToLongFunctionTest.java
+++ b/sql/src/test/java/io/crate/operation/scalar/cast/ToLongFunctionTest.java
@@ -104,7 +104,7 @@
 
     @Test
     public void testEvaluateOnFloatAndDouble() throws Exception {
-        assertThat(evaluate(123.5, DataTypes.FLOAT), is(123L));
+        assertThat(evaluate(123.5f, DataTypes.FLOAT), is(123L));
         assertThat(evaluate(123.5d, DataTypes.DOUBLE), is(123L));
         assertThat(evaluate(null, DataTypes.FLOAT), nullValue());
         assertThat(evaluate(null, DataTypes.DOUBLE), nullValue());
