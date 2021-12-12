diff --git a/app/src/main/java/acr/browser/lightning/database/downloads/DownloadItem.java b/app/src/main/java/acr/browser/lightning/database/downloads/DownloadItem.java
index f87e4a1..b45abb6 100644
--- a/app/src/main/java/acr/browser/lightning/database/downloads/DownloadItem.java
+++ b/app/src/main/java/acr/browser/lightning/database/downloads/DownloadItem.java
@@ -62,7 +62,7 @@
 
     @Override
     public int compareTo(@NonNull DownloadItem another) {
-        int compare = this.mTitle.compareTo(another.mTitle);
+        int compare = this.mTitle.compareToIgnoreCase(another.mTitle);
         if (compare == 0) {
             return this.mUrl.compareTo(another.mUrl);
         }
