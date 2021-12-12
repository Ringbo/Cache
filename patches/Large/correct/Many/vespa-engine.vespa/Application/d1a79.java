diff --git a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/Application.java b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/Application.java
index ffda9b7..748bf2c 100644
--- a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/Application.java
+++ b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/Application.java
@@ -151,7 +151,7 @@
     /** Returns the version a new deployment to this zone should use for this application */
     public Version deployVersionIn(ZoneId zone, Controller controller) {
         Version current = versionIn(zone, controller);
-        return change.platform().filter(ignored -> change.downgrades(current)).orElse(current);
+        return change.platform().filter(ignored -> ! change.downgrades(current)).orElse(current);
     }
 
     /** Returns the current version this application has, or if none; should use, in the given zone */
