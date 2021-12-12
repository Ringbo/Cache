diff --git a/requery-android/src/main/java/io/requery/android/sqlcipher/SqlCipherConnection.java b/requery-android/src/main/java/io/requery/android/sqlcipher/SqlCipherConnection.java
index 63dbe51..064ffa6 100644
--- a/requery-android/src/main/java/io/requery/android/sqlcipher/SqlCipherConnection.java
+++ b/requery-android/src/main/java/io/requery/android/sqlcipher/SqlCipherConnection.java
@@ -40,7 +40,7 @@
     private final SqlCipherMetaData metaData;
     private boolean enteredTransaction;
 
-    public SqlCipherConnection(SQLiteDatabase db) {
+    SqlCipherConnection(SQLiteDatabase db) {
         if(db == null) {
             throw new IllegalArgumentException("null db");
         }
