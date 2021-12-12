diff --git a/src/main/java/com/netflix/simianarmy/aws/janitor/crawler/edda/EddaEBSVolumeJanitorCrawler.java b/src/main/java/com/netflix/simianarmy/aws/janitor/crawler/edda/EddaEBSVolumeJanitorCrawler.java
index 3685f62..8f4f47b 100644
--- a/src/main/java/com/netflix/simianarmy/aws/janitor/crawler/edda/EddaEBSVolumeJanitorCrawler.java
+++ b/src/main/java/com/netflix/simianarmy/aws/janitor/crawler/edda/EddaEBSVolumeJanitorCrawler.java
@@ -96,9 +96,9 @@
         LOGGER.info(String.format("Getting owners for all instances in region %s", region));
 
         long startTime = DateTime.now().minusDays(LOOKBACK_DAYS).getMillis();
-        String url = String.format("%s/view/instances;_since=%d;state.name=running;tags.key=owner;"
+        String url = String.format("%1$s/view/instances;_since=%2$d;state.name=running;tags.key=%3$s;"
                 + "_expand:(instanceId,tags:(key,value))",
-                eddaClient.getBaseUrl(region), startTime);
+                eddaClient.getBaseUrl(region), startTime, BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY);
         JsonNode jsonNode = null;
         try {
             jsonNode = eddaClient.getJsonNodeFromUrl(url);
