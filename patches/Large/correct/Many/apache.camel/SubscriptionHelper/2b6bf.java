diff --git a/components/camel-salesforce/camel-salesforce-component/src/main/java/org/apache/camel/component/salesforce/internal/streaming/SubscriptionHelper.java b/components/camel-salesforce/camel-salesforce-component/src/main/java/org/apache/camel/component/salesforce/internal/streaming/SubscriptionHelper.java
index 7aaa086..b0ed0d6 100644
--- a/components/camel-salesforce/camel-salesforce-component/src/main/java/org/apache/camel/component/salesforce/internal/streaming/SubscriptionHelper.java
+++ b/components/camel-salesforce/camel-salesforce-component/src/main/java/org/apache/camel/component/salesforce/internal/streaming/SubscriptionHelper.java
@@ -213,7 +213,7 @@
                 }
 
                 // add current security token obtained from session
-                exchange.addRequestHeader(HttpHeaders.AUTHORIZATION,
+                exchange.setRequestHeader(HttpHeaders.AUTHORIZATION,
                         "OAuth " + accessToken);
             }
         };
