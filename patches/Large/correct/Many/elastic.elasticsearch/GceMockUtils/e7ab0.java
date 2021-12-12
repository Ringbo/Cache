diff --git a/plugins/discovery-gce/src/test/java/org/elasticsearch/discovery/gce/GceMockUtils.java b/plugins/discovery-gce/src/test/java/org/elasticsearch/discovery/gce/GceMockUtils.java
index 11e4ae8..86fa7f1 100644
--- a/plugins/discovery-gce/src/test/java/org/elasticsearch/discovery/gce/GceMockUtils.java
+++ b/plugins/discovery-gce/src/test/java/org/elasticsearch/discovery/gce/GceMockUtils.java
@@ -78,7 +78,7 @@
         // We extract from the url the mock file path we want to use
         String mockFileName = Strings.replace(url, urlRoot, "");
 
-        URL resource = GceInstancesServiceMock.class.getResource(mockFileName);
+        URL resource = GceMockUtils.class.getResource(mockFileName);
         if (resource == null) {
             throw new IOException("can't read [" + url + "] in src/test/resources/org/elasticsearch/discovery/gce");
         }
