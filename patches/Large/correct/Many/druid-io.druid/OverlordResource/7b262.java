diff --git a/indexing-service/src/main/java/org/apache/druid/indexing/overlord/http/OverlordResource.java b/indexing-service/src/main/java/org/apache/druid/indexing/overlord/http/OverlordResource.java
index e26653b..6434dfe 100644
--- a/indexing-service/src/main/java/org/apache/druid/indexing/overlord/http/OverlordResource.java
+++ b/indexing-service/src/main/java/org/apache/druid/indexing/overlord/http/OverlordResource.java
@@ -627,7 +627,7 @@
   public Response getTasks(
       @QueryParam("state") final String state,
       @QueryParam("datasource") final String dataSource,
-      @PathParam("interval") final String interval,
+      @QueryParam("interval") final String interval,
       @QueryParam("max") final Integer maxCompletedTasks,
       @QueryParam("type") final String type,
       @Context final HttpServletRequest req
