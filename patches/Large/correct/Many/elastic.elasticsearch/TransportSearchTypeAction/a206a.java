diff --git a/src/main/java/org/elasticsearch/action/search/type/TransportSearchTypeAction.java b/src/main/java/org/elasticsearch/action/search/type/TransportSearchTypeAction.java
index 26934f7..2ac767e 100644
--- a/src/main/java/org/elasticsearch/action/search/type/TransportSearchTypeAction.java
+++ b/src/main/java/org/elasticsearch/action/search/type/TransportSearchTypeAction.java
@@ -227,7 +227,7 @@
             if (xTotalOps == expectedTotalOps) {
                 try {
                     moveToSecondPhase();
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     if (logger.isDebugEnabled()) {
                         logger.debug(shardIt.shardId() + ": Failed to execute [" + request + "] while moving to second phase", e);
                     }
@@ -261,7 +261,7 @@
                 } else {
                     try {
                         moveToSecondPhase();
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         listener.onFailure(new ReduceSearchPhaseException(firstPhaseName(), "", e, buildShardFailures()));
                     }
                 }
