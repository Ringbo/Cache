diff --git a/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineProducer.java b/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineProducer.java
index 9d41799..c8513d4 100644
--- a/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineProducer.java
+++ b/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineProducer.java
@@ -147,7 +147,7 @@
                     message.getHeader(ChronicleEngineConstants.DEFAULT_VALUE))
             );
         } else {
-            QueueView.Excerpt<Object, Object> excerpt = queueView.get().get(index.longValue());
+            QueueView.Excerpt<Object, Object> excerpt = queueView.get().getExcerpt(index.longValue());
 
             message.setHeader(ChronicleEngineConstants.PATH, excerpt.topic());
             message.setBody(excerpt.message());
