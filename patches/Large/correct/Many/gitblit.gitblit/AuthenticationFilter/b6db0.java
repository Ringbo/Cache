diff --git a/src/com/gitblit/AuthenticationFilter.java b/src/com/gitblit/AuthenticationFilter.java
index caa8a07..50a67a0 100644
--- a/src/com/gitblit/AuthenticationFilter.java
+++ b/src/com/gitblit/AuthenticationFilter.java
@@ -103,7 +103,7 @@
 			String credentials = new String(Base64.decode(base64Credentials),
 					Charset.forName("UTF-8"));
 			// credentials = username:password
-			final String[] values = credentials.split(":");
+			final String[] values = credentials.split(":",2);
 
 			if (values.length == 2) {
 				String username = values[0];
