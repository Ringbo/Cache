diff --git a/src/test/java/org/nlpcn/es4sql/AggregationTest.java b/src/test/java/org/nlpcn/es4sql/AggregationTest.java
index cd586b1..75a2d2a 100644
--- a/src/test/java/org/nlpcn/es4sql/AggregationTest.java
+++ b/src/test/java/org/nlpcn/es4sql/AggregationTest.java
@@ -74,7 +74,7 @@
 		Aggregations result = query(String.format("SELECT STATS(age) FROM %s/account", TEST_INDEX));
 		Stats stats = result.get("STATS(age)");
 		Assert.assertEquals(1000, stats.getCount());
-		assertThat(stats.getSum(), equalTo(25714837.0));
+		assertThat(stats.getSum(), equalTo(30171.0));
 		assertThat(stats.getMin(), equalTo(20.0));
 		assertThat(stats.getMax(), equalTo(40.0));
 		assertThat(stats.getAvg(), equalTo(30.171));
