diff --git a/java/org/apache/coyote/http11/Http11NioProtocol.java b/java/org/apache/coyote/http11/Http11NioProtocol.java
index 8143ebc..3802214 100644
--- a/java/org/apache/coyote/http11/Http11NioProtocol.java
+++ b/java/org/apache/coyote/http11/Http11NioProtocol.java
@@ -75,7 +75,7 @@
     }
 
     public int getPollerThreadPriority() {
-      return ((NioEndpoint)getEndpoint()).getThreadPriority();
+      return ((NioEndpoint)getEndpoint()).getPollerThreadPriority();
     }
 
 
