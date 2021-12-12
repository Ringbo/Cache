diff --git a/shield/src/test/java/org/elasticsearch/shield/transport/TransportFilterTests.java b/shield/src/test/java/org/elasticsearch/shield/transport/TransportFilterTests.java
index 69e9175..ae82b65 100644
--- a/shield/src/test/java/org/elasticsearch/shield/transport/TransportFilterTests.java
+++ b/shield/src/test/java/org/elasticsearch/shield/transport/TransportFilterTests.java
@@ -128,11 +128,11 @@
         }
     }
 
-    static class Request extends TransportRequest {
+    public static class Request extends TransportRequest {
 
         private String msg;
 
-        Request() {
+        public Request() {
         }
 
         Request(String msg) {
@@ -277,7 +277,7 @@
     }
 
     // Sub class the Shield transport to always inject a mock for testing
-    static class InternalPluginServerTransportService extends ShieldServerTransportService {
+    public static class InternalPluginServerTransportService extends ShieldServerTransportService {
         public static class TestPlugin extends Plugin {
             @Override
             public String name() {
@@ -297,7 +297,7 @@
         }
 
         @Inject
-        InternalPluginServerTransportService(Settings settings, Transport transport, ThreadPool threadPool, AuthenticationService authcService, AuthorizationService authzService, ShieldActionMapper actionMapper, ClientTransportFilter clientTransportFilter) {
+        public InternalPluginServerTransportService(Settings settings, Transport transport, ThreadPool threadPool, AuthenticationService authcService, AuthorizationService authzService, ShieldActionMapper actionMapper, ClientTransportFilter clientTransportFilter) {
             super(settings, transport, threadPool, authcService, authzService, actionMapper, clientTransportFilter);
         }
 
