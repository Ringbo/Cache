diff --git a/h2o-core/src/main/java/water/parser/ParseDataset2.java b/h2o-core/src/main/java/water/parser/ParseDataset2.java
index 4e5d51a..5fd0b6d 100644
--- a/h2o-core/src/main/java/water/parser/ParseDataset2.java
+++ b/h2o-core/src/main/java/water/parser/ParseDataset2.java
@@ -766,7 +766,7 @@
     private void enumCol2StrCol(int colIdx) {
       //build local value2key map for enums
       Enum enums = _enums[colIdx].deepCopy();
-      ValueString emap[] = new ValueString[enums.maxId()];
+      ValueString emap[] = new ValueString[enums.size()];
       ValueString keys[] = enums._map.keySet().toArray(new ValueString[enums.size()]);
       for (ValueString str:keys)
         // adjust for enum ids using 1-based indexing
