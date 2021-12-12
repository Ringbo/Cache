diff --git a/components/camel-syslog/src/test/java/org/apache/camel/component/syslog/SyslogSpringMinaTest.java b/components/camel-syslog/src/test/java/org/apache/camel/component/syslog/SyslogSpringMinaTest.java
index 8771d7f..3dff15f 100644
--- a/components/camel-syslog/src/test/java/org/apache/camel/component/syslog/SyslogSpringMinaTest.java
+++ b/components/camel-syslog/src/test/java/org/apache/camel/component/syslog/SyslogSpringMinaTest.java
@@ -39,7 +39,7 @@
 
     @BeforeClass
     public static void initPort() {
-        serverPort = AvailablePortFinder.getNextAvailable();
+        serverPort = AvailablePortFinder.getNextAvailable(3000);
         System.setProperty("server-port", new Integer(serverPort).toString());
     }
     
@@ -59,7 +59,7 @@
 
         DatagramSocket socket = new DatagramSocket();
         try {
-            InetAddress address = InetAddress.getByName("127.0.0.1");
+            InetAddress address = InetAddress.getByName("localhost");
             for (int i = 0; i < messageCount; i++) {
 
                 byte[] data = message.getBytes();
