diff --git a/h2/src/main/org/h2/mvstore/db/MVPlainTempResult.java b/h2/src/main/org/h2/mvstore/db/MVPlainTempResult.java
index 7eb04ac..410847b 100644
--- a/h2/src/main/org/h2/mvstore/db/MVPlainTempResult.java
+++ b/h2/src/main/org/h2/mvstore/db/MVPlainTempResult.java
@@ -62,14 +62,14 @@
         super(database, expressions.length, visibleColumnCount);
         ValueDataType valueType = new ValueDataType(database, new int[columnCount]);
         Builder<Long, ValueRow> builder = new MVMap.Builder<Long, ValueRow>()
-                                                .valueType(valueType).singleWriter();
+                                                .valueType(valueType);
         map = store.openMap("tmp", builder);
     }
 
     @Override
     public int addRow(Value[] values) {
         assert parent == null;
-        map.append(counter++, ValueRow.get(values));
+        map.put(counter++, ValueRow.get(values));
         return ++rowCount;
     }
 
