diff --git a/rt/transports/http/src/main/java/org/apache/cxf/transport/http/HTTPConduit.java b/rt/transports/http/src/main/java/org/apache/cxf/transport/http/HTTPConduit.java
index 50456f4..ab1412a 100644
--- a/rt/transports/http/src/main/java/org/apache/cxf/transport/http/HTTPConduit.java
+++ b/rt/transports/http/src/main/java/org/apache/cxf/transport/http/HTTPConduit.java
@@ -1873,7 +1873,7 @@
             // Nor it should be done in case of DELETE/HEAD/OPTIONS 
             // - strangely, empty PUTs work ok 
             if (!"POST".equals(connection.getRequestMethod())
-                || !"PUT".equals(connection.getRequestMethod())) {
+                && !"PUT".equals(connection.getRequestMethod())) {
                 return;
             }
             
