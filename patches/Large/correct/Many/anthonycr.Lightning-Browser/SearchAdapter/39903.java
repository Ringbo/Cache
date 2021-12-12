diff --git a/app/src/main/java/acr/browser/lightning/object/SearchAdapter.java b/app/src/main/java/acr/browser/lightning/object/SearchAdapter.java
index 73d2176..ce9cd78 100644
--- a/app/src/main/java/acr/browser/lightning/object/SearchAdapter.java
+++ b/app/src/main/java/acr/browser/lightning/object/SearchAdapter.java
@@ -232,7 +232,7 @@
                 }
 
             }
-            if (mDatabaseHandler == null) {
+            if (mDatabaseHandler == null || mDatabaseHandler.isClosed()) {
                 mDatabaseHandler = HistoryDatabase.getInstance(mContext.getApplicationContext());
             }
             List<HistoryItem> historyList = mDatabaseHandler.findItemsContaining(constraint.toString());
