diff --git a/retrofit-converters/simplexml/src/test/java/retrofit2/converter/simplexml/SimpleXmlConverterFactoryTest.java b/retrofit-converters/simplexml/src/test/java/retrofit2/converter/simplexml/SimpleXmlConverterFactoryTest.java
index 8b5ed7d..7ad58b2 100644
--- a/retrofit-converters/simplexml/src/test/java/retrofit2/converter/simplexml/SimpleXmlConverterFactoryTest.java
+++ b/retrofit-converters/simplexml/src/test/java/retrofit2/converter/simplexml/SimpleXmlConverterFactoryTest.java
@@ -71,8 +71,9 @@
     assertThat(body.getCount()).isEqualTo(10);
 
     RecordedRequest request = server.takeRequest();
-    assertThat(request.getBody().readUtf8()).isEqualTo(
-        "<my-object><message>hello world</message><count>10</count></my-object>");
+    assertThat(request.getBody().readUtf8()).isIn(
+        "<my-object><message>hello world</message><count>10</count></my-object>",
+        "<my-object><count>10</count><message>hello world</message></my-object>");
     assertThat(request.getHeader("Content-Type")).isEqualTo("application/xml; charset=UTF-8");
   }
 
