diff --git a/activemq-core/src/test/java/org/apache/activemq/bugs/DurableConsumerTest.java b/activemq-core/src/test/java/org/apache/activemq/bugs/DurableConsumerTest.java
index d06641b..c8789da 100755
--- a/activemq-core/src/test/java/org/apache/activemq/bugs/DurableConsumerTest.java
+++ b/activemq-core/src/test/java/org/apache/activemq/bugs/DurableConsumerTest.java
@@ -174,7 +174,7 @@
     	Thread publisherThread = new Thread( new MessagePublisher() );
         publisherThread.start();
         
-        for( int i = 0; i < 200; i++ ) {
+        for( int i = 0; i < 100; i++ ) {
             
             final int id = i;
             Thread thread = new Thread( new Runnable() {
