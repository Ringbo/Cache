diff --git a/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter.java b/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter.java
index 4a30d0a..4bdb8de 100644
--- a/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter.java
+++ b/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter.java
@@ -306,7 +306,7 @@
         if (adapter instanceof PersistenceAdapter && adapter.getDestinations().isEmpty()) {
             adapter.removeQueueMessageStore(destination);
             removeMessageStore(adapter, destination);
-            destinationMap.removeAll(destination);
+            destinationMap.remove(destination, adapter);
         }
     }
 
@@ -321,7 +321,7 @@
         if (adapter instanceof PersistenceAdapter && adapter.getDestinations().isEmpty()) {
             adapter.removeTopicMessageStore(destination);
             removeMessageStore(adapter, destination);
-            destinationMap.removeAll(destination);
+            destinationMap.remove(destination, adapter);
         }
     }
 
