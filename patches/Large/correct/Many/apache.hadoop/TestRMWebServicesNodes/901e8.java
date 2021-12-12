diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/webapp/TestRMWebServicesNodes.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/webapp/TestRMWebServicesNodes.java
index 7ea7e81..72b7a45 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/webapp/TestRMWebServicesNodes.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/webapp/TestRMWebServicesNodes.java
@@ -740,7 +740,7 @@
 
   public void verifyNodeInfo(JSONObject nodeInfo, RMNode nm)
       throws JSONException, Exception {
-    assertEquals("incorrect number of elements", 19, nodeInfo.length());
+    assertEquals("incorrect number of elements", 20, nodeInfo.length());
 
     JSONObject resourceInfo = nodeInfo.getJSONObject("resourceUtilization");
     verifyNodeInfoGeneric(nm, nodeInfo.getString("state"),
