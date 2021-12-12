diff --git a/querydsl-sql/src/main/java/com/mysema/query/sql/dml/SQLInsertClause.java b/querydsl-sql/src/main/java/com/mysema/query/sql/dml/SQLInsertClause.java
index f286925..1742488 100644
--- a/querydsl-sql/src/main/java/com/mysema/query/sql/dml/SQLInsertClause.java
+++ b/querydsl-sql/src/main/java/com/mysema/query/sql/dml/SQLInsertClause.java
@@ -237,10 +237,10 @@
         }
         PreparedStatement stmt = null;
         if (batches.isEmpty()) {
-            serializer.serializeForInsert(metadata, entity, columns, values, subQuery);
+            serializer.serializeInsert(metadata, entity, columns, values, subQuery);
             stmt = prepareStatementAndSetParameters(serializer, withKeys);
         } else {
-            serializer.serializeForInsert(metadata, entity, batches.get(0).getColumns(), batches
+            serializer.serializeInsert(metadata, entity, batches.get(0).getColumns(), batches
                     .get(0).getValues(), batches.get(0).getSubQuery());
             stmt = prepareStatementAndSetParameters(serializer, withKeys);
 
@@ -251,7 +251,7 @@
             for (int i = 1; i < batches.size(); i++) {
                 SQLInsertBatch batch = batches.get(i);
                 serializer = new SQLSerializer(configuration, true);
-                serializer.serializeForInsert(metadata, entity, batch.getColumns(),
+                serializer.serializeInsert(metadata, entity, batch.getColumns(),
                         batch.getValues(), batch.getSubQuery());
                 setParameters(stmt, serializer.getConstants(), serializer.getConstantPaths(),
                         metadata.getParams());
@@ -342,13 +342,13 @@
     public List<SQLBindings> getSQL() {
         if (batches.isEmpty()) {
             SQLSerializer serializer = new SQLSerializer(configuration, true);
-            serializer.serializeForInsert(metadata, entity, columns, values, subQuery);
+            serializer.serializeInsert(metadata, entity, columns, values, subQuery);
             return ImmutableList.of(createBindings(metadata, serializer));
         } else {
             ImmutableList.Builder<SQLBindings> builder = ImmutableList.builder();
             for (SQLInsertBatch batch : batches) {
                 SQLSerializer serializer = new SQLSerializer(configuration, true);
-                serializer.serializeForInsert(metadata, entity, batch.getColumns(), batch.getValues(), batch.getSubQuery());
+                serializer.serializeInsert(metadata, entity, batch.getColumns(), batch.getValues(), batch.getSubQuery());
                 builder.add(createBindings(metadata, serializer));
             }
             return builder.build();
@@ -408,7 +408,7 @@
     @Override
     public String toString() {
         SQLSerializer serializer = new SQLSerializer(configuration, true);
-        serializer.serializeForInsert(metadata, entity, columns, values, subQuery);
+        serializer.serializeInsert(metadata, entity, columns, values, subQuery);
         return serializer.toString();
     }
 
