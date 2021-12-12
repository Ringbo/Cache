diff --git a/eureka-core/src/main/java/com/netflix/eureka/resources/ApplicationsResource.java b/eureka-core/src/main/java/com/netflix/eureka/resources/ApplicationsResource.java
index 5bc22db..b983301 100755
--- a/eureka-core/src/main/java/com/netflix/eureka/resources/ApplicationsResource.java
+++ b/eureka-core/src/main/java/com/netflix/eureka/resources/ApplicationsResource.java
@@ -107,10 +107,10 @@
             @HeaderParam(HEADER_ACCEPT_ENCODING) String acceptEncoding,
             @Context UriInfo uriInfo, @Nullable @QueryParam("regions") String regionsStr) {
 
-        boolean isRemoteRegionRequested = null == regionsStr || regionsStr.isEmpty();
+        boolean isRemoteRegionRequested = null != regionsStr && !regionsStr.isEmpty();
         String[] regions;
         String normalizedRegionStr = null;
-        if (isRemoteRegionRequested) {
+        if (!isRemoteRegionRequested) {
             EurekaMonitors.GET_ALL.increment();
         } else {
             regions = regionsStr.toLowerCase().split(",");
@@ -195,10 +195,10 @@
             return Response.status(Status.FORBIDDEN).build();
         }
 
-        boolean isRemoteRegionRequested = null == regionsStr || regionsStr.isEmpty();
+        boolean isRemoteRegionRequested = null != regionsStr && !regionsStr.isEmpty();
         String[] regions;
         String normalizedRegionStr = null;
-        if (isRemoteRegionRequested) {
+        if (!isRemoteRegionRequested) {
             EurekaMonitors.GET_ALL_DELTA.increment();
         } else {
             regions = regionsStr.toLowerCase().split(",");
