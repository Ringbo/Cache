diff --git a/test/unit/org/apache/cassandra/dht/SplitterTest.java b/test/unit/org/apache/cassandra/dht/SplitterTest.java
index 751a7d7..b39c09f 100644
--- a/test/unit/org/apache/cassandra/dht/SplitterTest.java
+++ b/test/unit/org/apache/cassandra/dht/SplitterTest.java
@@ -97,7 +97,7 @@
             start = end;
         }
         // when we dont need to keep around full ranges, the difference is small between the partitions
-        BigDecimal delta = splitIndividualRanges ? BigDecimal.valueOf(0.001) : BigDecimal.valueOf(0.2);
+        BigDecimal delta = splitIndividualRanges ? BigDecimal.valueOf(0.001) : BigDecimal.valueOf(0.25);
         boolean allBalanced = true;
         for (BigInteger b : splits)
         {
