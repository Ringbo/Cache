diff --git a/testsuite/shared/src/main/java/org/jboss/as/test/integration/management/rbac/RbacUtil.java b/testsuite/shared/src/main/java/org/jboss/as/test/integration/management/rbac/RbacUtil.java
index 38c81dd..e4ecdf8 100644
--- a/testsuite/shared/src/main/java/org/jboss/as/test/integration/management/rbac/RbacUtil.java
+++ b/testsuite/shared/src/main/java/org/jboss/as/test/integration/management/rbac/RbacUtil.java
@@ -109,7 +109,7 @@
                     fail("Didn't fail: " + result.asString());
                 }
                 String failureDesc = result.get(FAILURE_DESCRIPTION).asString();
-                if (!failureDesc.contains("14807") && !failureDesc.contains("14883")) {
+                if (!failureDesc.contains("14807") && !failureDesc.contains("14883") && !failureDesc.contains("11340")) {
                     fail("Incorrect failure type: " + result.asString());
                 }
                 break;
@@ -120,7 +120,7 @@
                 }
                 String failureDesc = result.get(FAILURE_DESCRIPTION).asString();
                 if (failureDesc.contains("14807") || failureDesc.contains("14883")
-                        || failureDesc.contains("13456")) {
+                        || failureDesc.contains("13456") || failureDesc.contains("11340")) {
                     fail("Incorrect failure type: " + result.asString());
                 }
                 break;
