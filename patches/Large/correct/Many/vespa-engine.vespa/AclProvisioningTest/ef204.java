diff --git a/node-repository/src/test/java/com/yahoo/vespa/hosted/provision/provisioning/AclProvisioningTest.java b/node-repository/src/test/java/com/yahoo/vespa/hosted/provision/provisioning/AclProvisioningTest.java
index a1270f5..2067061 100644
--- a/node-repository/src/test/java/com/yahoo/vespa/hosted/provision/provisioning/AclProvisioningTest.java
+++ b/node-repository/src/test/java/com/yahoo/vespa/hosted/provision/provisioning/AclProvisioningTest.java
@@ -78,8 +78,8 @@
         // Allocate 2 nodes to an application
         allocateNodes(2);
 
-        // Get trusted nodes for a ready node
-        Node node = tester.nodeRepository().getNodes(Node.State.ready).get(0);
+        // Get trusted nodes for a ready tenant node
+        Node node = tester.nodeRepository().getNodes(NodeType.tenant, Node.State.ready).get(0);
         List<NodeAcl> nodeAcls = tester.nodeRepository().getNodeAcls(node, false);
         List<Node> tenantNodes = tester.nodeRepository().getNodes(NodeType.tenant);
 
