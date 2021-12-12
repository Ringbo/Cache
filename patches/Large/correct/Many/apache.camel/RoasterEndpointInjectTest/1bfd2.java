diff --git a/catalog/camel-route-parser/src/test/java/org/apache/camel/parser/java/RoasterEndpointInjectTest.java b/catalog/camel-route-parser/src/test/java/org/apache/camel/parser/java/RoasterEndpointInjectTest.java
index 296483c..5d4619d 100644
--- a/catalog/camel-route-parser/src/test/java/org/apache/camel/parser/java/RoasterEndpointInjectTest.java
+++ b/catalog/camel-route-parser/src/test/java/org/apache/camel/parser/java/RoasterEndpointInjectTest.java
@@ -48,26 +48,26 @@
         Assert.assertEquals("timer:foo?period=4999", details.get(0).getEndpointUri());
         Assert.assertEquals("28", details.get(0).getLineNumber());
         Assert.assertEquals("28", details.get(0).getLineNumberEnd());
-        Assert.assertEquals(1062, details.get(0).getAbsolutePosition());
+        Assert.assertEquals(1061, details.get(0).getAbsolutePosition());
         Assert.assertEquals(10, details.get(0).getLinePosition());
 
         Assert.assertEquals("log:a", details.get(1).getEndpointUri());
         Assert.assertEquals("32", details.get(1).getLineNumber());
         Assert.assertEquals("32", details.get(1).getLineNumberEnd());
-        Assert.assertEquals(1145, details.get(1).getAbsolutePosition());
+        Assert.assertEquals(1144, details.get(1).getAbsolutePosition());
         Assert.assertEquals(10, details.get(1).getLinePosition());
 
         Assert.assertEquals("netty4-http:http:someserver:80/hello", details.get(2).getEndpointUri());
         Assert.assertEquals("36", details.get(2).getLineNumber());
         Assert.assertEquals("36", details.get(2).getLineNumberEnd());
-        Assert.assertEquals(1203, details.get(2).getAbsolutePosition());
+        Assert.assertEquals(1202, details.get(2).getAbsolutePosition());
         Assert.assertEquals(10, details.get(2).getLinePosition());
 
         // spans 2 lines
         Assert.assertEquals("mock:foo?retainFirst=1", details.get(6).getEndpointUri());
         Assert.assertEquals("45", details.get(6).getLineNumber());
         Assert.assertEquals("46", details.get(6).getLineNumberEnd());
-        Assert.assertEquals(1457, details.get(6).getAbsolutePosition());
+        Assert.assertEquals(1456, details.get(6).getAbsolutePosition());
         Assert.assertEquals(17, details.get(6).getLinePosition());
 
         List<ParserResult> list = CamelJavaParserHelper.parseCamelConsumerUris(method, true, true);
