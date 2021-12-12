diff --git a/community/values/src/main/java/org/neo4j/values/storable/DateValue.java b/community/values/src/main/java/org/neo4j/values/storable/DateValue.java
index 60d210f..bd7abd8 100644
--- a/community/values/src/main/java/org/neo4j/values/storable/DateValue.java
+++ b/community/values/src/main/java/org/neo4j/values/storable/DateValue.java
@@ -217,7 +217,7 @@
     @Override
     ZoneId getZoneId( Supplier<ZoneId> defaultZone )
     {
-        throw new IllegalArgumentException( String.format( "Cannot get the time zone of: %s", this ) );
+        throw new UnsupportedTemporalTypeException( String.format( "Cannot get the time zone of: %s", this ) );
     }
 
     @Override
