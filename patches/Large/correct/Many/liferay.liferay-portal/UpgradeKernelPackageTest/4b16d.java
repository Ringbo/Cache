diff --git a/portal-impl/test/integration/com/liferay/portal/upgrade/v7_0_0/UpgradeKernelPackageTest.java b/portal-impl/test/integration/com/liferay/portal/upgrade/v7_0_0/UpgradeKernelPackageTest.java
index 7b874ec6..89d2c48 100644
--- a/portal-impl/test/integration/com/liferay/portal/upgrade/v7_0_0/UpgradeKernelPackageTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/upgrade/v7_0_0/UpgradeKernelPackageTest.java
@@ -57,7 +57,7 @@
 			"insert into ClassName_ values(0, " + increment(ClassName.class) +
 				", 'PREFIX_" + _OLD_CLASS_NAME + "')");
 
-		StringBundler sb = new StringBundler(8);
+		StringBundler sb = new StringBundler(9);
 
 		sb.append("insert into ResourceBlock values(0, ");
 		sb.append(increment(ResourceBlock.class));
