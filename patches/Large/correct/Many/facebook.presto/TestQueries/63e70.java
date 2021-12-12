diff --git a/src/test/java/com/facebook/presto/TestQueries.java b/src/test/java/com/facebook/presto/TestQueries.java
index f353f01..40b448d 100644
--- a/src/test/java/com/facebook/presto/TestQueries.java
+++ b/src/test/java/com/facebook/presto/TestQueries.java
@@ -241,7 +241,7 @@
     @Test
     public void testCountWithAndPredicate()
     {
-        List<Tuple> expected = computeExpected("SELECT COUNT(*) FROM lineitem WHERE tax < discount AND tax > 0.01 AND discount < 10.0", FIXED_INT_64);
+        List<Tuple> expected = computeExpected("SELECT COUNT(*) FROM lineitem WHERE tax < discount AND tax > 0.01 AND discount < 0.05", FIXED_INT_64);
 
         TupleStream discount = createTupleStream(lineitemData, Column.LINEITEM_DISCOUNT, DOUBLE);
         TupleStream filteredDiscount = new ApplyPredicateOperator(discount, new Predicate<Cursor>()
@@ -249,7 +249,7 @@
             @Override
             public boolean apply(Cursor input)
             {
-                return input.getDouble(0) < 10.0;
+                return input.getDouble(0) < 0.05;
             }
         });
 
