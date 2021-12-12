diff --git a/pinot-transport/src/main/java/com/linkedin/pinot/requestHandler/BrokerRequestHandler.java b/pinot-transport/src/main/java/com/linkedin/pinot/requestHandler/BrokerRequestHandler.java
index bd04e6a..47a7604 100644
--- a/pinot-transport/src/main/java/com/linkedin/pinot/requestHandler/BrokerRequestHandler.java
+++ b/pinot-transport/src/main/java/com/linkedin/pinot/requestHandler/BrokerRequestHandler.java
@@ -116,19 +116,19 @@
     List<String> matchedResources = new ArrayList<String>();
     String resourceName =
         BrokerRequestUtils.getOfflineResourceNameForResource(request.getQuerySource().getResourceName());
-    if (_routingTable.findServers(new RoutingTableLookupRequest(resourceName)) == null) {
+    if (_routingTable.findServers(new RoutingTableLookupRequest(resourceName)) != null) {
       matchedResources.add(resourceName);
     }
     resourceName =
         BrokerRequestUtils.getRealtimeResourceNameForResource(request.getQuerySource().getResourceName());
-    if (_routingTable.findServers(new RoutingTableLookupRequest(resourceName)) == null) {
+    if (_routingTable.findServers(new RoutingTableLookupRequest(resourceName)) != null) {
       matchedResources.add(resourceName);
     }
     // For backward compatible
     if (matchedResources.isEmpty()) {
       resourceName =
           request.getQuerySource().getResourceName();
-      if (_routingTable.findServers(new RoutingTableLookupRequest(resourceName)) == null) {
+      if (_routingTable.findServers(new RoutingTableLookupRequest(resourceName)) != null) {
         matchedResources.add(resourceName);
       }
     }
