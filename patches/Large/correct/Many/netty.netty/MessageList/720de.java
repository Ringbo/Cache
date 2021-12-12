diff --git a/transport/src/main/java/io/netty/channel/MessageList.java b/transport/src/main/java/io/netty/channel/MessageList.java
index 0a667b9..1b53fbb 100644
--- a/transport/src/main/java/io/netty/channel/MessageList.java
+++ b/transport/src/main/java/io/netty/channel/MessageList.java
@@ -268,7 +268,7 @@
         try {
             if (byteBufsOnly) {
                 while (i < srcEndIdx) {
-                    T m = src[srcIdx];
+                    T m = src[i];
                     if (m == null) {
                         throw new NullPointerException("src[" + srcIdx + ']');
                     }
@@ -284,7 +284,7 @@
             }
 
             for (; i < srcEndIdx; i ++) {
-                T m = src[srcIdx];
+                T m = src[i];
                 if (m == null) {
                     throw new NullPointerException("src[" + srcIdx + ']');
                 }
