diff --git a/catalog/camel-route-parser/src/test/java/org/apache/camel/parser/java/RoasterEndpointInjectTest.java b/catalog/camel-route-parser/src/test/java/org/apache/camel/parser/java/RoasterEndpointInjectTest.java
index 5d4619d..0e06268 100644
--- a/catalog/camel-route-parser/src/test/java/org/apache/camel/parser/java/RoasterEndpointInjectTest.java
+++ b/catalog/camel-route-parser/src/test/java/org/apache/camel/parser/java/RoasterEndpointInjectTest.java
@@ -57,7 +57,7 @@
         Assert.assertEquals(1144, details.get(1).getAbsolutePosition());
         Assert.assertEquals(10, details.get(1).getLinePosition());
 
-        Assert.assertEquals("netty4-http:http:someserver:80/hello", details.get(2).getEndpointUri());
+        Assert.assertEquals("netty-http:http:someserver:80/hello", details.get(2).getEndpointUri());
         Assert.assertEquals("36", details.get(2).getLineNumber());
         Assert.assertEquals("36", details.get(2).getLineNumberEnd());
         Assert.assertEquals(1202, details.get(2).getAbsolutePosition());
@@ -67,7 +67,7 @@
         Assert.assertEquals("mock:foo?retainFirst=1", details.get(6).getEndpointUri());
         Assert.assertEquals("45", details.get(6).getLineNumber());
         Assert.assertEquals("46", details.get(6).getLineNumberEnd());
-        Assert.assertEquals(1456, details.get(6).getAbsolutePosition());
+        Assert.assertEquals(1455, details.get(6).getAbsolutePosition());
         Assert.assertEquals(17, details.get(6).getLinePosition());
 
         List<ParserResult> list = CamelJavaParserHelper.parseCamelConsumerUris(method, true, true);
