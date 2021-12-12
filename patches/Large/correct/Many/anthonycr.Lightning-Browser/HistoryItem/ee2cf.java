diff --git a/app/src/main/java/acr/browser/lightning/database/HistoryItem.java b/app/src/main/java/acr/browser/lightning/database/HistoryItem.java
index b921b2a..7913864 100644
--- a/app/src/main/java/acr/browser/lightning/database/HistoryItem.java
+++ b/app/src/main/java/acr/browser/lightning/database/HistoryItem.java
@@ -112,7 +112,7 @@
 
     @Override
     public int compareTo(@NonNull HistoryItem another) {
-        int compare = this.mTitle.compareTo(another.mTitle);
+        int compare = this.mTitle.compareToIgnoreCase(another.mTitle);
         if (compare == 0) {
             return this.mUrl.compareTo(another.mUrl);
         }
