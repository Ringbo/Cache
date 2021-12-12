diff --git a/hazelcast/src/test/java/com/hazelcast/security/permission/UserCodeDeploymentPermissionTest.java b/hazelcast/src/test/java/com/hazelcast/security/permission/UserCodeDeploymentPermissionTest.java
index dc7be76..8e834f2 100644
--- a/hazelcast/src/test/java/com/hazelcast/security/permission/UserCodeDeploymentPermissionTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/security/permission/UserCodeDeploymentPermissionTest.java
@@ -26,11 +26,11 @@
 
 @RunWith(HazelcastSerialClassRunner.class)
 @Category(QuickTest.class)
-public class UserCodeDeploymentPermissionTest extends AbstractGenericPermissionTest {
+public class UserCodeDeploymentPermissionTest extends PermissionTestSupport {
 
     @Override
     protected Permission createPermission(String name, String... actions) {
-        return new CardinalityEstimatorPermission(name, actions);
+        return new UserCodeDeploymentPermission(actions);
     }
 
     @Test
@@ -45,7 +45,7 @@
 
     @Test
     public void checkAllPermission_whenDeploy() {
-        new CheckPermission().of("all").against("deploy").expect(false).run();
+        new CheckPermission().of("all").against("deploy").expect(true).run();
     }
 
 }
