diff --git a/enterprise/kernel/src/test/java/org/neo4j/kernel/enterprise/builtinprocs/ListQueriesProcedureTest.java b/enterprise/kernel/src/test/java/org/neo4j/kernel/enterprise/builtinprocs/ListQueriesProcedureTest.java
index 0505a85..98d96bb 100644
--- a/enterprise/kernel/src/test/java/org/neo4j/kernel/enterprise/builtinprocs/ListQueriesProcedureTest.java
+++ b/enterprise/kernel/src/test/java/org/neo4j/kernel/enterprise/builtinprocs/ListQueriesProcedureTest.java
@@ -492,7 +492,8 @@
             data = getQueryListing( query );
         }
         // then
-        assertThat( data, hasEntry( equalTo( "allocatedBytes" ), notNullValue() ) );
+        assertThat( data, hasEntry( equalTo( "allocatedBytes" ), anyOf( nullValue(), (Matcher) allOf(
+                instanceOf( Long.class ), greaterThan( 0L ) ) ) ) );
 
         // when
         db.execute( "call dbms.setConfigValue('" + track_query_allocation.name() + "', 'false')" );
@@ -510,7 +511,8 @@
             data = getQueryListing( query );
         }
         // then
-        assertThat( data, hasEntry( equalTo( "allocatedBytes" ), notNullValue() ) );
+        assertThat( data, hasEntry( equalTo( "allocatedBytes" ), anyOf( nullValue(), (Matcher) allOf(
+                instanceOf( Long.class ), greaterThan( 0L ) ) ) ) );
     }
 
     private void shouldListUsedIndexes( String label, String property ) throws Exception
