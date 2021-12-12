diff --git a/enterprise/com/src/main/java/org/neo4j/com/storecopy/StoreCopyClient.java b/enterprise/com/src/main/java/org/neo4j/com/storecopy/StoreCopyClient.java
index 9366993..e2a3a7d 100644
--- a/enterprise/com/src/main/java/org/neo4j/com/storecopy/StoreCopyClient.java
+++ b/enterprise/com/src/main/java/org/neo4j/com/storecopy/StoreCopyClient.java
@@ -294,8 +294,7 @@
                 // last closed transaction offset will not overcome old one. Till that happens it will be
                 // impossible for recovery process to restore the store
                 File neoStore = new File( tempStoreDir, NeoStore.DEFAULT_NAME );
-                NeoStore.setRecord( fs, neoStore, NeoStore.Position.LAST_CLOSED_TRANSACTION_LOG_BYTE_OFFSET,
-                        LOG_HEADER_SIZE );
+                NeoStore.setRecord( pageCache, neoStore, NeoStore.Position.LAST_CLOSED_TRANSACTION_LOG_BYTE_OFFSET, LOG_HEADER_SIZE );
             }
         }
         finally
