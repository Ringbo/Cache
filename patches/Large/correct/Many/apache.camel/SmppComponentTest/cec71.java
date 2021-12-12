diff --git a/components/camel-smpp/src/test/java/org/apache/camel/component/smpp/SmppComponentTest.java b/components/camel-smpp/src/test/java/org/apache/camel/component/smpp/SmppComponentTest.java
index c507117..9d36f84 100644
--- a/components/camel-smpp/src/test/java/org/apache/camel/component/smpp/SmppComponentTest.java
+++ b/components/camel-smpp/src/test/java/org/apache/camel/component/smpp/SmppComponentTest.java
@@ -178,7 +178,7 @@
     @Test
     public void createEndpointWithSessionStateListener() throws Exception {
         SimpleRegistry registry = new SimpleRegistry();
-        registry.put("sessionStateListener", new SessionStateListener() {
+        registry.bind("sessionStateListener", new SessionStateListener() {
             @Override
             public void onStateChange(SessionState arg0, SessionState arg1, Session arg2) {
             }
