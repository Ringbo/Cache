diff --git a/community/bolt/src/test/java/org/neo4j/bolt/v1/messaging/BoltRequestMessageWriter.java b/community/bolt/src/test/java/org/neo4j/bolt/v1/messaging/BoltRequestMessageWriter.java
index b29079a..df907b2 100644
--- a/community/bolt/src/test/java/org/neo4j/bolt/v1/messaging/BoltRequestMessageWriter.java
+++ b/community/bolt/src/test/java/org/neo4j/bolt/v1/messaging/BoltRequestMessageWriter.java
@@ -56,7 +56,7 @@
     @Override
     public void onInit( String clientName, Map<String,Object> credentials ) throws IOException
     {
-        packer.packStructHeader( 1, INIT.signature() );
+        packer.packStructHeader( 2, INIT.signature() );
         packer.pack( clientName );
         packer.pack( ValueUtils.asMapValue( credentials ) );
         onMessageComplete.onMessageComplete();
