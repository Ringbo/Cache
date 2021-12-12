diff --git a/community/server/src/functionaltest/java/org/neo4j/server/rest/IndexRelationshipFunctionalTest.java b/community/server/src/functionaltest/java/org/neo4j/server/rest/IndexRelationshipFunctionalTest.java
index c61fa2f..4a03e61 100644
--- a/community/server/src/functionaltest/java/org/neo4j/server/rest/IndexRelationshipFunctionalTest.java
+++ b/community/server/src/functionaltest/java/org/neo4j/server/rest/IndexRelationshipFunctionalTest.java
@@ -117,7 +117,7 @@
         JaxRsResponse response = httpPostIndexRelationshipRoot( JsonHelper.createJsonFrom( indexSpecification ) );
         assertEquals( 201, response.getStatus() );
         assertNotNull( response.getHeaders().get( "Location" ).get( 0 ) );
-        assertEquals( helper.getRelationshipIndexes().length, 1 );
+        assertEquals( 1, helper.getRelationshipIndexes().length);
         assertNotNull( helper.getRelationshipIndex( indexName ) );
     }
 
