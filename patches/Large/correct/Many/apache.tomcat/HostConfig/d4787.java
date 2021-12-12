diff --git a/java/org/apache/catalina/startup/HostConfig.java b/java/org/apache/catalina/startup/HostConfig.java
index d8965a4..0e8d879 100644
--- a/java/org/apache/catalina/startup/HostConfig.java
+++ b/java/org/apache/catalina/startup/HostConfig.java
@@ -1223,8 +1223,27 @@
 
     /**
      * Check resources for redeployment and reloading.
+     *
+     * @deprecated Use {@link #checkResources(DeployedApplication, boolean)}.
+     *             Will be removed in Tomcat 9.0.x
      */
-    protected synchronized void checkResources(DeployedApplication app) {
+    //@Deprecated
+    //protected synchronized void checkResources(DeployedApplication app) {
+    //    checkResources(app, false);
+    //}
+
+    /**
+     * Check resources for redeployment and reloading.
+     *
+     * @param app   The web application to check
+     * @param skipFileModificationResolutionCheck
+     *              When checking files for modification should the check that
+     *              requires that any file modification must have occurred at
+     *              least as long ago as the resolution of the file time stamp
+     *              be skipped
+     */
+    protected synchronized void checkResources(DeployedApplication app,
+            boolean skipFileModificationResolutionCheck) {
         String[] resources =
             app.redeployResources.keySet().toArray(new String[0]);
         // Offset the current time by the resolution of File.lastModified()
@@ -1243,7 +1262,8 @@
                 // modifications that take place in the same second are not
                 // missed. See Bug 57765.
                 if (resource.lastModified() != lastModified && (!host.getAutoDeploy() ||
-                        resource.lastModified() < currentTimeWithResolutionOffset)) {
+                        resource.lastModified() < currentTimeWithResolutionOffset ||
+                        skipFileModificationResolutionCheck)) {
                     if (resource.isDirectory()) {
                         // No action required for modified directory
                         app.redeployResources.put(resources[i],
@@ -1325,7 +1345,8 @@
             // missed. See Bug 57765.
             if ((resource.lastModified() != lastModified &&
                     (!host.getAutoDeploy() ||
-                            resource.lastModified() < currentTimeWithResolutionOffset)) ||
+                            resource.lastModified() < currentTimeWithResolutionOffset) ||
+                            skipFileModificationResolutionCheck) ||
                     update) {
                 if (!update) {
                     // Reload application
@@ -1527,7 +1548,7 @@
                 deployed.values().toArray(new DeployedApplication[0]);
             for (int i = 0; i < apps.length; i++) {
                 if (!isServiced(apps[i].name))
-                    checkResources(apps[i]);
+                    checkResources(apps[i], false);
             }
 
             // Check for old versions of applications that can now be undeployed
@@ -1542,12 +1563,21 @@
 
 
     /**
-     * Check status of a specific webapp, for use with stuff like management webapps.
+     * Check status of a specific web application and reload, redeploy or deploy
+     * it as necessary. This method is for use with functionality such as
+     * management web applications that upload new/updated web applications and
+     * need to trigger the appropriate action to deploy them. This method
+     * assumes that the web application is currently marked as serviced and that
+     * any uploading/updating has been completed before this method is called.
+     * Any action taken as a result of the checks will complete before this
+     * method returns.
+     *
+     * @param name The name of the web application to check
      */
     public void check(String name) {
         DeployedApplication app = deployed.get(name);
         if (app != null) {
-            checkResources(app);
+            checkResources(app, true);
         }
         deployApps(name);
     }
