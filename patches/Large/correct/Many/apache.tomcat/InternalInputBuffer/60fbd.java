diff --git a/java/org/apache/coyote/http11/InternalInputBuffer.java b/java/org/apache/coyote/http11/InternalInputBuffer.java
index d98a64b..326b4c3 100644
--- a/java/org/apache/coyote/http11/InternalInputBuffer.java
+++ b/java/org/apache/coyote/http11/InternalInputBuffer.java
@@ -723,7 +723,7 @@
         if (parsingHeader) {
 
             if (lastValid == buf.length) {
-                throw new IOException
+                throw new IllegalArgumentException
                     (sm.getString("iib.requestheadertoolarge.error"));
             }
 
