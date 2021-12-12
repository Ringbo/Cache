diff --git a/framework/src/com/phonegap/NetworkManager.java b/framework/src/com/phonegap/NetworkManager.java
index c2b756b..62140f3 100755
--- a/framework/src/com/phonegap/NetworkManager.java
+++ b/framework/src/com/phonegap/NetworkManager.java
@@ -275,7 +275,7 @@
 	public int isReachable(String uri, boolean isIpAddress) {
 		int reachable = NOT_REACHABLE;
 		
-		if (uri.indexOf("http://") == -1) {
+		if (uri.indexOf("http://") == -1 && uri.indexOf("https://") == -1) {
 			uri = "http://" + uri;
 		}
 
