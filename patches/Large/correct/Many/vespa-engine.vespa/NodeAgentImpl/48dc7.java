diff --git a/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/nodeagent/NodeAgentImpl.java b/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/nodeagent/NodeAgentImpl.java
index bc11162..c53c092 100644
--- a/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/nodeagent/NodeAgentImpl.java
+++ b/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/nodeagent/NodeAgentImpl.java
@@ -608,7 +608,7 @@
         }
 
         double getUptime() {
-            return Duration.between(created, Instant.now()).toMillis() * 1000;
+            return Duration.between(created, Instant.now()).toMillis() / 1000;
         }
     }
 
