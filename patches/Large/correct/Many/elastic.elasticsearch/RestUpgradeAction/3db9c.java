diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/upgrade/RestUpgradeAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/upgrade/RestUpgradeAction.java
index 8c1b1c0..a1c9c0b 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/upgrade/RestUpgradeAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/upgrade/RestUpgradeAction.java
@@ -85,7 +85,7 @@
             public RestResponse buildResponse(UpgradeResponse response, XContentBuilder builder) throws Exception {
                 builder.startObject();
                 buildBroadcastShardsHeader(builder, request, response);
-                builder.startArray("upgraded_indices");
+                builder.startObject("upgraded_indices");
                 for (Map.Entry<String, String> entry : response.versions().entrySet()) {
                     builder.field(entry.getKey(), entry.getValue(), XContentBuilder.FieldCaseConversion.NONE);
                 }
