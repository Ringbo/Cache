diff --git a/java/org/apache/coyote/http11/InternalNioInputBuffer.java b/java/org/apache/coyote/http11/InternalNioInputBuffer.java
index 2ee2e07..3438d36 100644
--- a/java/org/apache/coyote/http11/InternalNioInputBuffer.java
+++ b/java/org/apache/coyote/http11/InternalNioInputBuffer.java
@@ -876,7 +876,7 @@
         if (parsingHeader) {
 
             if (lastValid == buf.length) {
-                throw new IOException
+                throw new IllegalArgumentException
                     (sm.getString("iib.requestheadertoolarge.error"));
             }
 
