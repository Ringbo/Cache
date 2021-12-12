diff --git a/src/main/java/org/elasticsearch/index/engine/internal/InternalEngine.java b/src/main/java/org/elasticsearch/index/engine/internal/InternalEngine.java
index df38b6d..381d954 100644
--- a/src/main/java/org/elasticsearch/index/engine/internal/InternalEngine.java
+++ b/src/main/java/org/elasticsearch/index/engine/internal/InternalEngine.java
@@ -1735,7 +1735,7 @@
         }
 
         @Override
-        public void beforeMerge(OnGoingMerge merge) {
+        public synchronized void beforeMerge(OnGoingMerge merge) {
             if (numMergesInFlight.incrementAndGet() > maxNumMerges) {
                 if (isThrottling.getAndSet(true) == false) {
                     logger.info("now throttling indexing: numMergesInFlight={}, maxNumMerges={}", numMergesInFlight, maxNumMerges);
@@ -1745,7 +1745,7 @@
         }
 
         @Override
-        public void afterMerge(OnGoingMerge merge) {
+        public synchronized void afterMerge(OnGoingMerge merge) {
             if (numMergesInFlight.decrementAndGet() < maxNumMerges) {
                 if (isThrottling.getAndSet(false)) {
                     logger.info("stop throttling indexing: numMergesInFlight={}, maxNumMerges={}", numMergesInFlight, maxNumMerges);
