diff --git a/activemq-core/src/main/java/org/apache/activemq/store/amq/AMQPersistenceAdapter.java b/activemq-core/src/main/java/org/apache/activemq/store/amq/AMQPersistenceAdapter.java
index bf2d60c..83e5f96 100644
--- a/activemq-core/src/main/java/org/apache/activemq/store/amq/AMQPersistenceAdapter.java
+++ b/activemq-core/src/main/java/org/apache/activemq/store/amq/AMQPersistenceAdapter.java
@@ -498,7 +498,7 @@
      * @return
      * @throws IOException
      */
-    public DataStructure readCommand(Location location) throws IOException {
+    public synchronized DataStructure readCommand(Location location) throws IOException {
         try {
             ByteSequence packet = asyncDataManager.read(location);
             return (DataStructure)wireFormat.unmarshal(packet);
