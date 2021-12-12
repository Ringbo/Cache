diff --git a/portal-impl/src/com/liferay/portal/staging/StagingImpl.java b/portal-impl/src/com/liferay/portal/staging/StagingImpl.java
index 831f147..dbc89e8 100644
--- a/portal-impl/src/com/liferay/portal/staging/StagingImpl.java
+++ b/portal-impl/src/com/liferay/portal/staging/StagingImpl.java
@@ -329,7 +329,7 @@
 
 			fileInputStream = new FileInputStream(file);
 
-			stagingRequestId = StagingServiceHttp.prepareStagingRequest(
+			stagingRequestId = StagingServiceHttp.createStagingRequest(
 				httpPrincipal, remoteGroupId, checksum);
 
 			byte[] bytes =
