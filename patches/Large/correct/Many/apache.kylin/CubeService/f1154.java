diff --git a/server-base/src/main/java/org/apache/kylin/rest/service/CubeService.java b/server-base/src/main/java/org/apache/kylin/rest/service/CubeService.java
index c8c87cb..a28cedb 100644
--- a/server-base/src/main/java/org/apache/kylin/rest/service/CubeService.java
+++ b/server-base/src/main/java/org/apache/kylin/rest/service/CubeService.java
@@ -248,9 +248,9 @@
 
     @PreAuthorize(Constant.ACCESS_HAS_ROLE_ADMIN + " or hasPermission(#cube, 'ADMINISTRATION') or hasPermission(#cube, 'MANAGEMENT')")
     public void deleteCube(CubeInstance cube) throws IOException, JobException {
-        final List<CubingJob> cubingJobs = jobService.listAllCubingJobs(cube.getName(), null, EnumSet.of(ExecutableState.READY, ExecutableState.RUNNING));
+        final List<CubingJob> cubingJobs = jobService.listAllCubingJobs(cube.getName(), null, EnumSet.of(ExecutableState.READY, ExecutableState.RUNNING, ExecutableState.ERROR));
         if (!cubingJobs.isEmpty()) {
-            throw new JobException("The cube " + cube.getName() + " has running job, please discard it and try again.");
+            throw new JobException("The cube " + cube.getName() + " has running or failed job, please discard it and try again.");
         }
 
         try {
