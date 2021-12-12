diff --git a/java/org/apache/catalina/startup/HostConfig.java b/java/org/apache/catalina/startup/HostConfig.java
index b7bf1ed..0c8c9fe 100644
--- a/java/org/apache/catalina/startup/HostConfig.java
+++ b/java/org/apache/catalina/startup/HostConfig.java
@@ -405,13 +405,13 @@
      * Filter the list of application file paths to remove those that match
      * the regular expression defined by {@link Host#getDeployIgnore()}.
      *
-     * @param unfilteredAppPaths    The list of application paths to filtert
+     * @param unfilteredAppPaths    The list of application paths to filter
      *
      * @return  The filtered list of application paths
      */
     protected String[] filterAppPaths(String[] unfilteredAppPaths) {
         Pattern filter = host.getDeployIgnorePattern();
-        if (filter == null) {
+        if (filter == null || unfilteredAppPaths == null) {
             return unfilteredAppPaths;
         }
 
