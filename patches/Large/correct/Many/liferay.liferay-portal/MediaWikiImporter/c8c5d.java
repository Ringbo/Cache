diff --git a/modules/apps/collaboration/wiki/wiki-service/src/main/java/com/liferay/wiki/importer/impl/mediawiki/MediaWikiImporter.java b/modules/apps/collaboration/wiki/wiki-service/src/main/java/com/liferay/wiki/importer/impl/mediawiki/MediaWikiImporter.java
index dbc0446..96d4a96 100644
--- a/modules/apps/collaboration/wiki/wiki-service/src/main/java/com/liferay/wiki/importer/impl/mediawiki/MediaWikiImporter.java
+++ b/modules/apps/collaboration/wiki/wiki-service/src/main/java/com/liferay/wiki/importer/impl/mediawiki/MediaWikiImporter.java
@@ -441,7 +441,7 @@
 					}
 					catch (IOException ioe) {
 						if (_log.isWarnEnabled()) {
-							_log.error(ioe, ioe);
+							_log.warn(ioe, ioe);
 						}
 					}
 				}
