diff --git a/server/sonar-server/src/main/java/org/sonar/server/projectanalysis/ws/SearchData.java b/server/sonar-server/src/main/java/org/sonar/server/projectanalysis/ws/SearchData.java
index 56ad720..233a59c 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/projectanalysis/ws/SearchData.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/projectanalysis/ws/SearchData.java
@@ -47,7 +47,7 @@
       .andTotal(builder.countAnalyses);
   }
 
-  private ListMultimap<String, EventDto> buildEvents(List<EventDto> events) {
+  private static ListMultimap<String, EventDto> buildEvents(List<EventDto> events) {
     return events.stream().collect(MoreCollectors.index(EventDto::getAnalysisUuid));
   }
 
