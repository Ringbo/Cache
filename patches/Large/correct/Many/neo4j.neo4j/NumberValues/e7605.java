diff --git a/community/values/src/main/java/org/neo4j/values/storable/NumberValues.java b/community/values/src/main/java/org/neo4j/values/storable/NumberValues.java
index 8bc67c3..5b6958c 100644
--- a/community/values/src/main/java/org/neo4j/values/storable/NumberValues.java
+++ b/community/values/src/main/java/org/neo4j/values/storable/NumberValues.java
@@ -173,7 +173,7 @@
         {
             if ( fpn < 0.0 )
             {
-                if ( (NON_DOUBLE_LONG & in) == NON_DOUBLE_LONG ) // the high order bits are only sign bits
+                if ( (NON_DOUBLE_LONG & in) == 0L ) // the high order bits are only sign bits
                 { // no loss of precision if converting the long to a double, so it's safe to compare as double
                     return fpn == in;
                 }
@@ -191,7 +191,7 @@
         {
             if ( !(fpn < 0.0) )
             {
-                if ( (NON_DOUBLE_LONG & in) == 0 ) // the high order bits are only sign bits
+                if ( (NON_DOUBLE_LONG & in) == 0L ) // the high order bits are only sign bits
                 { // no loss of precision if converting the long to a double, so it's safe to compare as double
                     return fpn == in;
                 }
@@ -211,7 +211,7 @@
     // Tested by PropertyValueComparisonTest
     public static int compareDoubleAgainstLong( double lhs, long rhs )
     {
-        if ( (NON_DOUBLE_LONG & rhs) != NON_DOUBLE_LONG )
+        if ( (NON_DOUBLE_LONG & rhs) != 0L )
         {
             if ( Double.isNaN( lhs ) )
             {
