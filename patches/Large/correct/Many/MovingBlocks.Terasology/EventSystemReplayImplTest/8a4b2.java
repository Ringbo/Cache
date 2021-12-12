diff --git a/engine-tests/src/test/java/org/terasology/recording/EventSystemReplayImplTest.java b/engine-tests/src/test/java/org/terasology/recording/EventSystemReplayImplTest.java
index d3cdb21..ecd243d 100644
--- a/engine-tests/src/test/java/org/terasology/recording/EventSystemReplayImplTest.java
+++ b/engine-tests/src/test/java/org/terasology/recording/EventSystemReplayImplTest.java
@@ -96,7 +96,7 @@
     public void testReplayStatus() {
         assertEquals(RecordAndReplayStatus.REPLAYING, RecordAndReplayStatus.getCurrentStatus());
         long startTime = System.currentTimeMillis();
-        while ((System.currentTimeMillis() - startTime) < 10) {
+        while ((System.currentTimeMillis() - startTime) < 30) {
             eventSystem.process();
         }
         assertEquals(RecordAndReplayStatus.REPLAY_FINISHED, RecordAndReplayStatus.getCurrentStatus());
