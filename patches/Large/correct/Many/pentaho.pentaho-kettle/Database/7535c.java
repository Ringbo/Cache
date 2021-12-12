diff --git a/src/be/ibridge/kettle/core/database/Database.java b/src/be/ibridge/kettle/core/database/Database.java
index d1ff031..bfb14f5 100644
--- a/src/be/ibridge/kettle/core/database/Database.java
+++ b/src/be/ibridge/kettle/core/database/Database.java
@@ -2524,7 +2524,7 @@
                     {
                         // set the length for Oracle "RAW" or "LONGRAW" data types
                         valtype = Value.VALUE_TYPE_STRING;
-                        length = rm.getPrecision(i);
+                        length = rm.getColumnDisplaySize(i);
                     }
                     else
                     {
