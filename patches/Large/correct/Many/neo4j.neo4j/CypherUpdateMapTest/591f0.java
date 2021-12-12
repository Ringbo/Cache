diff --git a/community/cypher/cypher/src/test/java/org/neo4j/cypher/internal/javacompat/CypherUpdateMapTest.java b/community/cypher/cypher/src/test/java/org/neo4j/cypher/internal/javacompat/CypherUpdateMapTest.java
index 0a29bde..d9a5954 100644
--- a/community/cypher/cypher/src/test/java/org/neo4j/cypher/internal/javacompat/CypherUpdateMapTest.java
+++ b/community/cypher/cypher/src/test/java/org/neo4j/cypher/internal/javacompat/CypherUpdateMapTest.java
@@ -52,7 +52,7 @@
         Node node1 = getNodeByIdInTx( 0 );
 
         assertThat( node1, inTxS( hasProperty( "key1" ).withValue( "value1" ) ) );
-        assertThat( node1, inTxS( hasProperty( "key2" ).withValue( 1234 ) ) );
+        assertThat( node1, inTxS( hasProperty( "key2" ).withValue( 1234L ) ) );
 
         db.execute(
                 "MATCH (n:Reference) SET n = {data} RETURN n",
@@ -65,7 +65,7 @@
 
         assertThat( node2, inTxS( not( hasProperty( "key1" ) ) ) );
         assertThat( node2, inTxS( not( hasProperty( "key2" ) ) ) );
-        assertThat( node2, inTxS( hasProperty( "key3" ).withValue(5678) ) );
+        assertThat( node2, inTxS( hasProperty( "key3" ).withValue(5678L) ) );
     }
 
     public <T> Matcher<? super T> inTxS( final Matcher<T> inner )
