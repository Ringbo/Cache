diff --git a/src/org/traccar/database/QueryBuilder.java b/src/org/traccar/database/QueryBuilder.java
index 2c7a3a3..ff26221 100644
--- a/src/org/traccar/database/QueryBuilder.java
+++ b/src/org/traccar/database/QueryBuilder.java
@@ -277,7 +277,7 @@
                         // Check if column exists
                         boolean column = false;
                         for (int i = 1; i <= resultMetaData.getColumnCount(); i++) {
-                            if (name.equalsIgnoreCase(resultMetaData.getColumnName(i))) {
+                            if (name.equalsIgnoreCase(resultMetaData.getColumnLabel(i))) {
                                 column = true;
                                 break;
                             }
