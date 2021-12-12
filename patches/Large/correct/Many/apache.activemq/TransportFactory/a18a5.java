diff --git a/activemq-core/src/main/java/org/apache/activemq/transport/TransportFactory.java b/activemq-core/src/main/java/org/apache/activemq/transport/TransportFactory.java
index 7fe1437..15e3234 100755
--- a/activemq-core/src/main/java/org/apache/activemq/transport/TransportFactory.java
+++ b/activemq-core/src/main/java/org/apache/activemq/transport/TransportFactory.java
@@ -214,7 +214,7 @@
     }
 
     protected WireFormatFactory createWireFormatFactory(Map<String, String> options) throws IOException {
-        String wireFormat = (String)options.get("wireFormat");
+        String wireFormat = (String)options.remove("wireFormat");
         if (wireFormat == null) {
             wireFormat = getDefaultWireFormatType();
         }
