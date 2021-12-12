diff --git a/modules/activiti5-test/src/test/java/org/activiti5/examples/mgmt/ManagementServiceTest.java b/modules/activiti5-test/src/test/java/org/activiti5/examples/mgmt/ManagementServiceTest.java
index 0bdc934..209cccb 100644
--- a/modules/activiti5-test/src/test/java/org/activiti5/examples/mgmt/ManagementServiceTest.java
+++ b/modules/activiti5-test/src/test/java/org/activiti5/examples/mgmt/ManagementServiceTest.java
@@ -32,7 +32,7 @@
     
     String tablePrefix = processEngineConfiguration.getDatabaseTablePrefix();
     
-    assertEquals(new Long(3), tableCount.get(tablePrefix+"ACT_GE_PROPERTY"));
+    assertEquals(new Long(4), tableCount.get(tablePrefix+"ACT_GE_PROPERTY"));
     assertEquals(new Long(0), tableCount.get(tablePrefix+"ACT_GE_BYTEARRAY"));
     assertEquals(new Long(0), tableCount.get(tablePrefix+"ACT_RE_DEPLOYMENT"));
     assertEquals(new Long(0), tableCount.get(tablePrefix+"ACT_RU_EXECUTION"));
