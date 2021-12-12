diff --git a/sql/src/test/java/io/crate/operation/scalar/cast/ToShortFunctionTest.java b/sql/src/test/java/io/crate/operation/scalar/cast/ToShortFunctionTest.java
index b3251a5..57f8212 100644
--- a/sql/src/test/java/io/crate/operation/scalar/cast/ToShortFunctionTest.java
+++ b/sql/src/test/java/io/crate/operation/scalar/cast/ToShortFunctionTest.java
@@ -86,7 +86,7 @@
     public void testEvaluate() throws Exception {
         assertThat(evaluate("123", DataTypes.STRING), is((short)123));
         assertThat(evaluate(null, DataTypes.STRING), nullValue());
-        assertThat(evaluate(123.5, DataTypes.FLOAT), is((short)123));
+        assertThat(evaluate(123.5f, DataTypes.FLOAT), is((short)123));
         assertThat(evaluate(123.5d, DataTypes.DOUBLE), is((short) 123));
         assertThat(evaluate(null, DataTypes.FLOAT), nullValue());
         assertThat(evaluate(42L, DataTypes.LONG), is((short)42));
