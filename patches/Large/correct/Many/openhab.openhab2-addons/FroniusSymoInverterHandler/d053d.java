diff --git a/addons/binding/org.openhab.binding.fronius/src/main/java/org/openhab/binding/fronius/handler/FroniusSymoInverterHandler.java b/addons/binding/org.openhab.binding.fronius/src/main/java/org/openhab/binding/fronius/handler/FroniusSymoInverterHandler.java
index ef67d8c..11e8824 100644
--- a/addons/binding/org.openhab.binding.fronius/src/main/java/org/openhab/binding/fronius/handler/FroniusSymoInverterHandler.java
+++ b/addons/binding/org.openhab.binding.fronius/src/main/java/org/openhab/binding/fronius/handler/FroniusSymoInverterHandler.java
@@ -74,7 +74,8 @@
     protected Object getValue(String channelId) {
         String[] fields = StringUtils.split(channelId, "#");
 
-        if (inverterRealtimeResponse == null) {
+        if (inverterRealtimeResponse == null || inverterRealtimeResponse.getBody() == null
+                || inverterRealtimeResponse.getBody().getData() == null) {
             return null;
         }
 
@@ -107,7 +108,9 @@
                 return inverterRealtimeResponse.getBody().getData().getUdc();
         }
 
-        if (powerFlowResponse == null) {
+        if (powerFlowResponse == null || powerFlowResponse.getBody() == null
+                || powerFlowResponse.getBody().getData() == null
+                || powerFlowResponse.getBody().getData().getSite() == null) {
             return null;
         }
         switch (fieldName) {
