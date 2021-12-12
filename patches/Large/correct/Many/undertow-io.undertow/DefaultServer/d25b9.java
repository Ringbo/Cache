diff --git a/core/src/test/java/io/undertow/testutils/DefaultServer.java b/core/src/test/java/io/undertow/testutils/DefaultServer.java
index 960dff0..2c5a930 100644
--- a/core/src/test/java/io/undertow/testutils/DefaultServer.java
+++ b/core/src/test/java/io/undertow/testutils/DefaultServer.java
@@ -452,7 +452,7 @@
                 return;
             }
         }
-        if (h2 || h2c || ajp) {
+        if(h2 || h2c || ajp || h2cUpgrade) {
             //h2c-upgrade we still allow HTTP1
             HttpOneOnly httpOneOnly = method.getAnnotation(HttpOneOnly.class);
             if (httpOneOnly == null) {
