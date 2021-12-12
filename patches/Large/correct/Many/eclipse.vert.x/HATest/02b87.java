diff --git a/src/test/java/io/vertx/test/core/HATest.java b/src/test/java/io/vertx/test/core/HATest.java
index 984e355..7e5558d 100644
--- a/src/test/java/io/vertx/test/core/HATest.java
+++ b/src/test/java/io/vertx/test/core/HATest.java
@@ -424,7 +424,7 @@
       } catch (Exception e) {
         fut.fail(e);
       }
-    }, ar -> {
+    }, false, ar -> {
       if (!ar.succeeded()) {
         fail(ar.cause());
       }
