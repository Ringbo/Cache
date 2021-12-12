diff --git a/arquillian/container-embedded/src/main/java/org/jboss/as/arquillian/container/embedded/EmbeddedDeployableContainer.java b/arquillian/container-embedded/src/main/java/org/jboss/as/arquillian/container/embedded/EmbeddedDeployableContainer.java
index 7ca2b8f..7debf2e 100644
--- a/arquillian/container-embedded/src/main/java/org/jboss/as/arquillian/container/embedded/EmbeddedDeployableContainer.java
+++ b/arquillian/container-embedded/src/main/java/org/jboss/as/arquillian/container/embedded/EmbeddedDeployableContainer.java
@@ -86,7 +86,7 @@
         final String bundlePath = config.getBundlePath();
         final File bundlesDir = new File(bundlePath);
         if (!bundlesDir.isDirectory()) {
-            throw new IllegalStateException("Invalid modules directory: " + modulesDir);
+            throw new IllegalStateException("Invalid modules directory: " + bundlesDir);
         }
         SecurityActions.setSystemProperty(SYSPROP_KEY_BUNDLE_PATH, bundlePath);
 
