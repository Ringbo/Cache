diff --git a/java/org/apache/catalina/ha/session/DeltaSession.java b/java/org/apache/catalina/ha/session/DeltaSession.java
index 3eeeab8..9e68346 100644
--- a/java/org/apache/catalina/ha/session/DeltaSession.java
+++ b/java/org/apache/catalina/ha/session/DeltaSession.java
@@ -175,7 +175,7 @@
                     ClassLoader[] loaders = getClassLoaders();
                     if (loaders != null && loaders.length > 0)
                         Thread.currentThread().setContextClassLoader(loaders[0]);
-                    getDeltaRequest().execute(this);
+                    getDeltaRequest().execute(this, ((ClusterManager)getManager()).isNotifyListenersOnReplication());
                 } finally {
                     Thread.currentThread().setContextClassLoader(contextLoader);
                 }
