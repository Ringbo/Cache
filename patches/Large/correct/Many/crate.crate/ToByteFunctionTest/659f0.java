diff --git a/sql/src/test/java/io/crate/operation/scalar/cast/ToByteFunctionTest.java b/sql/src/test/java/io/crate/operation/scalar/cast/ToByteFunctionTest.java
index 8337048..b2692a4 100644
--- a/sql/src/test/java/io/crate/operation/scalar/cast/ToByteFunctionTest.java
+++ b/sql/src/test/java/io/crate/operation/scalar/cast/ToByteFunctionTest.java
@@ -86,7 +86,7 @@
     public void testEvaluate() throws Exception {
         assertThat(evaluate("123", DataTypes.STRING), is((byte)123));
         assertThat(evaluate(null, DataTypes.STRING), nullValue());
-        assertThat(evaluate(123.5, DataTypes.FLOAT), is((byte)123));
+        assertThat(evaluate(123.5f, DataTypes.FLOAT), is((byte)123));
         assertThat(evaluate(123.5d, DataTypes.DOUBLE), is((byte)123));
         assertThat(evaluate(null, DataTypes.FLOAT), nullValue());
         assertThat(evaluate(42L, DataTypes.LONG), is((byte)42));
