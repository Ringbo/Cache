diff --git a/collectors/build/sonar/src/main/java/com/capitalone/dashboard/collector/DefaultSonar6Client.java b/collectors/build/sonar/src/main/java/com/capitalone/dashboard/collector/DefaultSonar6Client.java
index b720c9c..482f636 100644
--- a/collectors/build/sonar/src/main/java/com/capitalone/dashboard/collector/DefaultSonar6Client.java
+++ b/collectors/build/sonar/src/main/java/com/capitalone/dashboard/collector/DefaultSonar6Client.java
@@ -201,7 +201,7 @@
     public JSONArray getQualityProfileConfigurationChanges(String instanceUrl,String qualityProfile) throws ParseException{
     	String url = instanceUrl + URL_QUALITY_PROFILE_CHANGES + qualityProfile;
     	try {
-    		JSONArray qualityProfileConfigChanges = this.parseAsArray(instanceUrl, "events");
+    		JSONArray qualityProfileConfigChanges = this.parseAsArray(url, "events");
     		return qualityProfileConfigChanges;
     	} catch (ParseException e) {
     		LOG.error("Could not parse response from: " + url, e);
