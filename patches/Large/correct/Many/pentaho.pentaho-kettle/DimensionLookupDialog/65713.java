diff --git a/src/be/ibridge/kettle/trans/step/dimensionlookup/DimensionLookupDialog.java b/src/be/ibridge/kettle/trans/step/dimensionlookup/DimensionLookupDialog.java
index 54e9258..30e45a6 100644
--- a/src/be/ibridge/kettle/trans/step/dimensionlookup/DimensionLookupDialog.java
+++ b/src/be/ibridge/kettle/trans/step/dimensionlookup/DimensionLookupDialog.java
@@ -1169,7 +1169,7 @@
                         {
                             public boolean tableItemInserted(TableItem tableItem, Value v)
                             {
-                                int idx = wUpIns.indexOfString(v.getName(), 2);
+                                int idx = wKey.indexOfString(v.getName(), 2);
                                 if ( idx<0 &&
                                     !v.getName().equalsIgnoreCase(wTk.getText()) &&
                                     !v.getName().equalsIgnoreCase(wVersion.getText()) &&
