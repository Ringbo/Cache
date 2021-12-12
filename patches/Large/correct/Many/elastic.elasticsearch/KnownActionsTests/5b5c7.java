diff --git a/elasticsearch/src/test/java/org/elasticsearch/transport/KnownActionsTests.java b/elasticsearch/src/test/java/org/elasticsearch/transport/KnownActionsTests.java
index 6b1e96f..84cfca3 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/transport/KnownActionsTests.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/transport/KnownActionsTests.java
@@ -75,7 +75,7 @@
     public void testAllTransportHandlersAreKnown() {
         TransportService transportService = internalCluster().getDataNodeInstance(TransportService.class);
         for (String handler : transportService.requestHandlers.keySet()) {
-            if (!knownActions.contains(handler)) {
+            if (!knownHandlers.contains(handler)) {
                 assertThat("elasticsearch core transport handler [" + handler + "] is unknown to security", knownHandlers,
                         hasItem(handler));
             }
