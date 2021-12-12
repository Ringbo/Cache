diff --git a/src/test/java/io/vertx/test/core/NetTest.java b/src/test/java/io/vertx/test/core/NetTest.java
index 8045ec6..8e9f7d7 100644
--- a/src/test/java/io/vertx/test/core/NetTest.java
+++ b/src/test/java/io/vertx/test/core/NetTest.java
@@ -3103,7 +3103,7 @@
       assertEquals(200, resp.statusCode());
       resp.bodyHandler(buff -> {
         assertEquals("Hello World", buff.toString());
-        testComplete();
+        complete();
       });
     });
     await();
