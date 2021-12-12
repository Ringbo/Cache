diff --git a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/MultipartProvider.java b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/MultipartProvider.java
index a3da910..15625c8 100644
--- a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/MultipartProvider.java
+++ b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/MultipartProvider.java
@@ -167,7 +167,7 @@
         Attachment multipart = AttachmentUtils.getMultipart(c, id, mt, infos);
         if (multipart != null) {
             return fromAttachment(multipart, c, t, anns);
-        } else if (id != null && !id.errorIfMissing()) {
+        } else if (id != null && !id.required()) {
             /*
              * If user asked for a null, give them a null. 
              */
