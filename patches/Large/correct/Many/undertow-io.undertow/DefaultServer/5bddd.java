diff --git a/core/src/test/java/io/undertow/testutils/DefaultServer.java b/core/src/test/java/io/undertow/testutils/DefaultServer.java
index 33813a9..9282ec5 100644
--- a/core/src/test/java/io/undertow/testutils/DefaultServer.java
+++ b/core/src/test/java/io/undertow/testutils/DefaultServer.java
@@ -482,7 +482,7 @@
                 return;
             }
         }
-        if(spdy || spdyPlain || h2 || h2c) {
+        if(spdy || spdyPlain || h2 || h2c || ajp) {
             HttpOneOnly httpOneOnly = method.getAnnotation(HttpOneOnly.class);
             if(httpOneOnly == null) {
                 httpOneOnly = method.getMethod().getDeclaringClass().getAnnotation(HttpOneOnly.class);
