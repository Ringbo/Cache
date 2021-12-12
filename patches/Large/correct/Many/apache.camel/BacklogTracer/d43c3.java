diff --git a/camel-core/src/main/java/org/apache/camel/processor/interceptor/BacklogTracer.java b/camel-core/src/main/java/org/apache/camel/processor/interceptor/BacklogTracer.java
index 3c85755..cd825e5 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/interceptor/BacklogTracer.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/interceptor/BacklogTracer.java
@@ -268,7 +268,7 @@
         List<BacklogTracerEventMessage> answer = new ArrayList<BacklogTracerEventMessage>();
         if (nodeId != null) {
             for (DefaultBacklogTracerEventMessage message : queue) {
-                if (nodeId.equals(message.getToNode())) {
+                if (nodeId.equals(message.getToNode()) || nodeId.equals(message.getRouteId())) {
                     answer.add(message);
                 }
             }
