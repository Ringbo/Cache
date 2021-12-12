diff --git a/domain-http/interface/src/main/java/org/jboss/as/domain/http/server/DomainApiHandler.java b/domain-http/interface/src/main/java/org/jboss/as/domain/http/server/DomainApiHandler.java
index b7b7285..ddb361e 100644
--- a/domain-http/interface/src/main/java/org/jboss/as/domain/http/server/DomainApiHandler.java
+++ b/domain-http/interface/src/main/java/org/jboss/as/domain/http/server/DomainApiHandler.java
@@ -281,7 +281,7 @@
 
         try {
             dmr = isGet ? convertGetRequest(request) : convertPostRequest(http.getRequestBody(), encode);
-        } catch (IllegalArgumentException iae) {
+        } catch (Exception iae) {
             ROOT_LOGGER.debugf("Unable to construct ModelNode '%s'", iae.getMessage());
             sendError(http,isGet,iae);
             return;
