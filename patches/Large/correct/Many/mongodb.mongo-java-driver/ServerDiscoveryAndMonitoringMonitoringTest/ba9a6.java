diff --git a/driver-core/src/test/unit/com/mongodb/connection/ServerDiscoveryAndMonitoringMonitoringTest.java b/driver-core/src/test/unit/com/mongodb/connection/ServerDiscoveryAndMonitoringMonitoringTest.java
index a264d98..1f1995a 100644
--- a/driver-core/src/test/unit/com/mongodb/connection/ServerDiscoveryAndMonitoringMonitoringTest.java
+++ b/driver-core/src/test/unit/com/mongodb/connection/ServerDiscoveryAndMonitoringMonitoringTest.java
@@ -143,7 +143,7 @@
     private void assertEqualClusterDescriptions(final ClusterDescription expected, final ClusterDescription actual) {
         assertEquals(expected.getType(), actual.getType());
         assertEquals(expected.getAll().size(), actual.getAll().size());
-        for (ServerDescription curExpected: actual.getAll()) {
+        for (ServerDescription curExpected: expected.getAll()) {
             ServerDescription curActual = getByServerAddress(curExpected.getAddress(), actual.getAll());
             assertNotNull(curActual);
             assertEqualServerDescriptions(curExpected, curActual);
