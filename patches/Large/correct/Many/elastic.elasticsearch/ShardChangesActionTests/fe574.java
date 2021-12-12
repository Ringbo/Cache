diff --git a/x-pack/plugin/ccr/src/test/java/org/elasticsearch/xpack/ccr/action/ShardChangesActionTests.java b/x-pack/plugin/ccr/src/test/java/org/elasticsearch/xpack/ccr/action/ShardChangesActionTests.java
index 5c11c43..079b670 100644
--- a/x-pack/plugin/ccr/src/test/java/org/elasticsearch/xpack/ccr/action/ShardChangesActionTests.java
+++ b/x-pack/plugin/ccr/src/test/java/org/elasticsearch/xpack/ccr/action/ShardChangesActionTests.java
@@ -44,11 +44,11 @@
         for (int iter = 0; iter < iters; iter++) {
             int min = randomIntBetween(0, numWrites - 1);
             int max = randomIntBetween(min, numWrites - 1);
-            int size = max - min;
+            int size = max - min + 1;
             final Translog.Operation[] operations = ShardChangesAction.getOperations(indexShard,
                 indexShard.getGlobalCheckpoint(), min, size, Long.MAX_VALUE);
             final List<Long> seenSeqNos = Arrays.stream(operations).map(Translog.Operation::seqNo).collect(Collectors.toList());
-            final List<Long> expectedSeqNos = LongStream.range(min, max).boxed().collect(Collectors.toList());
+            final List<Long> expectedSeqNos = LongStream.rangeClosed(min, max).boxed().collect(Collectors.toList());
             assertThat(seenSeqNos, equalTo(expectedSeqNos));
         }
 
