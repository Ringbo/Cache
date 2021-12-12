diff --git a/community/values/src/main/java/org/neo4j/values/storable/TemporalValue.java b/community/values/src/main/java/org/neo4j/values/storable/TemporalValue.java
index f809b14..06be826 100644
--- a/community/values/src/main/java/org/neo4j/values/storable/TemporalValue.java
+++ b/community/values/src/main/java/org/neo4j/values/storable/TemporalValue.java
@@ -263,7 +263,7 @@
             }
             else
             {
-                throw new UnsupportedTemporalUnitException( "Should only attach offsets to local times, not zone ids." );
+                throw new IllegalStateException( "Should only attach offsets to local times, not zone ids." );
             }
         }
     }
@@ -535,7 +535,7 @@
             {
                 return supportsTime();
             }
-            throw new UnsupportedTemporalUnitException( "Fields should be either date based or time based" );
+            throw new IllegalStateException( "Fields should be either date based or time based" );
         }
 
         protected abstract boolean supportsDate();
@@ -869,7 +869,7 @@
             }
             else
             {
-                throw new UnsupportedTemporalUnitException( "This method should not be used for any fields the DateBuilder or TimeBuilder can't handle" );
+                throw new IllegalStateException( "This method should not be used for any fields the DateBuilder or TimeBuilder can't handle" );
             }
             return this;
         }
@@ -1014,7 +1014,7 @@
                 time = assignment( field, time, value );
                 break;
             default:
-                throw new UnsupportedTemporalUnitException( "Not a time field: " + field );
+                throw new IllegalStateException( "Not a time field: " + field );
             }
         }
 
@@ -1066,7 +1066,7 @@
                 date = assignment( field, date, value );
                 return this;
             default:
-                throw new UnsupportedTemporalUnitException( "Not a date field: " + field );
+                throw new IllegalStateException( "Not a date field: " + field );
             }
         }
 
@@ -1431,7 +1431,7 @@
         {
             return func.get();
         }
-        catch ( DateTimeParseException e )
+        catch ( DateTimeException e )
         {
             throw new InvalidValuesArgumentException( e.getMessage(), e );
         }
