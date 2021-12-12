diff --git a/WordPress/src/main/java/org/wordpress/android/models/Note.java b/WordPress/src/main/java/org/wordpress/android/models/Note.java
index 2e9109a..9ee4a4c 100644
--- a/WordPress/src/main/java/org/wordpress/android/models/Note.java
+++ b/WordPress/src/main/java/org/wordpress/android/models/Note.java
@@ -69,7 +69,7 @@
      * Simperium method @see Diffable
      */
     @Override
-    public JSONObject getDiffableValue() {
+    synchronized public JSONObject getDiffableValue() {
         return mNoteJSON;
     }
 
