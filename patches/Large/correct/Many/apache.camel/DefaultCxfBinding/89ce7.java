diff --git a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/DefaultCxfBinding.java b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/DefaultCxfBinding.java
index bf7d324..1dee194 100644
--- a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/DefaultCxfBinding.java
+++ b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/DefaultCxfBinding.java
@@ -171,7 +171,7 @@
                                                           DataFormat.class);
         boolean isXop = Boolean.valueOf(camelExchange.getProperty(Message.MTOM_ENABLED, String.class));
         // propagate attachments if the data format is not POJO with MTOM enabled
-        if (cxfMessage.getAttachments() != null && !(DataFormat.POJO.equals(dataFormat) && !isXop)) {
+        if (cxfMessage.getAttachments() != null && !(DataFormat.POJO.equals(dataFormat) && isXop)) {
             // propagate attachments
             for (Attachment attachment : cxfMessage.getAttachments()) {
                 camelExchange.getOut().addAttachment(attachment.getId(), attachment.getDataHandler());
