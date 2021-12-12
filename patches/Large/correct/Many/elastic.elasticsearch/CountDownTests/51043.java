diff --git a/core/src/test/java/org/elasticsearch/common/util/concurrent/CountDownTests.java b/core/src/test/java/org/elasticsearch/common/util/concurrent/CountDownTests.java
index db10add..1a32064 100644
--- a/core/src/test/java/org/elasticsearch/common/util/concurrent/CountDownTests.java
+++ b/core/src/test/java/org/elasticsearch/common/util/concurrent/CountDownTests.java
@@ -43,7 +43,7 @@
                     try {
                         latch.await();
                     } catch (InterruptedException e) {
-                        throw new RuntimeException();
+                        throw new RuntimeException(e);
                     }
                     while (true) {
                         if(frequently()) {
