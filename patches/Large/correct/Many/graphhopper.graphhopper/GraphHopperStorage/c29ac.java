diff --git a/core/src/main/java/com/graphhopper/storage/GraphHopperStorage.java b/core/src/main/java/com/graphhopper/storage/GraphHopperStorage.java
index 1eeea87..7778a4d 100644
--- a/core/src/main/java/com/graphhopper/storage/GraphHopperStorage.java
+++ b/core/src/main/java/com/graphhopper/storage/GraphHopperStorage.java
@@ -966,7 +966,7 @@
     {
         if (extStorage.isRequireEdgeField() && E_ADDITIONAL >= 0)
         {
-            nodes.setInt(edgePointer + E_ADDITIONAL, value);
+            edges.setInt(edgePointer + E_ADDITIONAL, value);
         } else
         {
             throw new AssertionError("This graph does not support an additional edge field.");
