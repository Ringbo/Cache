diff --git a/presto-main/src/main/java/com/facebook/presto/execution/resourceGroups/InternalResourceGroup.java b/presto-main/src/main/java/com/facebook/presto/execution/resourceGroups/InternalResourceGroup.java
index f285fc7..df70212 100644
--- a/presto-main/src/main/java/com/facebook/presto/execution/resourceGroups/InternalResourceGroup.java
+++ b/presto-main/src/main/java/com/facebook/presto/execution/resourceGroups/InternalResourceGroup.java
@@ -837,7 +837,7 @@
                 maxRunning = Math.max(1, maxRunning);
             }
             return runningQueries.size() + descendantRunningQueries < maxRunning &&
-                    cachedMemoryUsageBytes < softMemoryLimitBytes;
+                    cachedMemoryUsageBytes <= softMemoryLimitBytes;
         }
     }
 
