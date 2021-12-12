diff --git a/sql/src/test/java/io/crate/operation/scalar/cast/ToNullFunctionTest.java b/sql/src/test/java/io/crate/operation/scalar/cast/ToNullFunctionTest.java
index 90f0b57..7d7dc7a 100644
--- a/sql/src/test/java/io/crate/operation/scalar/cast/ToNullFunctionTest.java
+++ b/sql/src/test/java/io/crate/operation/scalar/cast/ToNullFunctionTest.java
@@ -85,7 +85,7 @@
     public void testEvaluate() throws Exception {
         assertThat(evaluate("hello", DataTypes.STRING), nullValue());
         assertThat(evaluate(null, DataTypes.STRING), nullValue());
-        assertThat(evaluate(123.5, DataTypes.FLOAT), nullValue());
+        assertThat(evaluate(123.5f, DataTypes.FLOAT), nullValue());
         assertThat(evaluate(123.5d, DataTypes.DOUBLE), nullValue());
         assertThat(evaluate(42L, DataTypes.LONG), nullValue());
     }
