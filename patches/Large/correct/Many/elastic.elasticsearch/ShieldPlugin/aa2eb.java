diff --git a/elasticsearch/x-pack/shield/src/main/java/org/elasticsearch/shield/ShieldPlugin.java b/elasticsearch/x-pack/shield/src/main/java/org/elasticsearch/shield/ShieldPlugin.java
index 61226c5..0003dcd 100644
--- a/elasticsearch/x-pack/shield/src/main/java/org/elasticsearch/shield/ShieldPlugin.java
+++ b/elasticsearch/x-pack/shield/src/main/java/org/elasticsearch/shield/ShieldPlugin.java
@@ -210,7 +210,7 @@
         assert shieldLicenseState != null;
         if (flsDlsEnabled(settings)) {
             module.setSearcherWrapper((indexService) -> new ShieldIndexSearcherWrapper(indexService.getIndexSettings(),
-                    indexService.getQueryShardContext(), indexService.mapperService(),
+                    indexService.newQueryShardContext(), indexService.mapperService(),
                     indexService.cache().bitsetFilterCache(), indexService.getIndexServices().getThreadPool().getThreadContext(),
                     shieldLicenseState));
         }
