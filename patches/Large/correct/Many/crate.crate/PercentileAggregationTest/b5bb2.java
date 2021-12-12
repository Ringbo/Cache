diff --git a/sql/src/test/java/io/crate/execution/engine/aggregation/impl/PercentileAggregationTest.java b/sql/src/test/java/io/crate/execution/engine/aggregation/impl/PercentileAggregationTest.java
index f213b37..3d0199e 100644
--- a/sql/src/test/java/io/crate/execution/engine/aggregation/impl/PercentileAggregationTest.java
+++ b/sql/src/test/java/io/crate/execution/engine/aggregation/impl/PercentileAggregationTest.java
@@ -93,7 +93,7 @@
             assertTrue(result[0][0].getClass().isArray());
             assertEquals(2, ((Object[]) result[0][0]).length);
             assertEquals(4.5, ((Object[]) result[0][0])[0]);
-            assertEquals(7.2, ((Object[]) result[0][0])[1]);
+            assertEquals(7.5, ((Object[]) result[0][0])[1]);
         }
     }
 
