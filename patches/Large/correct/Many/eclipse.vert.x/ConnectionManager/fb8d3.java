diff --git a/src/main/java/io/vertx/core/http/impl/ConnectionManager.java b/src/main/java/io/vertx/core/http/impl/ConnectionManager.java
index f08d6d2..1117d58 100644
--- a/src/main/java/io/vertx/core/http/impl/ConnectionManager.java
+++ b/src/main/java/io/vertx/core/http/impl/ConnectionManager.java
@@ -53,13 +53,13 @@
   }
 
   synchronized void start(boolean checkExpired) {
-    this.timerID = checkExpired ? client.getVertx().setTimer(1, id -> checkExpired()) : -1;
+    this.timerID = checkExpired ? client.getVertx().setTimer(1000, id -> checkExpired()) : -1;
   }
 
   private synchronized void checkExpired() {
     long timestamp = System.currentTimeMillis();
     endpointMap.values().forEach(e -> e.pool.closeIdle(timestamp));
-    timerID = client.getVertx().setTimer(1, id -> checkExpired());
+    timerID = client.getVertx().setTimer(1000, id -> checkExpired());
   }
 
   private static final class EndpointKey {
