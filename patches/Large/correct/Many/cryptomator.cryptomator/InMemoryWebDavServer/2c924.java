diff --git a/main/frontend-webdav/src/test/java/org/cryptomator/frontend/webdav/InMemoryWebDavServer.java b/main/frontend-webdav/src/test/java/org/cryptomator/frontend/webdav/InMemoryWebDavServer.java
index 1797cb8..fdcc1c8 100644
--- a/main/frontend-webdav/src/test/java/org/cryptomator/frontend/webdav/InMemoryWebDavServer.java
+++ b/main/frontend-webdav/src/test/java/org/cryptomator/frontend/webdav/InMemoryWebDavServer.java
@@ -21,7 +21,7 @@
 	private static final CryptoFileSystemTestComponent CRYPTO_FS_COMP = DaggerCryptoFileSystemTestComponent.builder().cryptoEngineModule(new CryptoEngineTestModule()).build();
 
 	public static void main(String[] args) throws Exception {
-		new FileSystemWebDabServer(cryptoFileSystem()).run();
+		new FileSystemWebDavServer(cryptoFileSystem()).run();
 	}
 
 	private static FileSystem cryptoFileSystem() {
