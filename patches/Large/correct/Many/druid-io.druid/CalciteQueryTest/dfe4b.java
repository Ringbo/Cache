diff --git a/sql/src/test/java/io/druid/sql/calcite/CalciteQueryTest.java b/sql/src/test/java/io/druid/sql/calcite/CalciteQueryTest.java
index 69a867d..8393a92 100644
--- a/sql/src/test/java/io/druid/sql/calcite/CalciteQueryTest.java
+++ b/sql/src/test/java/io/druid/sql/calcite/CalciteQueryTest.java
@@ -1350,7 +1350,7 @@
   public void testExpressionAggregations() throws Exception
   {
     testQuery(
-        "SELECT SUM(cnt * 3), LN(SUM(cnt) + SUM(m1)) FROM druid.foo",
+        "SELECT SUM(cnt * 3), LN(SUM(cnt) + SUM(m1)), SUM(cnt) / 0.25 FROM druid.foo",
         ImmutableList.<Query>of(
             Druids.newTimeseriesQueryBuilder()
                   .dataSource(CalciteTests.DATASOURCE1)
@@ -1361,14 +1361,18 @@
                       new LongSumAggregatorFactory("a1", "cnt", null),
                       new DoubleSumAggregatorFactory("a2", "m1", null)
                   ))
-                  .postAggregators(ImmutableList.<PostAggregator>of(
-                      new ExpressionPostAggregator("a3", "log((\"a1\" + \"a2\"))")
+                  .postAggregators(ImmutableList.of(
+                      new ExpressionPostAggregator("a3", "log((\"a1\" + \"a2\"))"),
+                      new ArithmeticPostAggregator("a4", "quotient", ImmutableList.of(
+                          new FieldAccessPostAggregator(null, "a1"),
+                          new ConstantPostAggregator(null, 0.25)
+                      ))
                   ))
                   .context(TIMESERIES_CONTEXT_DEFAULT)
                   .build()
         ),
         ImmutableList.of(
-            new Object[]{18L, 3.295836866004329}
+            new Object[]{18L, 3.295836866004329, 24.0}
         )
     );
   }
