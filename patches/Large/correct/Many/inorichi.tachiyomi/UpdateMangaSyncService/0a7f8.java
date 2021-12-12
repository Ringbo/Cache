diff --git a/app/src/main/java/eu/kanade/mangafeed/data/sync/UpdateMangaSyncService.java b/app/src/main/java/eu/kanade/mangafeed/data/sync/UpdateMangaSyncService.java
index cd0f6da..4733ee4 100644
--- a/app/src/main/java/eu/kanade/mangafeed/data/sync/UpdateMangaSyncService.java
+++ b/app/src/main/java/eu/kanade/mangafeed/data/sync/UpdateMangaSyncService.java
@@ -60,7 +60,7 @@
     private void updateLastChapterRead(MangaSync mangaSync, int startId) {
         MangaSyncService sync = syncManager.getSyncService(mangaSync.sync_id);
 
-        subscriptions.add(Observable.fromCallable(() -> sync.update(mangaSync))
+        subscriptions.add(Observable.defer(() -> sync.update(mangaSync))
                 .flatMap(response -> db.insertMangaSync(mangaSync).createObservable())
                 .subscribeOn(Schedulers.io())
                 .observeOn(AndroidSchedulers.mainThread())
