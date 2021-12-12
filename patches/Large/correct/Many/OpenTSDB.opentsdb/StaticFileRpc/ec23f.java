diff --git a/src/tsd/StaticFileRpc.java b/src/tsd/StaticFileRpc.java
index f2d73e3..8ec214c 100644
--- a/src/tsd/StaticFileRpc.java
+++ b/src/tsd/StaticFileRpc.java
@@ -44,7 +44,7 @@
     final int questionmark = uri.indexOf('?', 3);
     final int pathend = questionmark > 0 ? questionmark : uri.length();
     query.sendFile(tsdb.getConfig().getString("tsd.http.staticroot") 
-                 + uri.substring(3, pathend),
+                 + uri.substring(2, pathend),  // Drop the "/s"
                    uri.contains("nocache") ? 0 : 31536000 /*=1yr*/);
   }
 }
