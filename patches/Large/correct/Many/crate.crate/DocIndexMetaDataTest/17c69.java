diff --git a/sql/src/test/java/io/crate/metadata/doc/DocIndexMetaDataTest.java b/sql/src/test/java/io/crate/metadata/doc/DocIndexMetaDataTest.java
index 3a6095f..d94a26e 100644
--- a/sql/src/test/java/io/crate/metadata/doc/DocIndexMetaDataTest.java
+++ b/sql/src/test/java/io/crate/metadata/doc/DocIndexMetaDataTest.java
@@ -149,7 +149,7 @@
         IndexMetaData metaData = getIndexMetaData("test1", builder);
         DocIndexMetaData md = newMeta(metaData, "test1");
         assertThat(md.columns().size(), is(4));
-        assertThat(md.references().size(), is(13));
+        assertThat(md.references().size(), is(15));
         assertThat(md.references().get(new ColumnIdent("implicit_dynamic")).objectType(), is(ReferenceInfo.ObjectType.DYNAMIC));
         assertThat(md.references().get(new ColumnIdent("explicit_dynamic")).objectType(), is(ReferenceInfo.ObjectType.DYNAMIC));
         assertThat(md.references().get(new ColumnIdent("ignored")).objectType(), is(ReferenceInfo.ObjectType.IGNORED));
@@ -209,7 +209,7 @@
         DocIndexMetaData md = newMeta(metaData, "test1");
 
         assertEquals(6, md.columns().size());
-        assertEquals(12, md.references().size());
+        assertEquals(14, md.references().size());
 
         ImmutableList<ReferenceInfo> columns = ImmutableList.copyOf(md.columns());
 
@@ -233,7 +233,7 @@
 
         assertThat(fqns, Matchers.<List<String>>is(
                 ImmutableList.of("content", "datum", "id", "nested", "nested.inner_nested",
-                        "person", "person.birthday", "person.first_name", "title", "_id", "_version", "_score")));
+                        "person", "person.birthday", "person.first_name", "title", "_id", "_version", "_score", "_uid", "_source")));
 
     }
 
