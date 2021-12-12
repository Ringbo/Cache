diff --git a/java/org/apache/catalina/connector/Connector.java b/java/org/apache/catalina/connector/Connector.java
index 28cb580..7472ba4 100644
--- a/java/org/apache/catalina/connector/Connector.java
+++ b/java/org/apache/catalina/connector/Connector.java
@@ -74,9 +74,8 @@
             Class<?> clazz = Class.forName(protocolHandlerClassName);
             this.protocolHandler = (ProtocolHandler) clazz.newInstance();
         } catch (Exception e) {
-            log.error
-                (sm.getString
-                 ("coyoteConnector.protocolHandlerInstantiationFailed", e));
+            log.error(sm.getString(
+                    "coyoteConnector.protocolHandlerInstantiationFailed", e), e);
         }
     }
 
