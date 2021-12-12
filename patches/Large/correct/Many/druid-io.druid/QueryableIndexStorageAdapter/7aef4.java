diff --git a/processing/src/main/java/io/druid/segment/QueryableIndexStorageAdapter.java b/processing/src/main/java/io/druid/segment/QueryableIndexStorageAdapter.java
index 7eb83b7..9dcd136 100644
--- a/processing/src/main/java/io/druid/segment/QueryableIndexStorageAdapter.java
+++ b/processing/src/main/java/io/druid/segment/QueryableIndexStorageAdapter.java
@@ -508,7 +508,7 @@
                               if (multiValueRow.size() == 0) {
                                 return null;
                               } else if (multiValueRow.size() == 1) {
-                                return columnVals.lookupName(multiValueRow.get(1));
+                                return columnVals.lookupName(multiValueRow.get(0));
                               } else {
                                 final String[] strings = new String[multiValueRow.size()];
                                 for (int i = 0 ; i < multiValueRow.size() ; i++) {
