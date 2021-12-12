diff --git a/core/common/src/test/java/alluxio/AuthenticatedUserRule.java b/core/common/src/test/java/alluxio/AuthenticatedUserRule.java
index e7e036b..473c4cd 100644
--- a/core/common/src/test/java/alluxio/AuthenticatedUserRule.java
+++ b/core/common/src/test/java/alluxio/AuthenticatedUserRule.java
@@ -19,11 +19,16 @@
 import org.junit.runners.model.Statement;
 
 /**
- * A rule for login a Alluxio user during a test suite.
+ * A rule for login an Alluxio user during a test suite. It sets {@link AuthenticatedClientUser}
+ * and {@link PropertyKey#SECURITY_LOGIN_USERNAME} to the specified user name during the lifetime
+ * of this rule. Note: {@link AuthenticatedClientUser} only takes effect within the caller thread.
  */
-public class AuthenticatedUserRule implements TestRule {
+public final class AuthenticatedUserRule implements TestRule {
   private final String mUser;
 
+  /**
+   * @param user the user name to set as authenticated user
+   */
   public AuthenticatedUserRule(String user) {
     mUser = user;
   }
