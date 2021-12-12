diff --git a/sql/src/test/java/io/crate/metadata/ReferenceInfosITest.java b/sql/src/test/java/io/crate/metadata/ReferenceInfosITest.java
index b8369d0..229f80d 100644
--- a/sql/src/test/java/io/crate/metadata/ReferenceInfosITest.java
+++ b/sql/src/test/java/io/crate/metadata/ReferenceInfosITest.java
@@ -86,7 +86,7 @@
         IndicesAliasesRequest request = new IndicesAliasesRequest();
         request.addAlias("entsafter", "terminator");
         client().admin().indices().aliases(request).actionGet();
-        ensureGreen();
+        ensureYellow();
 
         DocTableInfo terminatorTable = (DocTableInfo) schemas.getTableInfo(new TableIdent(null, "terminator"));
         DocTableInfo entsafterTable = (DocTableInfo) schemas.getTableInfo(new TableIdent(null, "entsafter"));
