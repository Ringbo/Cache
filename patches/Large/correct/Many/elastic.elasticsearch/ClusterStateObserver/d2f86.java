diff --git a/core/src/main/java/org/elasticsearch/cluster/ClusterStateObserver.java b/core/src/main/java/org/elasticsearch/cluster/ClusterStateObserver.java
index 60cb506..ca46416 100644
--- a/core/src/main/java/org/elasticsearch/cluster/ClusterStateObserver.java
+++ b/core/src/main/java/org/elasticsearch/cluster/ClusterStateObserver.java
@@ -120,7 +120,7 @@
                 timeoutTimeLeftMS = timeOutValue.millis() - timeSinceStartMS;
                 if (timeoutTimeLeftMS <= 0l) {
                     // things have timeout while we were busy -> notify
-                    logger.debug("observer timed out. notifying listener. timeout setting [{}], time since start [{}]", timeOutValue, new TimeValue(timeSinceStartMS));
+                    logger.trace("observer timed out. notifying listener. timeout setting [{}], time since start [{}]", timeOutValue, new TimeValue(timeSinceStartMS));
                     // update to latest, in case people want to retry
                     timedOut = true;
                     lastObservedState.set(new ObservedState(clusterService.state()));
@@ -232,7 +232,7 @@
             if (context != null) {
                 clusterService.remove(this);
                 long timeSinceStartMS = TimeValue.nsecToMSec(System.nanoTime() - startTimeNS);
-                logger.debug("observer: timeout notification from cluster service. timeout setting [{}], time since start [{}]", timeOutValue, new TimeValue(timeSinceStartMS));
+                logger.trace("observer: timeout notification from cluster service. timeout setting [{}], time since start [{}]", timeOutValue, new TimeValue(timeSinceStartMS));
                 // update to latest, in case people want to retry
                 lastObservedState.set(new ObservedState(clusterService.state()));
                 timedOut = true;
