diff --git a/activemq-core/src/test/java/org/apache/activemq/openwire/DataFileGeneratorTestSupport.java b/activemq-core/src/test/java/org/apache/activemq/openwire/DataFileGeneratorTestSupport.java
index a3b71f1..1a7aaef 100644
--- a/activemq-core/src/test/java/org/apache/activemq/openwire/DataFileGeneratorTestSupport.java
+++ b/activemq-core/src/test/java/org/apache/activemq/openwire/DataFileGeneratorTestSupport.java
@@ -262,7 +262,7 @@
         OpenWireFormat wf = new OpenWireFormat();
         wf.setCacheEnabled(true);
         wf.setStackTraceEnabled(false);
-        wf.setVersion(1);
+        wf.setVersion(2);
         return wf;
     }
 
