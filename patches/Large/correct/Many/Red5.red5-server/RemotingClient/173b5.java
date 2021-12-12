diff --git a/src/main/java/org/red5/server/net/remoting/RemotingClient.java b/src/main/java/org/red5/server/net/remoting/RemotingClient.java
index 17f8f0b..7ada526 100644
--- a/src/main/java/org/red5/server/net/remoting/RemotingClient.java
+++ b/src/main/java/org/red5/server/net/remoting/RemotingClient.java
@@ -101,7 +101,7 @@
 	 * @param timeout Timeout for one request in milliseconds
 	 */
 	public RemotingClient(String url, int timeout) {
-		client = HttpConnectionUtil.getSoTimeoutClient(timeout);
+		client = HttpConnectionUtil.getClient(timeout);
 		this.url = url;
 		log.debug("RemotingClient created  - url: {} timeout: {}", url, timeout);
 	}
