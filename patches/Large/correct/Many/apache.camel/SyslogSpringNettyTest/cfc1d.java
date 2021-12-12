diff --git a/components/camel-syslog/src/test/java/org/apache/camel/component/syslog/SyslogSpringNettyTest.java b/components/camel-syslog/src/test/java/org/apache/camel/component/syslog/SyslogSpringNettyTest.java
index 2630b04..96cc1ee 100644
--- a/components/camel-syslog/src/test/java/org/apache/camel/component/syslog/SyslogSpringNettyTest.java
+++ b/components/camel-syslog/src/test/java/org/apache/camel/component/syslog/SyslogSpringNettyTest.java
@@ -38,7 +38,7 @@
 
     @BeforeClass
     public static void initPort() {
-        serverPort = AvailablePortFinder.getNextAvailable();
+        serverPort = AvailablePortFinder.getNextAvailable(4000);
         System.setProperty("server-port", new Integer(serverPort).toString());
     }
     
@@ -58,7 +58,7 @@
 
         DatagramSocket socket = new DatagramSocket();
         try {
-            InetAddress address = InetAddress.getByName("127.0.0.1");
+            InetAddress address = InetAddress.getByName("localhost");
             for (int i = 0; i < messageCount; i++) {
 
                 byte[] data = message.getBytes();
