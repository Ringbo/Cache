diff --git a/src/org/geometerplus/fbreader/network/INetworkLink.java b/src/org/geometerplus/fbreader/network/INetworkLink.java
index 5b093aa..076dc96 100644
--- a/src/org/geometerplus/fbreader/network/INetworkLink.java
+++ b/src/org/geometerplus/fbreader/network/INetworkLink.java
@@ -51,7 +51,7 @@
 	ZLNetworkRequest simpleSearchRequest(String pattern, NetworkOperationData data);
 	ZLNetworkRequest resume(NetworkOperationData data);
 
-	NetworkLibraryItem libraryItem();
+	NetworkCatalogItem libraryItem();
 	NetworkAuthenticationManager authenticationManager();
 
 	String rewriteUrl(String url, boolean isUrlExternal);
