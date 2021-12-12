diff --git a/messaging-activemq/src/main/java/org/wildfly/extension/messaging/activemq/ServerAdd.java b/messaging-activemq/src/main/java/org/wildfly/extension/messaging/activemq/ServerAdd.java
index cc7ac96..d25c858 100644
--- a/messaging-activemq/src/main/java/org/wildfly/extension/messaging/activemq/ServerAdd.java
+++ b/messaging-activemq/src/main/java/org/wildfly/extension/messaging/activemq/ServerAdd.java
@@ -482,7 +482,7 @@
         for (Class clazz : unwrapClasses(interceptors)) {
             try {
                 Interceptor interceptor = Interceptor.class.cast(clazz.newInstance());
-                serverService.getIncomingInterceptors().add(interceptor);
+                serverService.getOutgoingInterceptors().add(interceptor);
             } catch (Exception e) {
                 throw new OperationFailedException(e);
             }
