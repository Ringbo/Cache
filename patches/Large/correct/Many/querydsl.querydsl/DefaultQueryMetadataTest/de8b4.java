diff --git a/querydsl-core/src/test/java/com/mysema/query/DefaultQueryMetadataTest.java b/querydsl-core/src/test/java/com/mysema/query/DefaultQueryMetadataTest.java
index 0552b96..faeead0 100644
--- a/querydsl-core/src/test/java/com/mysema/query/DefaultQueryMetadataTest.java
+++ b/querydsl-core/src/test/java/com/mysema/query/DefaultQueryMetadataTest.java
@@ -43,12 +43,12 @@
     
     @Test
     public void AddHaving_With_Null() {
-        metadata.addWhere((Predicate)null);
+        metadata.addHaving((Predicate)null);
     }
     
     @Test
     public void AddHaving_With_BooleanBuilder() {
-        metadata.addWhere(new BooleanBuilder());
+        metadata.addHaving(new BooleanBuilder());
     }
     
     
