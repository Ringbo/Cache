diff --git a/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSessionHome.java b/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSessionHome.java
index 39ed7ea..7f9dfee 100644
--- a/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSessionHome.java
+++ b/testsuite/shared/src/main/java/org/jboss/as/test/integration/web/sso/interfaces/StatelessSessionHome.java
@@ -25,5 +25,5 @@
 import java.rmi.*;
 
 public interface StatelessSessionHome extends EJBHome {
-    public StatelessSession create() throws RemoteException, CreateException;
+    StatelessSession create() throws RemoteException, CreateException;
 }
