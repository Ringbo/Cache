diff --git a/presto-main/src/main/java/com/facebook/presto/operator/MultiChannelGroupByHash.java b/presto-main/src/main/java/com/facebook/presto/operator/MultiChannelGroupByHash.java
index 8986038..26f257c 100644
--- a/presto-main/src/main/java/com/facebook/presto/operator/MultiChannelGroupByHash.java
+++ b/presto-main/src/main/java/com/facebook/presto/operator/MultiChannelGroupByHash.java
@@ -632,7 +632,7 @@
         public boolean process()
         {
             int positionCount = page.getPositionCount();
-            checkState(lastPosition < positionCount, "position count out of bound");
+            checkState(lastPosition <= positionCount, "position count out of bound");
             checkState(!finished);
 
             // needRehash() == false indicates we have reached capacity boundary and a rehash is needed.
