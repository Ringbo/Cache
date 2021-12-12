diff --git a/jetty-client/src/test/java/org/eclipse/jetty/client/util/TypedContentProviderTest.java b/jetty-client/src/test/java/org/eclipse/jetty/client/util/TypedContentProviderTest.java
index 62781cc..7d8b802 100644
--- a/jetty-client/src/test/java/org/eclipse/jetty/client/util/TypedContentProviderTest.java
+++ b/jetty-client/src/test/java/org/eclipse/jetty/client/util/TypedContentProviderTest.java
@@ -127,7 +127,7 @@
             {
                 baseRequest.setHandled(true);
                 Assert.assertEquals("GET", request.getMethod());
-                Assert.assertNull(request.getContentType());
+                Assert.assertNotNull(request.getContentType());
                 Assert.assertEquals(content, IO.toString(request.getInputStream()));
             }
         });
