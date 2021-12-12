diff --git a/camel-core/src/main/java/org/apache/camel/processor/interceptor/DefaultTraceEventHandler.java b/camel-core/src/main/java/org/apache/camel/processor/interceptor/DefaultTraceEventHandler.java
index 2824ba9..cbf20ad 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/interceptor/DefaultTraceEventHandler.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/interceptor/DefaultTraceEventHandler.java
@@ -99,9 +99,9 @@
                 // copy options from event to jpa
                 Map<String, Object> options = new HashMap<String, Object>();
                 IntrospectionSupport.getProperties(msg, options, null);
-                IntrospectionSupport.setProperties(jpa, options);
+                IntrospectionSupport.setProperties(exchange.getContext().getTypeConverter(), jpa, options);
                 // and set the timestamp as its not a String type
-                IntrospectionSupport.setProperty(jpa, "timestamp", msg.getTimestamp());
+                IntrospectionSupport.setProperty(exchange.getContext().getTypeConverter(), jpa, "timestamp", msg.getTimestamp());
 
                 event.getIn().setBody(jpa);
             } else {
