diff --git a/src/org/geometerplus/fbreader/network/opds/OPDSNetworkLink.java b/src/org/geometerplus/fbreader/network/opds/OPDSNetworkLink.java
index f80053d..3ac1993 100644
--- a/src/org/geometerplus/fbreader/network/opds/OPDSNetworkLink.java
+++ b/src/org/geometerplus/fbreader/network/opds/OPDSNetworkLink.java
@@ -142,7 +142,7 @@
 		return createNetworkData(data.ResumeURI, (OPDSCatalogItem.State) data);
 	}
 
-	public NetworkLibraryItem libraryItem() {
+	public NetworkCatalogItem libraryItem() {
 		TreeMap<Integer, String> urlMap = new TreeMap<Integer, String>();
 		urlMap.put(NetworkCatalogItem.URL_CATALOG, getLink(URL_MAIN));
 		return new OPDSCatalogItem(this, getTitle(), getSummary(), getIcon(), urlMap, myExtraData);
