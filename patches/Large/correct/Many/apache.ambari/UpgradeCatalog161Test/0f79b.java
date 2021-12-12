diff --git a/ambari-server/src/test/java/org/apache/ambari/server/upgrade/UpgradeCatalog161Test.java b/ambari-server/src/test/java/org/apache/ambari/server/upgrade/UpgradeCatalog161Test.java
index 2942c7a..330b7b3 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/upgrade/UpgradeCatalog161Test.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/upgrade/UpgradeCatalog161Test.java
@@ -124,7 +124,7 @@
     TypedQuery query = createMock(TypedQuery.class);
 
     Method m = AbstractUpgradeCatalog.class.getDeclaredMethod
-        ("updateConfigurationProperties", String.class, Map.class, boolean.class);
+        ("updateConfigurationProperties", String.class, Map.class, boolean.class, boolean.class);
 
     UpgradeCatalog161 upgradeCatalog = createMockBuilder(UpgradeCatalog161.class)
       .addMockedMethod(m).createMock();
