diff --git a/caffeine/src/main/java/com/github/benmanes/caffeine/cache/BoundedLocalCache.java b/caffeine/src/main/java/com/github/benmanes/caffeine/cache/BoundedLocalCache.java
index 8180632..7a472ea 100644
--- a/caffeine/src/main/java/com/github/benmanes/caffeine/cache/BoundedLocalCache.java
+++ b/caffeine/src/main/java/com/github/benmanes/caffeine/cache/BoundedLocalCache.java
@@ -1229,7 +1229,7 @@
       }
       demoted.makeMainProbation();
       accessOrderProbationDeque().add(demoted);
-      mainProtectedWeightedSize -= node.getPolicyWeight();
+      mainProtectedWeightedSize -= demoted.getPolicyWeight();
     }
 
     lazySetMainProtectedWeightedSize(mainProtectedWeightedSize);
