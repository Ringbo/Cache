diff --git a/modules/apps/web-experience/journal/journal-content-search-web/src/main/java/com/liferay/journal/content/search/web/internal/upgrade/JournalContentSearchWebUpgrade.java b/modules/apps/web-experience/journal/journal-content-search-web/src/main/java/com/liferay/journal/content/search/web/internal/upgrade/JournalContentSearchWebUpgrade.java
index becc3ab..8ae533c 100644
--- a/modules/apps/web-experience/journal/journal-content-search-web/src/main/java/com/liferay/journal/content/search/web/internal/upgrade/JournalContentSearchWebUpgrade.java
+++ b/modules/apps/web-experience/journal/journal-content-search-web/src/main/java/com/liferay/journal/content/search/web/internal/upgrade/JournalContentSearchWebUpgrade.java
@@ -53,7 +53,7 @@
 
 		registry.register(
 			"com.liferay.journal.content.search.web", "1.0.0", "1.0.1",
-			new UpgradePortletId());
+			new DummyUpgradeStep());
 	}
 
 }
\ No newline at end of file
