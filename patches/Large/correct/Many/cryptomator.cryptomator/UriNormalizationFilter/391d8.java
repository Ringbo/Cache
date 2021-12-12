diff --git a/main/frontend-webdav/src/main/java/org/cryptomator/frontend/webdav/filters/UriNormalizationFilter.java b/main/frontend-webdav/src/main/java/org/cryptomator/frontend/webdav/filters/UriNormalizationFilter.java
index a944bfa..7853c16 100644
--- a/main/frontend-webdav/src/main/java/org/cryptomator/frontend/webdav/filters/UriNormalizationFilter.java
+++ b/main/frontend-webdav/src/main/java/org/cryptomator/frontend/webdav/filters/UriNormalizationFilter.java
@@ -128,7 +128,7 @@
 		@Override
 		public String getHeader(String name) {
 			if ((METHOD_MOVE.equalsIgnoreCase(getMethod()) || METHOD_COPY.equalsIgnoreCase(getMethod())) && HEADER_DESTINATION.equalsIgnoreCase(name)) {
-				final String uri = URI.create(super.getHeader(name)).getPath();
+				final String uri = URI.create(super.getHeader(name)).getRawPath();
 				return bestGuess(uri);
 			} else {
 				return super.getHeader(name);
