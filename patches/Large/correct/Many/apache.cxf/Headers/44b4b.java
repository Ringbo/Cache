diff --git a/rt/transports/http/src/main/java/org/apache/cxf/transport/http/Headers.java b/rt/transports/http/src/main/java/org/apache/cxf/transport/http/Headers.java
index 73d6d48..4ba6c52 100644
--- a/rt/transports/http/src/main/java/org/apache/cxf/transport/http/Headers.java
+++ b/rt/transports/http/src/main/java/org/apache/cxf/transport/http/Headers.java
@@ -321,7 +321,7 @@
             }
         }
         // make sure we don't add more than one User-Agent header
-        if (connection.getRequestProperty("User-Agent") != null) {
+        if (connection.getRequestProperty("User-Agent") == null) {
             connection.addRequestProperty("User-Agent", Version.getCompleteVersionString());
         }
     }
