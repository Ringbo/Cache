diff --git a/aws-java-sdk-core/src/main/java/com/amazonaws/http/JsonErrorResponseHandlerV2.java b/aws-java-sdk-core/src/main/java/com/amazonaws/http/JsonErrorResponseHandlerV2.java
index 560babf..f94fdd0 100644
--- a/aws-java-sdk-core/src/main/java/com/amazonaws/http/JsonErrorResponseHandlerV2.java
+++ b/aws-java-sdk-core/src/main/java/com/amazonaws/http/JsonErrorResponseHandlerV2.java
@@ -96,7 +96,7 @@
                 try {
                     return unmarshaller.unmarshall(jsonContent.jsonNode);
                 } catch (Exception e) {
-                    LOG.error("Unable to unmarshall exception content", e);
+                    LOG.info("Unable to unmarshall exception content", e);
                     return null;
                 }
             }
@@ -136,7 +136,7 @@
             try {
                 rawJsonContent = IOUtils.toString(httpResponse.getContent());
             } catch (Exception e) {
-                LOG.error("Unable to read HTTP response content", e);
+                LOG.info("Unable to read HTTP response content", e);
             }
             return new JsonContent(rawJsonContent);
 
@@ -151,7 +151,7 @@
             try {
                 return MAPPER.readTree(rawJsonContent);
             } catch (Exception e) {
-                LOG.error("Unable to parse HTTP response content", e);
+                LOG.info("Unable to parse HTTP response content", e);
                 return null;
             }
         }
