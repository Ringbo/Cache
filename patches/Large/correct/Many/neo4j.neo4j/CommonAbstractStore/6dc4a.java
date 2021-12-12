diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/store/CommonAbstractStore.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/store/CommonAbstractStore.java
index f9a4415..ed69052 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/store/CommonAbstractStore.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/store/CommonAbstractStore.java
@@ -1141,7 +1141,7 @@
             long id = firstId;
             while ( !NULL_REFERENCE.is( id )  )
             {
-                readRecord( id, record, CHECK, cursor );
+                readRecord( id, record, mode, cursor );
                 if ( record.inUse() )
                 {
                     records.add( (RECORD) record.clone() );
