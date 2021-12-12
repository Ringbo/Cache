diff --git a/ksql-engine/src/test/java/io/confluent/ksql/structured/SchemaKTableTest.java b/ksql-engine/src/test/java/io/confluent/ksql/structured/SchemaKTableTest.java
index bb41e5a..b2c81c4 100644
--- a/ksql-engine/src/test/java/io/confluent/ksql/structured/SchemaKTableTest.java
+++ b/ksql-engine/src/test/java/io/confluent/ksql/structured/SchemaKTableTest.java
@@ -267,7 +267,7 @@
     final KGroupedTable mockKGroupedTable = mock(KGroupedTable.class);
     final Capture<KeyValueMapper> capturedKeySelector = Capture.newInstance();
     expect(mockKTable.filter(anyObject(Predicate.class))).andReturn(mockKTable);
-    expect(mockKTable.groupBy(capture(capturedKeySelector), mock(Grouped.class)))
+    expect(mockKTable.groupBy(capture(capturedKeySelector), anyObject(Grouped.class)))
         .andReturn(mockKGroupedTable);
     replay(mockKTable, mockKGroupedTable);
 
