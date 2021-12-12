diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/database/ActivityDatabaseHandler.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/database/ActivityDatabaseHandler.java
index 3341548..ded7db2 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/database/ActivityDatabaseHandler.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/database/ActivityDatabaseHandler.java
@@ -140,7 +140,7 @@
     }
 
     @Override
-    public void addGBActivitySamples(GBActivitySample[] activitySamples) {
+    public void addGBActivitySamples(ActivitySample[] activitySamples) {
         try (SQLiteDatabase db = this.getWritableDatabase()) {
 
             String sql = "INSERT INTO " + TABLE_GBACTIVITYSAMPLES + " (" + KEY_TIMESTAMP + "," +
@@ -149,7 +149,7 @@
             SQLiteStatement statement = db.compileStatement(sql);
             db.beginTransaction();
 
-            for (GBActivitySample activitySample : activitySamples) {
+            for (ActivitySample activitySample : activitySamples) {
                 statement.clearBindings();
                 statement.bindLong(1, activitySample.getTimestamp());
                 statement.bindLong(2, activitySample.getProvider().getID());
