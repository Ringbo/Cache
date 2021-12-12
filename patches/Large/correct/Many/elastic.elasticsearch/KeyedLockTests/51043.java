diff --git a/core/src/test/java/org/elasticsearch/transport/netty/KeyedLockTests.java b/core/src/test/java/org/elasticsearch/transport/netty/KeyedLockTests.java
index cbac0ad..9581dff 100644
--- a/core/src/test/java/org/elasticsearch/transport/netty/KeyedLockTests.java
+++ b/core/src/test/java/org/elasticsearch/transport/netty/KeyedLockTests.java
@@ -112,7 +112,7 @@
             try {
                 startLatch.await();
             } catch (InterruptedException e) {
-                throw new RuntimeException();
+                throw new RuntimeException(e);
             }
             int numRuns = scaledRandomIntBetween(5000, 50000);
             for (int i = 0; i < numRuns; i++) {
