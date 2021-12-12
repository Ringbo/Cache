diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/StringIndexKey.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/StringIndexKey.java
index 0f2743c..0b1d230 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/StringIndexKey.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/StringIndexKey.java
@@ -192,7 +192,7 @@
         copyFrom( key, key.bytesLength );
     }
 
-    void copyFrom( StringSchemaKey key, int targetLength )
+    void copyFrom( StringIndexKey key, int targetLength )
     {
         setBytesLength( targetLength );
         System.arraycopy( key.bytes, 0, bytes, 0, targetLength );
