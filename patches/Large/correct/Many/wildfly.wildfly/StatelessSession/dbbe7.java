diff --git a/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSession.java b/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSession.java
index aa1aaa2..109455f 100644
--- a/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSession.java
+++ b/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSession.java
@@ -32,14 +32,14 @@
 public interface StatelessSession extends EJBObject {
 
     /** A method that returns its arg */
-    public String echo(String arg) throws RemoteException;
+    String echo(String arg) throws RemoteException;
     
     /**
      * A method that does nothing. It is used to test call optimization.
      */
-    public void noop() throws RemoteException;
+    void noop() throws RemoteException;
 
     /** Return a data object */
-    public ReturnData getData() throws RemoteException;
+    ReturnData getData() throws RemoteException;
 
 }
