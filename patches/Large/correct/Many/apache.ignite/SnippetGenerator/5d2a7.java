diff --git a/modules/schema-load/src/main/java/org/apache/ignite/schema/generator/SnippetGenerator.java b/modules/schema-load/src/main/java/org/apache/ignite/schema/generator/SnippetGenerator.java
index e54c019..4abd5a6 100644
--- a/modules/schema-load/src/main/java/org/apache/ignite/schema/generator/SnippetGenerator.java
+++ b/modules/schema-load/src/main/java/org/apache/ignite/schema/generator/SnippetGenerator.java
@@ -113,7 +113,7 @@
 
             src.add("// Key fields for " + tbl + ".");
             src.add((first ? "Collection<CacheTypeFieldMetadata> " : "") + "keys = new ArrayList<>();");
-            addFields(src, "keys", pojo.valueFields(includeKeys));
+            addFields(src, "keys", pojo.keyFields());
             src.add("type.setKeyFields(keys);");
             src.add("");
 
