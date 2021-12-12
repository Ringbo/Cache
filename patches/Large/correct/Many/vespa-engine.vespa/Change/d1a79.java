diff --git a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/application/Change.java b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/application/Change.java
index 1dc7fd3..395e1f7 100644
--- a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/application/Change.java
+++ b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/application/Change.java
@@ -97,22 +97,22 @@
 
     /** Returns whether this change carries an application downgrade relative to the given version. */
     public boolean downgrades(ApplicationVersion version) {
-        return application.map(version::compareTo).orElse(0) < 0;
+        return application.map(version::compareTo).orElse(0) > 0;
     }
 
     /** Returns whether this change carries a platform downgrade relative to the given version. */
     public boolean downgrades(Version version) {
-        return platform.map(version::compareTo).orElse(0) < 0;
+        return platform.map(version::compareTo).orElse(0) > 0;
     }
 
     /** Returns whether this change carries an application upgrade relative to the given version. */
     public boolean upgrades(ApplicationVersion version) {
-        return application.map(version::compareTo).orElse(0) > 0;
+        return application.map(version::compareTo).orElse(0) < 0;
     }
 
     /** Returns whether this change carries a platform upgrade relative to the given version. */
     public boolean upgrades(Version version) {
-        return platform.map(version::compareTo).orElse(0) > 0;
+        return platform.map(version::compareTo).orElse(0) < 0;
     }
 
 }
