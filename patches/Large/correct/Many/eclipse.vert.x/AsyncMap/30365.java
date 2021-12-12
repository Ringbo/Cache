diff --git a/vertx-core/src/main/java/io/vertx/core/spi/cluster/AsyncMap.java b/vertx-core/src/main/java/io/vertx/core/spi/cluster/AsyncMap.java
index b23cbc3..cc1ad1c 100644
--- a/vertx-core/src/main/java/io/vertx/core/spi/cluster/AsyncMap.java
+++ b/vertx-core/src/main/java/io/vertx/core/spi/cluster/AsyncMap.java
@@ -52,5 +52,5 @@
    * @param k The key
    * @param resultHandler - this will be called some time later to signify the value has been removed
    */
-  void remove(K k, Handler<AsyncResult<Boolean>> resultHandler);
+  void remove(K k, Handler<AsyncResult<Void>> resultHandler);
 }
