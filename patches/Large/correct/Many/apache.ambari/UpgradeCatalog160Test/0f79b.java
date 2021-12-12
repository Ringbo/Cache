diff --git a/ambari-server/src/test/java/org/apache/ambari/server/upgrade/UpgradeCatalog160Test.java b/ambari-server/src/test/java/org/apache/ambari/server/upgrade/UpgradeCatalog160Test.java
index 328dfff..1b2526c 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/upgrade/UpgradeCatalog160Test.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/upgrade/UpgradeCatalog160Test.java
@@ -89,7 +89,7 @@
     DBAccessor dbAccessor = createNiceMock(DBAccessor.class);
 
     Method m = AbstractUpgradeCatalog.class.getDeclaredMethod
-      ("updateConfigurationProperties", String.class, Map.class, boolean.class);
+      ("updateConfigurationProperties", String.class, Map.class, boolean.class, boolean.class);
 
     UpgradeCatalog160 upgradeCatalog = createMockBuilder(UpgradeCatalog160.class)
       .addMockedMethod(m).createMock();
