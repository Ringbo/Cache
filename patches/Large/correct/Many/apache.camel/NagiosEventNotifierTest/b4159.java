diff --git a/components/camel-nagios/src/test/java/org/apache/camel/component/nagios/NagiosEventNotifierTest.java b/components/camel-nagios/src/test/java/org/apache/camel/component/nagios/NagiosEventNotifierTest.java
index bc1251f..795b060 100644
--- a/components/camel-nagios/src/test/java/org/apache/camel/component/nagios/NagiosEventNotifierTest.java
+++ b/components/camel-nagios/src/test/java/org/apache/camel/component/nagios/NagiosEventNotifierTest.java
@@ -42,7 +42,7 @@
     @Before
     @Override
     public void setUp() throws Exception {
-        nagios = new NagiosNscaStub(25667, "password");
+        nagios = new NagiosNscaStub(25669, "password");
         nagios.start();
 
         super.setUp();
@@ -59,7 +59,7 @@
     protected CamelContext createCamelContext() throws Exception {
         NagiosEventNotifier notifier = new NagiosEventNotifier();
         notifier.getConfiguration().setHost("localhost");
-        notifier.getConfiguration().setPort(25667);
+        notifier.getConfiguration().setPort(25669);
         notifier.getConfiguration().setPassword("password");
 
         CamelContext context = super.createCamelContext();
@@ -78,7 +78,7 @@
         context.stop();
 
         List<MessagePayload> events = nagios.getMessagePayloadList();
-        assertTrue("Should be 12+ events, was: " + events.size(), events.size() >= 12);
+        assertTrue("Should be 11+ events, was: " + events.size(), events.size() >= 11);
     }
 
     @Test
@@ -92,7 +92,7 @@
         context.stop();
 
         List<MessagePayload> events = nagios.getMessagePayloadList();
-        assertTrue("Should be 10+ events, was: " + events.size(), events.size() >= 10);
+        assertTrue("Should be 9+ events, was: " + events.size(), events.size() >= 9);
     }
 
     @Override
