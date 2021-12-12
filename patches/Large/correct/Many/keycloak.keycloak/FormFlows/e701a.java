diff --git a/services/src/main/java/org/keycloak/services/resources/flows/FormFlows.java b/services/src/main/java/org/keycloak/services/resources/flows/FormFlows.java
index cdb588e..133b062 100755
--- a/services/src/main/java/org/keycloak/services/resources/flows/FormFlows.java
+++ b/services/src/main/java/org/keycloak/services/resources/flows/FormFlows.java
@@ -125,7 +125,7 @@
 
         // TODO find a better way to obtain contextPath
         // Getting context path by removing "rest/" substring from the BaseUri path
-        formDataBean.setContextPath(requestURI.substring(0,requestURI.length()-5));
+        formDataBean.setContextPath(requestURI.substring(0, requestURI.length() - 6));
         formDataBean.setSocialRegistration(socialRegistration);
 
         // Find the service and process relevant template
