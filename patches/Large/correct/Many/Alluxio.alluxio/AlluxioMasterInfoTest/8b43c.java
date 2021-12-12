diff --git a/core/common/src/test/java/alluxio/wire/AlluxioMasterInfoTest.java b/core/common/src/test/java/alluxio/wire/AlluxioMasterInfoTest.java
index 4968bff..5160fea 100644
--- a/core/common/src/test/java/alluxio/wire/AlluxioMasterInfoTest.java
+++ b/core/common/src/test/java/alluxio/wire/AlluxioMasterInfoTest.java
@@ -74,11 +74,11 @@
     String rpcAddress = CommonUtils.randomAlphaNumString(random.nextInt(10));
     long startTimeMs = random.nextLong();
     StartupConsistencyCheck check = new StartupConsistencyCheck();
-    check.setStatus(CommonUtils.randomString(random.nextInt(10)));
+    check.setStatus(CommonUtils.randomAlphaNumString(random.nextInt(10)));
     int numUris = random.nextInt(10);
     List<String> uris = new ArrayList<>(numUris);
     for (int i = 0; i < numUris; i++) {
-      uris.add(CommonUtils.randomString(random.nextInt(10)));
+      uris.add(CommonUtils.randomAlphaNumString(random.nextInt(10)));
     }
     check.setInconsistentUris(uris);
     Map<String, Capacity> tierCapacity = new HashMap<>();
