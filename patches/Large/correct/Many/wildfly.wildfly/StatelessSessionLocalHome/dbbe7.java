diff --git a/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSessionLocalHome.java b/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSessionLocalHome.java
index 07b9204..0bdf203 100644
--- a/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSessionLocalHome.java
+++ b/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSessionLocalHome.java
@@ -30,5 +30,5 @@
  * @author Scott.Stark@jboss.org
  */
 public interface StatelessSessionLocalHome extends EJBLocalHome {
-    public StatelessSessionLocal create() throws CreateException;
+    StatelessSessionLocal create() throws CreateException;
 }
