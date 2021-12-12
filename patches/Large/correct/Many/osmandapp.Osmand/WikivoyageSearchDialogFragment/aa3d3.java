diff --git a/OsmAnd/src/net/osmand/plus/wikivoyage/search/WikivoyageSearchDialogFragment.java b/OsmAnd/src/net/osmand/plus/wikivoyage/search/WikivoyageSearchDialogFragment.java
index e435a2b..3f55994 100644
--- a/OsmAnd/src/net/osmand/plus/wikivoyage/search/WikivoyageSearchDialogFragment.java
+++ b/OsmAnd/src/net/osmand/plus/wikivoyage/search/WikivoyageSearchDialogFragment.java
@@ -116,7 +116,7 @@
 					} else if (item instanceof WikivoyageSearchHistoryItem) {
 						WikivoyageSearchHistoryItem historyItem = (WikivoyageSearchHistoryItem) item;
 						WikivoyageArticleDialogFragment
-								.showInstance(app, fm, historyItem.getCityId(), historyItem.getLang());
+								.showInstance(app, fm, historyItem.getArticleTitle(), historyItem.getLang());
 					}
 				}
 			}
