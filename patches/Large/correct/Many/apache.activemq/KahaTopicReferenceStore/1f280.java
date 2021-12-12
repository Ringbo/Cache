diff --git a/activemq-core/src/main/java/org/apache/activemq/store/kahadaptor/KahaTopicReferenceStore.java b/activemq-core/src/main/java/org/apache/activemq/store/kahadaptor/KahaTopicReferenceStore.java
index a3b8994..f490bf9 100644
--- a/activemq-core/src/main/java/org/apache/activemq/store/kahadaptor/KahaTopicReferenceStore.java
+++ b/activemq-core/src/main/java/org/apache/activemq/store/kahadaptor/KahaTopicReferenceStore.java
@@ -70,7 +70,7 @@
         throw new RuntimeException("Use addMessageReference instead");
     }
 
-    public void addMessageReference(final ConnectionContext context, final MessageId messageId,
+    public synchronized void addMessageReference(final ConnectionContext context, final MessageId messageId,
                                     final ReferenceData data) {
         final ReferenceRecord record = new ReferenceRecord(messageId.toString(), data);
         final int subscriberCount = subscriberMessages.size();
