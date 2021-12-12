diff --git a/presto-main/src/test/java/com/facebook/presto/type/TestArrayOperators.java b/presto-main/src/test/java/com/facebook/presto/type/TestArrayOperators.java
index 2028fdb..5d82fad 100644
--- a/presto-main/src/test/java/com/facebook/presto/type/TestArrayOperators.java
+++ b/presto-main/src/test/java/com/facebook/presto/type/TestArrayOperators.java
@@ -458,7 +458,8 @@
         assertInvalidFunction("ARRAY_SORT(ARRAY[color('red'), color('blue')])", FUNCTION_NOT_FOUND);
     }
 
-    @Test void testDistinct()
+    @Test
+    public void testDistinct()
             throws Exception
     {
         assertFunction("ARRAY_DISTINCT(ARRAY [])", new ArrayType(UNKNOWN), ImmutableList.of());
