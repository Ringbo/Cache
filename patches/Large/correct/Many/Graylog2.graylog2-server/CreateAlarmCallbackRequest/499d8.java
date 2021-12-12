diff --git a/src/main/java/org/graylog2/restclient/models/api/requests/alarmcallbacks/CreateAlarmCallbackRequest.java b/src/main/java/org/graylog2/restclient/models/api/requests/alarmcallbacks/CreateAlarmCallbackRequest.java
index a4ec24d..83c1fb8 100644
--- a/src/main/java/org/graylog2/restclient/models/api/requests/alarmcallbacks/CreateAlarmCallbackRequest.java
+++ b/src/main/java/org/graylog2/restclient/models/api/requests/alarmcallbacks/CreateAlarmCallbackRequest.java
@@ -13,7 +13,7 @@
     @Constraints.Required
     public String type;
     @Constraints.Required
-    public Map<String, String> configuration;
+    public Map<String, Object> configuration;
     @SerializedName("creator_user_id")
     public String creatorUserId;
 
@@ -25,11 +25,11 @@
         this.type = type;
     }
 
-    public Map<String, String> getConfiguration() {
+    public Map<String, Object> getConfiguration() {
         return configuration;
     }
 
-    public void setConfiguration(Map<String, String> configuration) {
+    public void setConfiguration(Map<String, Object> configuration) {
         this.configuration = configuration;
     }
 
