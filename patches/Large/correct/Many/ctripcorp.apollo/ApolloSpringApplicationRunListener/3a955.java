diff --git a/apollo-client/src/main/java/com/ctrip/framework/apollo/spring/boot/ApolloSpringApplicationRunListener.java b/apollo-client/src/main/java/com/ctrip/framework/apollo/spring/boot/ApolloSpringApplicationRunListener.java
index 650a463..2da8bd2 100644
--- a/apollo-client/src/main/java/com/ctrip/framework/apollo/spring/boot/ApolloSpringApplicationRunListener.java
+++ b/apollo-client/src/main/java/com/ctrip/framework/apollo/spring/boot/ApolloSpringApplicationRunListener.java
@@ -59,7 +59,7 @@
       logger.debug("Apollo bootstrap config is not enabled for context {}, see property: ${{}}", context, PropertySourcesConstants.APOLLO_BOOTSTRAP_ENABLED);
       return;
     }
-    logger.debug("Apollo bootstrap config is enabled for context {}", context, PropertySourcesConstants.APOLLO_BOOTSTRAP_ENABLED);
+    logger.debug("Apollo bootstrap config is enabled for context {}", context);
 
     if (environment.getPropertySources().contains(PropertySourcesConstants.APOLLO_BOOTSTRAP_PROPERTY_SOURCE_NAME)) {
       //already initialized
