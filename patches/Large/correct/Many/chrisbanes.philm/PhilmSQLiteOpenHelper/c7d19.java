diff --git a/app/src/main/java/app/philm/in/state/PhilmSQLiteOpenHelper.java b/app/src/main/java/app/philm/in/state/PhilmSQLiteOpenHelper.java
index 21dce45..49408b0 100644
--- a/app/src/main/java/app/philm/in/state/PhilmSQLiteOpenHelper.java
+++ b/app/src/main/java/app/philm/in/state/PhilmSQLiteOpenHelper.java
@@ -194,7 +194,7 @@
     void deleteAllPhilmMovies() {
         assetNotClosed();
         try {
-            cupboard().withDatabase(getWritableDatabase()).delete(PhilmMovie.class, null, null);
+            cupboard().withDatabase(getWritableDatabase()).delete(PhilmMovie.class, null);
         } catch (Exception e) {
             Crashlytics.logException(e);
         }
