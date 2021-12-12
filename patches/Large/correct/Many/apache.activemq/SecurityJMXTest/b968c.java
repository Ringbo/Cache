diff --git a/activemq-core/src/test/java/org/apache/activemq/security/SecurityJMXTest.java b/activemq-core/src/test/java/org/apache/activemq/security/SecurityJMXTest.java
index 157b1e4..c5a47b5 100644
--- a/activemq-core/src/test/java/org/apache/activemq/security/SecurityJMXTest.java
+++ b/activemq-core/src/test/java/org/apache/activemq/security/SecurityJMXTest.java
@@ -50,7 +50,8 @@
 	public void setUp() throws Exception {
 		broker = createBroker();
 		broker.waitUntilStarted();
-		Thread.sleep(500);
+
+		Thread.sleep(1000);
 	}
 
 	public void tearDown() throws Exception {
@@ -81,7 +82,7 @@
         headers.put("JMSDeliveryMode", Integer.toString(DeliveryMode.PERSISTENT));
         String msgId = queueMbean.sendTextMessage(headers, "test", "system", "manager");
         // allow message to expire on the queue
-        TimeUnit.SECONDS.sleep(3);
+        TimeUnit.SECONDS.sleep(4);
         
         Connection c = new ActiveMQConnectionFactory("vm://localhost").createConnection("system", "manager");
         c.start();
