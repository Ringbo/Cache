diff --git a/core/src/main/java/com/graphhopper/storage/TurnCostExtension.java b/core/src/main/java/com/graphhopper/storage/TurnCostExtension.java
index 0bde455..0c03fec 100644
--- a/core/src/main/java/com/graphhopper/storage/TurnCostExtension.java
+++ b/core/src/main/java/com/graphhopper/storage/TurnCostExtension.java
@@ -178,7 +178,7 @@
             turnCostIndex = nextTurnCostIndex;
         }
         // so many turn restrictions on one node? here is something wrong
-        if (i > 1000)
+        if (i >= 1000)
             throw new IllegalStateException("something went wrong: there seems to be no end of the turn cost-list!?");
         return EMPTY_FLAGS;
     }
