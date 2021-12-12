diff --git a/src/org/nutz/http/Sender.java b/src/org/nutz/http/Sender.java
index 286d5c4..672bb9e 100644
--- a/src/org/nutz/http/Sender.java
+++ b/src/org/nutz/http/Sender.java
@@ -87,7 +87,7 @@
 		Header header = request.getHeader();
 		if (null != header)
 			for (Entry<String, String> entry : header.getAll())
-				conn.addRequestProperty(entry.getKey(), entry.getKey());
+				conn.addRequestProperty(entry.getKey(), entry.getValue());
 	}
 
 }
