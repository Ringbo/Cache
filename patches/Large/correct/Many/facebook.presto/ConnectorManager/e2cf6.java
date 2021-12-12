diff --git a/presto-main/src/main/java/com/facebook/presto/connector/ConnectorManager.java b/presto-main/src/main/java/com/facebook/presto/connector/ConnectorManager.java
index cf329d4..dda1963 100644
--- a/presto-main/src/main/java/com/facebook/presto/connector/ConnectorManager.java
+++ b/presto-main/src/main/java/com/facebook/presto/connector/ConnectorManager.java
@@ -76,7 +76,7 @@
         Preconditions.checkArgument(connectorFactory != null, "No factory for connector %s", connectorName);
 
         Connector connector = connectorFactory.create(connectorId, properties);
-        connectors.put(connectorName, connector);
+        connectors.put(connectorId, connector);
 
         addConnector(catalogName, connectorId, connector);
     }
