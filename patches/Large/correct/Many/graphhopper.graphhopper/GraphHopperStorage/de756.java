diff --git a/core/src/main/java/com/graphhopper/storage/GraphHopperStorage.java b/core/src/main/java/com/graphhopper/storage/GraphHopperStorage.java
index d220a8b..f59b519 100644
--- a/core/src/main/java/com/graphhopper/storage/GraphHopperStorage.java
+++ b/core/src/main/java/com/graphhopper/storage/GraphHopperStorage.java
@@ -1512,7 +1512,7 @@
             bounds.maxEle = Helper.intToEle(nodes.getHeader(8 * 4));
         }
 
-        return 7;
+        return 9;
     }
 
     protected int setNodesHeader()
@@ -1530,7 +1530,7 @@
             nodes.setHeader(8 * 4, Helper.eleToInt(bounds.maxEle));
         }
 
-        return 7;
+        return 9;
     }
 
     protected int loadEdgesHeader()
