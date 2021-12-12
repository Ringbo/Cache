diff --git a/community/kernel/src/test/java/org/neo4j/kernel/impl/transaction/log/checkpoint/CheckPointThresholdTestSupport.java b/community/kernel/src/test/java/org/neo4j/kernel/impl/transaction/log/checkpoint/CheckPointThresholdTestSupport.java
index f1d36ca..a3ba113 100644
--- a/community/kernel/src/test/java/org/neo4j/kernel/impl/transaction/log/checkpoint/CheckPointThresholdTestSupport.java
+++ b/community/kernel/src/test/java/org/neo4j/kernel/impl/transaction/log/checkpoint/CheckPointThresholdTestSupport.java
@@ -55,7 +55,7 @@
     @Before
     public void setUp()
     {
-        config = Config.empty();
+        config = Config.defaults();
         clock = Clocks.fakeClock();
         logPruning = LogPruning.NO_PRUNING;
         logProvider = NullLogProvider.getInstance();
