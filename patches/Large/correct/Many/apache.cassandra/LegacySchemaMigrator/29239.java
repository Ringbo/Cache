diff --git a/src/java/org/apache/cassandra/schema/LegacySchemaMigrator.java b/src/java/org/apache/cassandra/schema/LegacySchemaMigrator.java
index 05233bd..9502860 100644
--- a/src/java/org/apache/cassandra/schema/LegacySchemaMigrator.java
+++ b/src/java/org/apache/cassandra/schema/LegacySchemaMigrator.java
@@ -282,7 +282,7 @@
         AbstractType<?> rawComparator = TypeParser.parse(tableRow.getString("comparator"));
         AbstractType<?> subComparator = tableRow.has("subcomparator") ? TypeParser.parse(tableRow.getString("subcomparator")) : null;
 
-        boolean isSuper = "super".equals(tableRow.getString("type").toLowerCase());
+        boolean isSuper = "super".equals(tableRow.getString("type").toLowerCase(Locale.ENGLISH));
         boolean isCompound = rawComparator instanceof CompositeType || isSuper;
 
         /*
