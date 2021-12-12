diff --git a/portal-impl/src/com/liferay/portal/lucene/LuceneIndexer.java b/portal-impl/src/com/liferay/portal/lucene/LuceneIndexer.java
index 6279ff5..d201a33 100644
--- a/portal-impl/src/com/liferay/portal/lucene/LuceneIndexer.java
+++ b/portal-impl/src/com/liferay/portal/lucene/LuceneIndexer.java
@@ -101,7 +101,7 @@
 			LuceneUtil.write(writer);
 		}
 		catch (IOException ioe) {
-			_log.error(ioe.getMessage());
+			_log.error(ioe.getMessage(), ioe);
 		}
 
 		String[] indexIds = new String[] {String.valueOf(_companyId)};
@@ -151,7 +151,7 @@
 			}
 		}
 		catch (Exception e) {
-			_log.error(e);
+			_log.error("Error encountered while re-indexing", e);
 
 			if (_log.isInfoEnabled()) {
 				_log.info("Reindexing Lucene failed");
