diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/nioneo/store/RelationshipStore.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/nioneo/store/RelationshipStore.java
index c6532bd..816b011 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/nioneo/store/RelationshipStore.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/nioneo/store/RelationshipStore.java
@@ -182,7 +182,7 @@
                 {
                     cursor.setOffset( offset );
                     recordIsInUse = isInUse( cursor.getByte() );
-                } while ( cursor.retry() );
+                } while ( cursor.shouldRetry() );
             }
             return recordIsInUse;
         }
