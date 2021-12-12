diff --git a/camel-core/src/test/java/org/apache/camel/management/ManagedEndpointExplainTest.java b/camel-core/src/test/java/org/apache/camel/management/ManagedEndpointExplainTest.java
index 2b6d75a..5ec4e66 100644
--- a/camel-core/src/test/java/org/apache/camel/management/ManagedEndpointExplainTest.java
+++ b/camel-core/src/test/java/org/apache/camel/management/ManagedEndpointExplainTest.java
@@ -48,9 +48,9 @@
         TabularData data = (TabularData) mbeanServer.invoke(on, "explain", new Object[]{false}, new String[]{"boolean"});
         assertEquals(3, data.size());
 
-        // there should be 6 options
+        // there should be 8 options
         data = (TabularData) mbeanServer.invoke(on, "explain", new Object[]{true}, new String[]{"boolean"});
-        assertEquals(6, data.size());
+        assertEquals(8, data.size());
     }
 
     @Override
