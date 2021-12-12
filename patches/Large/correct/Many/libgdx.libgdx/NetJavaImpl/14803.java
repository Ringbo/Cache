diff --git a/gdx/src/com/badlogic/gdx/net/NetJavaImpl.java b/gdx/src/com/badlogic/gdx/net/NetJavaImpl.java
index 303f803..a844689 100644
--- a/gdx/src/com/badlogic/gdx/net/NetJavaImpl.java
+++ b/gdx/src/com/badlogic/gdx/net/NetJavaImpl.java
@@ -146,7 +146,7 @@
 			connection.setDoOutput(doingOutPut);
 			connection.setDoInput(true);
 			connection.setRequestMethod(method);
-			connection.setFollowRedirects(httpRequest.getFollowRedirects());
+			HttpURLConnection.setFollowRedirects(httpRequest.getFollowRedirects());
 
 			lock.lock();
 			connections.put(httpRequest, connection);
