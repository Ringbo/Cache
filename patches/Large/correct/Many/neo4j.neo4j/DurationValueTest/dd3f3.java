diff --git a/community/values/src/test/java/org/neo4j/values/storable/DurationValueTest.java b/community/values/src/test/java/org/neo4j/values/storable/DurationValueTest.java
index 60c0559..8309c94 100644
--- a/community/values/src/test/java/org/neo4j/values/storable/DurationValueTest.java
+++ b/community/values/src/test/java/org/neo4j/values/storable/DurationValueTest.java
@@ -347,7 +347,7 @@
                 duration( 0, 0, 0, 500_000_000 ),
                 duration( 0, 0, 1, 0 ).mul( doubleValue( 0.5 ) ) );
         assertEquals( duration( 0, 0, 43200, 0 ), duration( 0, 1, 0, 0 ).mul( doubleValue( 0.5 ) ) );
-        assertEquals( duration( 0, 15, 18900, 0 ), duration( 1, 0, 0, 0 ).mul( doubleValue( 0.5 ) ) );
+        assertEquals( duration( 0, 15, 18873, 0 ), duration( 1, 0, 0, 0 ).mul( doubleValue( 0.5 ) ) );
     }
 
     @Test
@@ -357,7 +357,7 @@
                 duration( 0, 0, 0, 500_000_000 ),
                 duration( 0, 0, 1, 0 ).div( longValue( 2 ) ) );
         assertEquals( duration( 0, 0, 43200, 0 ), duration( 0, 1, 0, 0 ).div( longValue( 2 ) ) );
-        assertEquals( duration( 0, 15, 18900, 0 ), duration( 1, 0, 0, 0 ).div( longValue( 2 ) ) );
+        assertEquals( duration( 0, 15, 18873, 0 ), duration( 1, 0, 0, 0 ).div( longValue( 2 ) ) );
     }
 
     @Test
