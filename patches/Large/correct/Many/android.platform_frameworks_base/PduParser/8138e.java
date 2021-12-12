diff --git a/core/java/com/google/android/mms/pdu/PduParser.java b/core/java/com/google/android/mms/pdu/PduParser.java
index 1cd118b..21f0c93 100644
--- a/core/java/com/google/android/mms/pdu/PduParser.java
+++ b/core/java/com/google/android/mms/pdu/PduParser.java
@@ -157,9 +157,11 @@
                 }
                 String ctTypeStr = new String(contentType);
                 if (ctTypeStr.equals(ContentType.MULTIPART_MIXED)
-                        || ctTypeStr.equals(ContentType.MULTIPART_RELATED)) {
+                        || ctTypeStr.equals(ContentType.MULTIPART_RELATED)
+                        || ctTypeStr.equals(ContentType.MULTIPART_ALTERNATIVE)) {
                     // The MMS content type must be "application/vnd.wap.multipart.mixed"
                     // or "application/vnd.wap.multipart.related"
+                    // or "application/vnd.wap.multipart.alternative"
                     return retrieveConf;
                 }
                 return null;
