diff --git a/java/org/apache/coyote/http2/Flags.java b/java/org/apache/coyote/http2/Flags.java
index 6c63f93..d7ff181 100644
--- a/java/org/apache/coyote/http2/Flags.java
+++ b/java/org/apache/coyote/http2/Flags.java
@@ -24,26 +24,26 @@
 
 
     static boolean isEndOfStream(int flags) {
-        return (flags & 0x01) > 0;
+        return (flags & 0x01) != 0;
     }
 
 
     static boolean isAck(int flags) {
-        return (flags & 0x01) > 0;
+        return (flags & 0x01) != 0;
     }
 
 
     static boolean isEndOfHeaders(int flags) {
-        return (flags & 0x04) > 0;
+        return (flags & 0x04) != 0;
     }
 
 
     static boolean hasPadding(int flags) {
-        return (flags & 0x08) > 0;
+        return (flags & 0x08) != 0;
     }
 
 
     static boolean hasPriority(int flags) {
-        return (flags & 0x20) > 0;
+        return (flags & 0x20) != 0;
     }
 }
