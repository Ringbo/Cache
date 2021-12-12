diff --git a/arquillian/container-managed/src/test/java/org/jboss/as/arquillian/container/managed/ManagedAsClientTestCase.java b/arquillian/container-managed/src/test/java/org/jboss/as/arquillian/container/managed/ManagedAsClientTestCase.java
index a343d95..a93337b 100644
--- a/arquillian/container-managed/src/test/java/org/jboss/as/arquillian/container/managed/ManagedAsClientTestCase.java
+++ b/arquillian/container-managed/src/test/java/org/jboss/as/arquillian/container/managed/ManagedAsClientTestCase.java
@@ -53,7 +53,7 @@
 
     @Override
     protected MBeanServerConnection getMBeanServer() throws Exception {
-        MBeanServerConnectionProvider provider = new MBeanServerConnectionProvider(InetAddress.getLocalHost(), 1090);
+        MBeanServerConnectionProvider provider = new MBeanServerConnectionProvider(InetAddress.getByName("127.0.0.1"), 1090);
         return provider.getConnection();
     }
 }
