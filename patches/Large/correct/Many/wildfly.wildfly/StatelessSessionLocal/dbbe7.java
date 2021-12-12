diff --git a/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSessionLocal.java b/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSessionLocal.java
index 1461d31..d20257f 100644
--- a/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSessionLocal.java
+++ b/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSessionLocal.java
@@ -33,9 +33,9 @@
 public interface StatelessSessionLocal extends EJBLocalObject {
 
     /** A method that returns its arg */
-    public String echo(String arg) throws RemoteException;
+    String echo(String arg) throws RemoteException;
     
     /** A method that does nothing. It is used to test call optimization. */
-    public void noop();
+    void noop();
 
 }
