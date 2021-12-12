diff --git a/metastore/src/java/org/apache/hadoop/hive/metastore/HiveMetaStore.java b/metastore/src/java/org/apache/hadoop/hive/metastore/HiveMetaStore.java
index b43b4df..5b353c4 100644
--- a/metastore/src/java/org/apache/hadoop/hive/metastore/HiveMetaStore.java
+++ b/metastore/src/java/org/apache/hadoop/hive/metastore/HiveMetaStore.java
@@ -2031,7 +2031,7 @@
             transactionalListenerResponses =
                 MetaStoreListenerNotifier.notifyEvent(transactionalListeners,
                                                       EventType.DROP_TABLE,
-                                                      new DropTableEvent(tbl, deleteData, true, this),
+                                                      new DropTableEvent(tbl, true, deleteData, this),
                                                       envContext);
           }
           success = ms.commitTransaction();
@@ -2051,7 +2051,7 @@
         if (!listeners.isEmpty()) {
           MetaStoreListenerNotifier.notifyEvent(listeners,
                                                 EventType.DROP_TABLE,
-                                                new DropTableEvent(tbl, deleteData, success, this),
+                                                new DropTableEvent(tbl, success, deleteData, this),
                                                 envContext,
                                                 transactionalListenerResponses, ms);
         }
