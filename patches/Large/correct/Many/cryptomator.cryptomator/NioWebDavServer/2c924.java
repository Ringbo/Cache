diff --git a/main/frontend-webdav/src/test/java/org/cryptomator/frontend/webdav/NioWebDavServer.java b/main/frontend-webdav/src/test/java/org/cryptomator/frontend/webdav/NioWebDavServer.java
index f22b771..aa9ee9c 100644
--- a/main/frontend-webdav/src/test/java/org/cryptomator/frontend/webdav/NioWebDavServer.java
+++ b/main/frontend-webdav/src/test/java/org/cryptomator/frontend/webdav/NioWebDavServer.java
@@ -26,7 +26,7 @@
 	private static final String PATH_TO_SERVE_PROPERTY = "pathToServe";
 
 	public static void main(String[] args) throws Exception {
-		new FileSystemWebDabServer(nioFileSystem()).run();
+		new FileSystemWebDavServer(nioFileSystem()).run();
 	}
 
 	private static FileSystem nioFileSystem() {
