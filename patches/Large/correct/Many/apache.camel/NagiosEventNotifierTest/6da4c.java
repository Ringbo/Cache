diff --git a/components/camel-nagios/src/test/java/org/apache/camel/component/nagios/NagiosEventNotifierTest.java b/components/camel-nagios/src/test/java/org/apache/camel/component/nagios/NagiosEventNotifierTest.java
index c3fcb35..86684a2 100644
--- a/components/camel-nagios/src/test/java/org/apache/camel/component/nagios/NagiosEventNotifierTest.java
+++ b/components/camel-nagios/src/test/java/org/apache/camel/component/nagios/NagiosEventNotifierTest.java
@@ -73,7 +73,7 @@
         context.stop();
 
         List<MessagePayload> events = nagios.getMessagePayloadList();
-        assertEquals(10, events.size());
+        assertEquals(12, events.size());
     }
 
     @Test
@@ -87,7 +87,7 @@
         context.stop();
 
         List<MessagePayload> events = nagios.getMessagePayloadList();
-        assertEquals(10, events.size());
+        assertEquals(11, events.size());
     }
 
     @Override
