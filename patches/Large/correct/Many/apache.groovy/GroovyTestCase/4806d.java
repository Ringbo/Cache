diff --git a/src/main/groovy/util/GroovyTestCase.java b/src/main/groovy/util/GroovyTestCase.java
index 3891dc1..7ce676f 100644
--- a/src/main/groovy/util/GroovyTestCase.java
+++ b/src/main/groovy/util/GroovyTestCase.java
@@ -102,7 +102,7 @@
     protected void assertArrayEquals(Object[] expected, Object[] value) {
         String message =
             "expected array: " + InvokerHelper.toString(expected) + " value array: " + InvokerHelper.toString(value);
-        assertNotNull(message + ": expected should not be null", value);
+        assertNotNull(message + ": expected should not be null", expected);
         assertNotNull(message + ": value should not be null", value);
         assertEquals(message, expected.length, value.length);
         for (int i = 0, size = expected.length; i < size; i++) {
