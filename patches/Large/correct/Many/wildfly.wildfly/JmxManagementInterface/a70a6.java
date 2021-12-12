diff --git a/testsuite/shared/src/main/java/org/jboss/as/test/integration/management/interfaces/JmxManagementInterface.java b/testsuite/shared/src/main/java/org/jboss/as/test/integration/management/interfaces/JmxManagementInterface.java
index c7d2bac..39d843f 100644
--- a/testsuite/shared/src/main/java/org/jboss/as/test/integration/management/interfaces/JmxManagementInterface.java
+++ b/testsuite/shared/src/main/java/org/jboss/as/test/integration/management/interfaces/JmxManagementInterface.java
@@ -198,7 +198,7 @@
                 // see RbacUtil.checkOperationResult for error codes
                 // TODO could possibly use MBeanAttributeInfo#isReadable instead of error codes, but it's currently broken
                 String message = e.getMessage();
-                if (message.contains("14807") || message.contains("14883")) {
+                if (message.contains("14807") || message.contains("14883") || message.contains("11340")) {
                     throw e;
                 } else if (message.contains("13456")) {
                     filtered.add(JmxInterfaceStringUtils.toDashCase(attributeName));
