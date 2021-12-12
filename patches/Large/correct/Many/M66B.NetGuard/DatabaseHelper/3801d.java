diff --git a/app/src/main/java/eu/faircode/netguard/DatabaseHelper.java b/app/src/main/java/eu/faircode/netguard/DatabaseHelper.java
index 85ff6a8..26515b0 100644
--- a/app/src/main/java/eu/faircode/netguard/DatabaseHelper.java
+++ b/app/src/main/java/eu/faircode/netguard/DatabaseHelper.java
@@ -126,7 +126,7 @@
             if (oldVersion < 7) {
                 db.execSQL("DROP TABLE log");
                 createTableLog(db);
-                oldVersion = 7;
+                oldVersion = 9;
             }
             if (oldVersion < 8) {
                 db.execSQL("ALTER TABLE log ADD COLUMN data TEXT");
