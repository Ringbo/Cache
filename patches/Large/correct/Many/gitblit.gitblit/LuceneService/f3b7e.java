diff --git a/src/main/java/com/gitblit/service/LuceneService.java b/src/main/java/com/gitblit/service/LuceneService.java
index 798edb0..285ea8d 100644
--- a/src/main/java/com/gitblit/service/LuceneService.java
+++ b/src/main/java/com/gitblit/service/LuceneService.java
@@ -615,7 +615,7 @@
 			}
 
 			// finished
-			reader.release();
+			reader.close();
 
 			// commit all changes and reset the searcher
 			config.setInt(CONF_INDEX, null, CONF_VERSION, INDEX_VERSION);
