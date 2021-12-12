diff --git a/portal-service/src/com/liferay/portal/kernel/cluster/ClusterNodeResponse.java b/portal-service/src/com/liferay/portal/kernel/cluster/ClusterNodeResponse.java
index 36f2c00..a3b98eb 100644
--- a/portal-service/src/com/liferay/portal/kernel/cluster/ClusterNodeResponse.java
+++ b/portal-service/src/com/liferay/portal/kernel/cluster/ClusterNodeResponse.java
@@ -31,7 +31,7 @@
 	}
 
 	public static ClusterNodeResponse createResultClusterNodeResponse(
-		ClusterNode clusterNode, String uuid, Object result) {
+		ClusterNode clusterNode, String uuid, Serializable result) {
 
 		if ((result != null) && !(result instanceof Serializable)) {
 			return new ClusterNodeResponse(
@@ -39,8 +39,7 @@
 				new ClusterException("Return value is not serializable"));
 		}
 
-		return new ClusterNodeResponse(
-			clusterNode, uuid, (Serializable)result, null);
+		return new ClusterNodeResponse(clusterNode, uuid, result, null);
 	}
 
 	public ClusterNode getClusterNode() {
