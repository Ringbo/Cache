diff --git a/community/kernel/src/test/java/org/neo4j/metatest/TestJavaTestDocsGenerator.java b/community/kernel/src/test/java/org/neo4j/metatest/TestJavaTestDocsGenerator.java
index 8375f34..249c416 100644
--- a/community/kernel/src/test/java/org/neo4j/metatest/TestJavaTestDocsGenerator.java
+++ b/community/kernel/src/test/java/org/neo4j/metatest/TestJavaTestDocsGenerator.java
@@ -60,7 +60,7 @@
         data.get();
         gen.get().setGraph( graphdb );
         assertNotNull(data.get().get( "I" ));
-        gen.get().document();
+        gen.get().document("target/testdocs", "testsection");
     }
 
     @Override
