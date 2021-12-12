diff --git a/camel-core/src/test/java/org/apache/camel/management/ManagedNonManagedServiceTest.java b/camel-core/src/test/java/org/apache/camel/management/ManagedNonManagedServiceTest.java
index a2ed6ed..c3fcaad 100644
--- a/camel-core/src/test/java/org/apache/camel/management/ManagedNonManagedServiceTest.java
+++ b/camel-core/src/test/java/org/apache/camel/management/ManagedNonManagedServiceTest.java
@@ -48,7 +48,7 @@
         MBeanServer mbeanServer = getMBeanServer();
 
         Set<ObjectName> set = mbeanServer.queryNames(new ObjectName("*:type=services,*"), null);
-        assertEquals(9, set.size());
+        assertEquals(10, set.size());
     }
 
     public void testNonManagedService() throws Exception {
@@ -69,7 +69,7 @@
         MBeanServer mbeanServer = getMBeanServer();
 
         Set<ObjectName> set = mbeanServer.queryNames(new ObjectName("*:type=services,*"), null);
-        assertEquals(8, set.size());
+        assertEquals(9, set.size());
     }
 
     @Override
