diff --git a/src/jvm/backtype/storm/transactional/TransactionalSpoutCoordinator.java b/src/jvm/backtype/storm/transactional/TransactionalSpoutCoordinator.java
index 6e9bdf7..4d0084d 100644
--- a/src/jvm/backtype/storm/transactional/TransactionalSpoutCoordinator.java
+++ b/src/jvm/backtype/storm/transactional/TransactionalSpoutCoordinator.java
@@ -57,7 +57,7 @@
         _coordinator = _spout.getCoordinator(conf, context);
         _currTransaction = getStoredCurrTransaction(_state);
         if(!conf.containsKey(Config.TOPOLOGY_MAX_SPOUT_PENDING)) {
-            _maxTransactionActive = 0;
+            _maxTransactionActive = 1;
         } else {
             _maxTransactionActive = Utils.getInt(conf.get(Config.TOPOLOGY_MAX_SPOUT_PENDING));
         }
