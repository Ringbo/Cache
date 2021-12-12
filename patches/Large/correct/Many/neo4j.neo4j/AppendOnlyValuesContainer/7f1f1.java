diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/api/state/AppendOnlyValuesContainer.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/api/state/AppendOnlyValuesContainer.java
index f4ddbfe..0d1d7e7 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/api/state/AppendOnlyValuesContainer.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/api/state/AppendOnlyValuesContainer.java
@@ -118,7 +118,7 @@
 {
     private static final int CHUNK_SIZE = (int) ByteUnit.kibiBytes( 512 );
     private static final int REMOVED = 0xFF;
-    private static final int ENCODED_ZONE_ID = 0x8000_0000;
+    private static final int ENCODED_ZONE_ID = 1;
 
     private final int chunkSize;
     private final List<ByteBuffer> chunks = new ArrayList<>();
@@ -552,10 +552,10 @@
     {
         if ( (ENCODED_ZONE_ID & z) != 0 )
         {
-            final String zoneId = TimeZones.map( (short) z );
+            final String zoneId = TimeZones.map( (short) (z >> 1) );
             return ZoneId.of( zoneId );
         }
-        return ZoneOffset.ofTotalSeconds( z );
+        return ZoneOffset.ofTotalSeconds( z >> 1 );
     }
 
     private static ArrayValue readDateTimeArray( ByteBuffer bb, int offset )
@@ -831,11 +831,11 @@
             if ( zone instanceof ZoneOffset )
             {
                 final int offsetSeconds = ((ZoneOffset) zone).getTotalSeconds();
-                buf.putInt( offsetSeconds );
+                buf.putInt( offsetSeconds << 1 );
             }
             else
             {
-                final int zoneId = ENCODED_ZONE_ID | TimeZones.map( zone.getId() );
+                final int zoneId = ENCODED_ZONE_ID | (TimeZones.map( zone.getId() ) << 1);
                 buf.putInt( zoneId );
             }
         }
