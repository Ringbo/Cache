diff --git a/community/values/src/test/java/org/neo4j/values/storable/UTF8StringValueTest.java b/community/values/src/test/java/org/neo4j/values/storable/UTF8StringValueTest.java
index d3ab258..46bd2fc 100644
--- a/community/values/src/test/java/org/neo4j/values/storable/UTF8StringValueTest.java
+++ b/community/values/src/test/java/org/neo4j/values/storable/UTF8StringValueTest.java
@@ -112,7 +112,7 @@
         }
     }
 
-    public static void assertCompareTo( String string1, String string2 )
+    static void assertCompareTo( String string1, String string2 )
     {
         TextValue textValue1 = stringValue( string1 );
         TextValue textValue2 = stringValue( string2 );
@@ -177,7 +177,7 @@
         TextValue substring = value.substring( 8, 5 );
 
         // Then
-        assertThat( substring, equalTo( StringValue.EMTPY ) );
+        assertThat( substring, equalTo( StringValue.EMPTY ) );
     }
 
     @Test
