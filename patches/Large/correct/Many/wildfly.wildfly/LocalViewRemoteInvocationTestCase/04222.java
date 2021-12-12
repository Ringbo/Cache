diff --git a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ejb/remote/view/LocalViewRemoteInvocationTestCase.java b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ejb/remote/view/LocalViewRemoteInvocationTestCase.java
index 11f7025..1254def 100644
--- a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ejb/remote/view/LocalViewRemoteInvocationTestCase.java
+++ b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ejb/remote/view/LocalViewRemoteInvocationTestCase.java
@@ -145,7 +145,7 @@
         try {
             final String echo = localEcho.echo(message);
             Assert.fail("Remote invocation on a local view " + LocalEcho.class.getName() + " was expected to fail");
-        } catch (EJBException nsee) {
+        } catch (IllegalStateException nsee) {
             // expected
             logger.trace("Got the expected exception on invoking on a local view, remotely", nsee);
         }
@@ -165,7 +165,7 @@
         try {
             final String echo = localEcho.echo(message);
             Assert.fail("Remote invocation on a local view " + LocalEcho.class.getName() + " was expected to fail");
-        } catch (EJBException nsee) {
+        } catch (IllegalStateException nsee) {
             // expected
             logger.trace("Got the expected exception on invoking on a local view, remotely", nsee);
         }
@@ -185,7 +185,7 @@
         try {
             final String echo = localEcho.echo(message);
             Assert.fail("Remote invocation on a local view " + LocalEcho.class.getName() + " was expected to fail");
-        } catch (EJBException nsee) {
+        } catch (IllegalStateException nsee) {
             // expected
             logger.trace("Got the expected exception on invoking on a local view, remotely", nsee);
         }
