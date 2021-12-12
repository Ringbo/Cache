diff --git a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/utils/multipart/AttachmentUtils.java b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/utils/multipart/AttachmentUtils.java
index ef3bdc2..fdbbf9e 100644
--- a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/utils/multipart/AttachmentUtils.java
+++ b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/utils/multipart/AttachmentUtils.java
@@ -109,7 +109,7 @@
                     return a;    
                 }
             }
-            if (id.errorIfMissing()) {
+            if (id.required()) {
                 org.apache.cxf.common.i18n.Message errorMsg = 
                     new org.apache.cxf.common.i18n.Message("MULTTIPART_ID_NOT_FOUND", 
                                                            BUNDLE, 
