diff --git a/java/org/apache/coyote/http11/InternalAprInputBuffer.java b/java/org/apache/coyote/http11/InternalAprInputBuffer.java
index f1137cf..a00ce8c 100644
--- a/java/org/apache/coyote/http11/InternalAprInputBuffer.java
+++ b/java/org/apache/coyote/http11/InternalAprInputBuffer.java
@@ -751,7 +751,7 @@
         if (parsingHeader) {
 
             if (lastValid == buf.length) {
-                throw new IOException
+                throw new IllegalArgumentException
                     (sm.getString("iib.requestheadertoolarge.error"));
             }
 
