diff --git a/community/server/src/functionaltest/java/org/neo4j/server/rest/IndexNodeFunctionalTest.java b/community/server/src/functionaltest/java/org/neo4j/server/rest/IndexNodeFunctionalTest.java
index 63efcc3..764b24a 100644
--- a/community/server/src/functionaltest/java/org/neo4j/server/rest/IndexNodeFunctionalTest.java
+++ b/community/server/src/functionaltest/java/org/neo4j/server/rest/IndexNodeFunctionalTest.java
@@ -115,7 +115,7 @@
         Map<String, Object> map = JsonHelper.jsonToMap( entity );
         assertNotNull( map.get( indexName ) );
 
-        assertEquals( 1, functionalTestHelper.removeAnyAutoIndex( map ).size() );
+        assertEquals( "Was: " + map + ", no-auto-index:" + functionalTestHelper.removeAnyAutoIndex( map ), 1, functionalTestHelper.removeAnyAutoIndex( map ).size() );
     }
 
     /**
