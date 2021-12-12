diff --git a/sql/src/test/java/io/crate/metadata/doc/DocIndexMetaDataTest.java b/sql/src/test/java/io/crate/metadata/doc/DocIndexMetaDataTest.java
index 261a9cd..61722ec 100644
--- a/sql/src/test/java/io/crate/metadata/doc/DocIndexMetaDataTest.java
+++ b/sql/src/test/java/io/crate/metadata/doc/DocIndexMetaDataTest.java
@@ -121,7 +121,7 @@
         DocIndexMetaData md = newMeta(metaData, "test1");
 
         assertEquals(6, md.columns().size());
-        assertEquals(9, md.references().size());
+        assertEquals(12, md.references().size());
 
         ImmutableList<ReferenceInfo> columns = ImmutableList.copyOf(md.columns());
 
@@ -145,7 +145,7 @@
 
         assertThat(fqns, Matchers.<List<String>>is(
                 ImmutableList.of("content", "datum", "id", "nested", "nested.inner_nested",
-                        "person", "person.birthday", "person.first_name", "title")));
+                        "person", "person.birthday", "person.first_name", "title", "_id", "_version", "_score")));
 
     }
 
