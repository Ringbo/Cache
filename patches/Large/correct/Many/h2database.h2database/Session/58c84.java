diff --git a/h2/src/main/org/h2/engine/Session.java b/h2/src/main/org/h2/engine/Session.java
index 432080b..97e91d4 100644
--- a/h2/src/main/org/h2/engine/Session.java
+++ b/h2/src/main/org/h2/engine/Session.java
@@ -1704,15 +1704,13 @@
         if (v.getType() != Value.CLOB && v.getType() != Value.BLOB) {
             return;
         }
-        if (v.getTableId() == LobStorageFrontend.TABLE_RESULT) {
+        if (v.getTableId() == LobStorageFrontend.TABLE_RESULT
+                || v.getTableId() == LobStorageFrontend.TABLE_TEMP) {
             if (temporaryResultLobs == null) {
                 temporaryResultLobs = new LinkedList<>();
             }
             temporaryResultLobs.add(new TimeoutValue(v));
         } else {
-            // Things with tableId == LobStorageFrontend.TABLE_TEMP
-            // end up here because we don't need to keep them alive to cater
-            // for dodgy clients.
             if (temporaryLobs == null) {
                 temporaryLobs = new ArrayList<>();
             }
