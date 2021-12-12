diff --git a/archaius-core/src/main/java/com/netflix/config/ConfigurationBasedDeploymentContext.java b/archaius-core/src/main/java/com/netflix/config/ConfigurationBasedDeploymentContext.java
index eb457b1..0e555ff 100644
--- a/archaius-core/src/main/java/com/netflix/config/ConfigurationBasedDeploymentContext.java
+++ b/archaius-core/src/main/java/com/netflix/config/ConfigurationBasedDeploymentContext.java
@@ -129,7 +129,7 @@
             }    
             contextValue = getValueFromConfig(DEPLOYMENT_SERVER_ID_PROPERTY);
             if (contextValue != null) {
-                setDeploymentStack(contextValue);
+                setDeploymentServerId(contextValue);
             }    
             config.addConfigurationListener(configListener);
         }
