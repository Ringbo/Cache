diff --git a/curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatch.java b/curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatch.java
index ecdd903..88456af 100644
--- a/curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatch.java
+++ b/curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatch.java
@@ -519,7 +519,8 @@
                     }
                 }
             };
-            client.checkExists().usingWatcher(watcher).inBackground(callback).forPath(ZKPaths.makePath(latchPath, watchPath));
+            // use getData() instead of exists() to avoid leaving unneeded watchers which is a type of resource leak
+            client.getData().usingWatcher(watcher).inBackground(callback).forPath(ZKPaths.makePath(latchPath, watchPath));
         }
     }
 
