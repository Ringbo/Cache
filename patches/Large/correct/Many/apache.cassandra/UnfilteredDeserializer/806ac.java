diff --git a/src/java/org/apache/cassandra/db/UnfilteredDeserializer.java b/src/java/org/apache/cassandra/db/UnfilteredDeserializer.java
index bf9c2b8..a2d51e13 100644
--- a/src/java/org/apache/cassandra/db/UnfilteredDeserializer.java
+++ b/src/java/org/apache/cassandra/db/UnfilteredDeserializer.java
@@ -647,7 +647,7 @@
                     // If the new tombstone don't supersedes the currently open tombstone, we don't have anything to return, we
                     // just add the new tombstone (because we know tombstone is not fully shadowed, this imply the new tombstone
                     // simply extend after the first one and we'll deal with it later)
-                    assert metadata.comparator.compare(tombstone.start.bound, first.stop.bound) > 0;
+                    assert metadata.comparator.compare(tombstone.start.bound, first.stop.bound) <= 0;
                     openTombstones.add(tombstone);
                     return null;
                 }
