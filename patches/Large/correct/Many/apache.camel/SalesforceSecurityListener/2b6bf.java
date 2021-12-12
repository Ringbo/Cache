diff --git a/components/camel-salesforce/camel-salesforce-component/src/main/java/org/apache/camel/component/salesforce/internal/client/SalesforceSecurityListener.java b/components/camel-salesforce/camel-salesforce-component/src/main/java/org/apache/camel/component/salesforce/internal/client/SalesforceSecurityListener.java
index 552401c..27d838a 100644
--- a/components/camel-salesforce/camel-salesforce-component/src/main/java/org/apache/camel/component/salesforce/internal/client/SalesforceSecurityListener.java
+++ b/components/camel-salesforce/camel-salesforce-component/src/main/java/org/apache/camel/component/salesforce/internal/client/SalesforceSecurityListener.java
@@ -103,7 +103,7 @@
                     client.setInstanceUrl(session.getInstanceUrl());
                     client.setAccessToken(exchange);
                 } else {
-                    exchange.addRequestHeader(HttpHeaders.AUTHORIZATION,
+                    exchange.setRequestHeader(HttpHeaders.AUTHORIZATION,
                             "OAuth " + currentToken);
                 }
 
