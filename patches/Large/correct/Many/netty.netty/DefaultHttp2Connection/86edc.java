diff --git a/codec-http2/src/main/java/io/netty/handler/codec/http2/DefaultHttp2Connection.java b/codec-http2/src/main/java/io/netty/handler/codec/http2/DefaultHttp2Connection.java
index c99c87a..b8f9fea 100644
--- a/codec-http2/src/main/java/io/netty/handler/codec/http2/DefaultHttp2Connection.java
+++ b/codec-http2/src/main/java/io/netty/handler/codec/http2/DefaultHttp2Connection.java
@@ -465,7 +465,7 @@
             assert amt > 0;
             prioritizableForTree += amt;
             if (parent != null && parent != oldParent) {
-                parent.incrementPrioritizableForTree(amt, oldParent);
+                parent.incrementPrioritizableForTree0(amt, oldParent);
             }
         }
 
@@ -487,7 +487,7 @@
             assert amt > 0;
             prioritizableForTree -= amt;
             if (parent != null) {
-                parent.decrementPrioritizableForTree(amt);
+                parent.decrementPrioritizableForTree0(amt);
             }
         }
 
