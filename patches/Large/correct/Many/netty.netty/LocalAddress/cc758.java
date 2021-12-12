diff --git a/src/main/java/org/jboss/netty/channel/local/LocalAddress.java b/src/main/java/org/jboss/netty/channel/local/LocalAddress.java
index 27c78ce..06cf91b 100644
--- a/src/main/java/org/jboss/netty/channel/local/LocalAddress.java
+++ b/src/main/java/org/jboss/netty/channel/local/LocalAddress.java
@@ -115,7 +115,7 @@
                 }
 
                 int a = System.identityHashCode(this);
-                int b = System.identityHashCode(this);
+                int b = System.identityHashCode(o);
                 if (a < b) {
                     return -1;
                 } else if (a > b) {
