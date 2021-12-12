diff --git a/indexing-service/src/main/java/org/apache/druid/indexing/overlord/http/OverlordResource.java b/indexing-service/src/main/java/org/apache/druid/indexing/overlord/http/OverlordResource.java
index 92f01ac..d0d7a43 100644
--- a/indexing-service/src/main/java/org/apache/druid/indexing/overlord/http/OverlordResource.java
+++ b/indexing-service/src/main/java/org/apache/druid/indexing/overlord/http/OverlordResource.java
@@ -627,7 +627,7 @@
   public Response getTasks(
       @QueryParam("state") final String state,
       @QueryParam("datasource") final String dataSource,
-      @PathParam("createdTimeInterval") final String createdTimeInterval,
+      @QueryParam("createdTimeInterval") final String createdTimeInterval,
       @QueryParam("max") final Integer maxCompletedTasks,
       @QueryParam("type") final String type,
       @Context final HttpServletRequest req
