diff --git a/components/camel-xmlrpc/src/main/java/org/apache/camel/component/xmlrpc/XmlRpcEndpoint.java b/components/camel-xmlrpc/src/main/java/org/apache/camel/component/xmlrpc/XmlRpcEndpoint.java
index 343bf43..fc05c61 100644
--- a/components/camel-xmlrpc/src/main/java/org/apache/camel/component/xmlrpc/XmlRpcEndpoint.java
+++ b/components/camel-xmlrpc/src/main/java/org/apache/camel/component/xmlrpc/XmlRpcEndpoint.java
@@ -150,7 +150,8 @@
         }
 
         Map<String, Object> params = new HashMap<String, Object>();
-        IntrospectionSupport.getProperties(configuration, params, null);
+        // do not include null values
+        IntrospectionSupport.getProperties(configuration, params, null, false);
         setProperties(clientConfig, params);
     }
 }
