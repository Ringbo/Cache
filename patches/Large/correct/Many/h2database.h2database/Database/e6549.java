diff --git a/h2/src/main/org/h2/engine/Database.java b/h2/src/main/org/h2/engine/Database.java
index e685015..43d1820 100644
--- a/h2/src/main/org/h2/engine/Database.java
+++ b/h2/src/main/org/h2/engine/Database.java
@@ -789,7 +789,7 @@
         Storage storage = (Storage) storageMap.get(id);
         if (storage != null) {
             if (SysProperties.CHECK && storage.getDiskFile() != file) {
-                Message.throwInternalError();
+                Message.throwInternalError(storage.getDiskFile() + " != " + file);
             }
         } else {
             storage = new Storage(this, file, null, id);
