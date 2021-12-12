diff --git a/components/camel-sql/src/test/java/org/apache/camel/processor/aggregate/jdbc/JdbcAggregateDiscardOnTimeoutTest.java b/components/camel-sql/src/test/java/org/apache/camel/processor/aggregate/jdbc/JdbcAggregateDiscardOnTimeoutTest.java
index b72eabb..a00254a 100644
--- a/components/camel-sql/src/test/java/org/apache/camel/processor/aggregate/jdbc/JdbcAggregateDiscardOnTimeoutTest.java
+++ b/components/camel-sql/src/test/java/org/apache/camel/processor/aggregate/jdbc/JdbcAggregateDiscardOnTimeoutTest.java
@@ -38,8 +38,8 @@
         template.sendBodyAndHeader("direct:start", "A", "id", 123);
         template.sendBodyAndHeader("direct:start", "B", "id", 123);
 
-        // wait 3 seconds
-        Thread.sleep(3000);
+        // wait 4 seconds
+        Thread.sleep(4000);
 
         mock.assertIsSatisfied();
 
@@ -63,7 +63,7 @@
                 from("direct:start")
                         .aggregate(header("id"), new MyAggregationStrategy())
                         .completionSize(3).aggregationRepository(repo)
-                        // use a 3 second timeout
+                        // use a 2 second timeout
                         .completionTimeout(2000)
                                 // and if timeout occurred then just discard the aggregated message
                         .discardOnCompletionTimeout()
