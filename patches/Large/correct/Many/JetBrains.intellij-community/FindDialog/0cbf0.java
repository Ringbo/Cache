diff --git a/platform/lang-impl/src/com/intellij/find/impl/FindDialog.java b/platform/lang-impl/src/com/intellij/find/impl/FindDialog.java
index 2cba4c9..73c7cef 100644
--- a/platform/lang-impl/src/com/intellij/find/impl/FindDialog.java
+++ b/platform/lang-impl/src/com/intellij/find/impl/FindDialog.java
@@ -395,7 +395,7 @@
             ApplicationManager.getApplication().invokeLater(new Runnable() {
               @Override
               public void run() {
-                if (progressIndicatorWhenSearchStarted == myResultsPreviewSearchProgress) {
+                if (progressIndicatorWhenSearchStarted == myResultsPreviewSearchProgress && !myResultsPreviewSearchProgress.isCanceled()) {
                   int occurrences = resultsCount.get();
                   if (occurrences == 0) myResultsPreviewTable.getEmptyText().setText(UIBundle.message("message.nothingToShow"));
                   myContent.setTitleAt(RESULTS_PREVIEW_TAB_INDEX, PREVIEW_TITLE + " (" + (occurrences != ShowUsagesAction.USAGES_PAGE_SIZE ? Integer.valueOf(occurrences): occurrences + "+") +")");
