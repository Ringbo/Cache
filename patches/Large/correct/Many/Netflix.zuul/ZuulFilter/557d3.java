diff --git a/zuul-core/src/main/java/com/netflix/zuul/filters/ZuulFilter.java b/zuul-core/src/main/java/com/netflix/zuul/filters/ZuulFilter.java
index 908b895..ed721f0 100644
--- a/zuul-core/src/main/java/com/netflix/zuul/filters/ZuulFilter.java
+++ b/zuul-core/src/main/java/com/netflix/zuul/filters/ZuulFilter.java
@@ -68,7 +68,7 @@
      *
      * @return ZuulMessage
      */
-    ZuulMessage getDefaultOutput(I input);
+    O getDefaultOutput(I input);
 
     /**
      * Filter indicates it needs to read and buffer whole body before it can operate on the messages by returning true.
