diff --git a/arbiter-ui/src/main/java/org/deeplearning4j/arbiter/ui/module/ArbiterModule.java b/arbiter-ui/src/main/java/org/deeplearning4j/arbiter/ui/module/ArbiterModule.java
index 103d497..bacc8ae 100644
--- a/arbiter-ui/src/main/java/org/deeplearning4j/arbiter/ui/module/ArbiterModule.java
+++ b/arbiter-ui/src/main/java/org/deeplearning4j/arbiter/ui/module/ArbiterModule.java
@@ -191,7 +191,7 @@
     }
 
     private Result setSession(String newSessionID) {
-        log.info("SET TO SESSION: {}", newSessionID);
+        log.debug("Arbiter UI: Set to session {}", newSessionID);
 
         if (knownSessionIDs.containsKey(newSessionID)) {
             currentSessionID = newSessionID;
@@ -261,7 +261,7 @@
 
         StatsStorage ss = knownSessionIDs.get(currentSessionID);
         if(ss == null){
-            log.warn("getModelLastUpdateTimes(): Session ID is unknown: {}", currentSessionID);
+            log.debug("getModelLastUpdateTimes(): Session ID is unknown: {}", currentSessionID);
             return ok("-1");
         }
 
@@ -289,7 +289,7 @@
 
         StatsStorage ss = knownSessionIDs.get(currentSessionID);
         if(ss == null){
-            log.warn("getModelLastUpdateTimes(): Session ID is unknown: {}", currentSessionID);
+            log.debug("getModelLastUpdateTimes(): Session ID is unknown: {}", currentSessionID);
             return ok();
         }
 
@@ -468,7 +468,7 @@
 
         StatsStorage ss = knownSessionIDs.get(currentSessionID);
         if(ss == null){
-            log.warn("getOptimizationConfig(): Session ID is unknown: {}", currentSessionID);
+            log.debug("getOptimizationConfig(): Session ID is unknown: {}", currentSessionID);
             return ok();
         }
 
@@ -557,7 +557,7 @@
     private Result getSummaryResults(){
         StatsStorage ss = knownSessionIDs.get(currentSessionID);
         if(ss == null){
-            log.warn("getSummaryResults(): Session ID is unknown: {}", currentSessionID);
+            log.debug("getSummaryResults(): Session ID is unknown: {}", currentSessionID);
             return ok();
         }
 
@@ -578,7 +578,7 @@
     private Result getSummaryStatus(){
         StatsStorage ss = knownSessionIDs.get(currentSessionID);
         if(ss == null){
-            log.warn("getOptimizationConfig(): Session ID is unknown: {}", currentSessionID);
+            log.debug("getOptimizationConfig(): Session ID is unknown: {}", currentSessionID);
             return ok();
         }
 
