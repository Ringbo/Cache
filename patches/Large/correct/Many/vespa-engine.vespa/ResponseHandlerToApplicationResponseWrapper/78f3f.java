diff --git a/controller-server/src/test/java/com/yahoo/vespa/hosted/controller/restapi/ResponseHandlerToApplicationResponseWrapper.java b/controller-server/src/test/java/com/yahoo/vespa/hosted/controller/restapi/ResponseHandlerToApplicationResponseWrapper.java
index 783019f..55cfc07 100644
--- a/controller-server/src/test/java/com/yahoo/vespa/hosted/controller/restapi/ResponseHandlerToApplicationResponseWrapper.java
+++ b/controller-server/src/test/java/com/yahoo/vespa/hosted/controller/restapi/ResponseHandlerToApplicationResponseWrapper.java
@@ -18,7 +18,7 @@
  *
  * @author bjorncs
  */
-class ResponseHandlerToApplicationResponseWrapper implements ResponseHandler {
+public class ResponseHandlerToApplicationResponseWrapper implements ResponseHandler {
 
     private Response response;
     private SimpleContentChannel contentChannel;
@@ -31,7 +31,7 @@
         return contentChannel;
     }
 
-    Optional<com.yahoo.application.container.handler.Response> toResponse() {
+    public Optional<com.yahoo.application.container.handler.Response> toResponse() {
         return Optional.ofNullable(this.response)
                 .map(r -> {
                     byte[] bytes = contentChannel.toByteArray();
