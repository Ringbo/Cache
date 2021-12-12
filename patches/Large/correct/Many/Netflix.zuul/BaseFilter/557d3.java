diff --git a/zuul-core/src/main/java/com/netflix/zuul/filters/BaseFilter.java b/zuul-core/src/main/java/com/netflix/zuul/filters/BaseFilter.java
index ca5c81a..0b41e08 100644
--- a/zuul-core/src/main/java/com/netflix/zuul/filters/BaseFilter.java
+++ b/zuul-core/src/main/java/com/netflix/zuul/filters/BaseFilter.java
@@ -79,9 +79,9 @@
     }
 
     @Override
-    public ZuulMessage getDefaultOutput(I input)
+    public O getDefaultOutput(I input)
     {
-        return input;
+        return (O)input;
     }
 
     @Override
