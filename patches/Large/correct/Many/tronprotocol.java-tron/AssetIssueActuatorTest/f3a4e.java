diff --git a/src/test/java/org/tron/core/actuator/AssetIssueActuatorTest.java b/src/test/java/org/tron/core/actuator/AssetIssueActuatorTest.java
index de4fa93..031815f 100755
--- a/src/test/java/org/tron/core/actuator/AssetIssueActuatorTest.java
+++ b/src/test/java/org/tron/core/actuator/AssetIssueActuatorTest.java
@@ -1776,11 +1776,11 @@
   }
 
   /**
-   * SameTokenName close, check invalid precision
+   * SameTokenName open, check invalid precision
    */
   @Test
   public void SameTokenNameCloseInvalidPrecision() {
-    dbManager.getDynamicPropertiesStore().saveAllowSameTokenName(0);
+    dbManager.getDynamicPropertiesStore().saveAllowSameTokenName(1);
     long nowTime = new Date().getTime();
     Any any = Any.pack(
             Contract.AssetIssueContract.newBuilder()
