diff --git a/hazelcast/src/main/java/com/hazelcast/config/XmlConfigBuilder.java b/hazelcast/src/main/java/com/hazelcast/config/XmlConfigBuilder.java
index d2dfa3b..ce7120b 100644
--- a/hazelcast/src/main/java/com/hazelcast/config/XmlConfigBuilder.java
+++ b/hazelcast/src/main/java/com/hazelcast/config/XmlConfigBuilder.java
@@ -863,9 +863,9 @@
     	for (org.w3c.dom.Node child : new IterableNodeList(node.getChildNodes())) {
     		final String nodeName = cleanNodeName(child.getNodeName());
     		if("endpoints".equals(nodeName)) {
-    			handleSecurityPermissionEndpoints(principalNode, permConfig);
+    			handleSecurityPermissionEndpoints(child, permConfig);
     		} else if("actions".equals(nodeName)) {
-    			handleSecurityPermissionActions(principalNode, permConfig);
+    			handleSecurityPermissionActions(child, permConfig);
     		}
     	}
     }
