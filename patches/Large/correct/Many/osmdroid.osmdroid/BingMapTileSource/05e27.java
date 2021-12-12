diff --git a/osmdroid-third-party/src/org/osmdroid/tileprovider/tilesource/bing/BingMapTileSource.java b/osmdroid-third-party/src/org/osmdroid/tileprovider/tilesource/bing/BingMapTileSource.java
index 2db1c2a..5e0cfb8 100644
--- a/osmdroid-third-party/src/org/osmdroid/tileprovider/tilesource/bing/BingMapTileSource.java
+++ b/osmdroid-third-party/src/org/osmdroid/tileprovider/tilesource/bing/BingMapTileSource.java
@@ -86,7 +86,7 @@
 		m_style = a_style;
 		m_locale = a_locale;
 		if(m_locale==null) {
-			m_locale=Locale.getDefault().getISO3Language()+"-"+Locale.getDefault().getISO3Language();
+			m_locale=Locale.getDefault().getLanguage()+"-"+Locale.getDefault().getCountry();
 		}
 		updateBaseUrl();
 	}
