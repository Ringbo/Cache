diff --git a/core/camel-core/src/test/java/org/apache/camel/language/TokenXMLPairNamespaceSplitChildNamespaceTest.java b/core/camel-core/src/test/java/org/apache/camel/language/TokenXMLPairNamespaceSplitChildNamespaceTest.java
index 3308ce1..4f19374 100644
--- a/core/camel-core/src/test/java/org/apache/camel/language/TokenXMLPairNamespaceSplitChildNamespaceTest.java
+++ b/core/camel-core/src/test/java/org/apache/camel/language/TokenXMLPairNamespaceSplitChildNamespaceTest.java
@@ -53,7 +53,8 @@
     @Test
     public void testTokenXMLPair2() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:split");
-        mock.expectedMessageCount(3);
+        mock.expectedMessageCount(4);
+
         mock.message(0).body().isEqualTo("<order id=\"1\" xmlns=\"http:acme.com\" xmlns:foo=\"http:foo.com\">Camel in Action</order>");
         mock.message(1).body().isEqualTo("<order id=\"2\" xmlns=\"http:acme.com\" xmlns:foo=\"http:foo.com\">ActiveMQ in Action</order>");
         mock.message(2).body().isEqualTo("<order id=\"3\" xmlns=\"http:acme.com\" xmlns:foo=\"http:foo.com\">DSL in Action</order>");
