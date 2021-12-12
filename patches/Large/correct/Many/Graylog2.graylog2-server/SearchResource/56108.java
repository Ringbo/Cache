diff --git a/graylog2-server/src/main/java/org/graylog2/rest/resources/search/SearchResource.java b/graylog2-server/src/main/java/org/graylog2/rest/resources/search/SearchResource.java
index 0fa4eb9..9a93590 100644
--- a/graylog2-server/src/main/java/org/graylog2/rest/resources/search/SearchResource.java
+++ b/graylog2-server/src/main/java/org/graylog2/rest/resources/search/SearchResource.java
@@ -161,7 +161,7 @@
     }
 
     protected List<ResultMessageSummary> resultMessageListtoValueList(List<ResultMessage> resultMessages) {
-        final List<ResultMessageSummary> result = Lists.newArrayListWithExpectedSize(resultMessages.size());
+        final List<ResultMessageSummary> result = Lists.newArrayListWithCapacity(resultMessages.size());
 
         for (ResultMessage resultMessage : resultMessages) {
             result.add(ResultMessageSummary.create(resultMessage.highlightRanges, resultMessage.getMessage(), resultMessage.getIndex()));
