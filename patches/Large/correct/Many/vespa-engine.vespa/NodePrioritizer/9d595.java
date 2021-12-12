diff --git a/node-repository/src/main/java/com/yahoo/vespa/hosted/provision/provisioning/NodePrioritizer.java b/node-repository/src/main/java/com/yahoo/vespa/hosted/provision/provisioning/NodePrioritizer.java
index 06c9885..b48d694 100644
--- a/node-repository/src/main/java/com/yahoo/vespa/hosted/provision/provisioning/NodePrioritizer.java
+++ b/node-repository/src/main/java/com/yahoo/vespa/hosted/provision/provisioning/NodePrioritizer.java
@@ -206,7 +206,7 @@
                                                  NodeType.tenant);
             PrioritizableNode nodePri = toNodePriority(newNode, false, true);
             if (!nodePri.violatesSpares || isAllocatingForReplacement) {
-                log.log(LogLevel.DEBUG, "Adding new Docker node " + node);
+                log.log(LogLevel.DEBUG, "Adding new Docker node " + newNode);
                 nodes.put(newNode, nodePri);
             }
         }
