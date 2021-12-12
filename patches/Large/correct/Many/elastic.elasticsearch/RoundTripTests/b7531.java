diff --git a/modules/reindex/src/test/java/org/elasticsearch/index/reindex/RoundTripTests.java b/modules/reindex/src/test/java/org/elasticsearch/index/reindex/RoundTripTests.java
index 97e228c..ee9cbf5 100644
--- a/modules/reindex/src/test/java/org/elasticsearch/index/reindex/RoundTripTests.java
+++ b/modules/reindex/src/test/java/org/elasticsearch/index/reindex/RoundTripTests.java
@@ -81,7 +81,7 @@
 
         // Try slices with a version that doesn't support slices. That should fail.
         reindex.setSlices(between(2, 1000));
-        Exception e = expectThrows(UnsupportedOperationException.class, () -> roundTrip(Version.V_5_0_0_rc1, reindex, null));
+        Exception e = expectThrows(IllegalArgumentException.class, () -> roundTrip(Version.V_5_0_0_rc1, reindex, null));
         assertEquals("Attempting to send sliced reindex-style request to a node that doesn't support it. "
                 + "Version is [5.0.0-rc1] but must be [5.1.0]", e.getMessage());
 
@@ -105,7 +105,7 @@
 
         // Try slices with a version that doesn't support slices. That should fail.
         update.setSlices(between(2, 1000));
-        Exception e = expectThrows(UnsupportedOperationException.class, () -> roundTrip(Version.V_5_0_0_rc1, update, null));
+        Exception e = expectThrows(IllegalArgumentException.class, () -> roundTrip(Version.V_5_0_0_rc1, update, null));
         assertEquals("Attempting to send sliced reindex-style request to a node that doesn't support it. "
                 + "Version is [5.0.0-rc1] but must be [5.1.0]", e.getMessage());
 
@@ -126,7 +126,7 @@
 
         // Try slices with a version that doesn't support slices. That should fail.
         delete.setSlices(between(2, 1000));
-        Exception e = expectThrows(UnsupportedOperationException.class, () -> roundTrip(Version.V_5_0_0_rc1, delete, null));
+        Exception e = expectThrows(IllegalArgumentException.class, () -> roundTrip(Version.V_5_0_0_rc1, delete, null));
         assertEquals("Attempting to send sliced reindex-style request to a node that doesn't support it. "
                 + "Version is [5.0.0-rc1] but must be [5.1.0]", e.getMessage());
 
