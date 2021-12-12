diff --git a/camel-core/src/test/java/org/apache/camel/management/ManagedDataFormatTest.java b/camel-core/src/test/java/org/apache/camel/management/ManagedDataFormatTest.java
index 0429269..53d6be7 100644
--- a/camel-core/src/test/java/org/apache/camel/management/ManagedDataFormatTest.java
+++ b/camel-core/src/test/java/org/apache/camel/management/ManagedDataFormatTest.java
@@ -52,7 +52,7 @@
 
         TabularData data = (TabularData) mbeanServer.invoke(on, "explain", new Object[]{true}, new String[]{"boolean"});
         assertNotNull(data);
-        assertEquals(2, data.size());
+        assertEquals(3, data.size());
 
         data = (TabularData) mbeanServer.invoke(on, "explain", new Object[]{false}, new String[]{"boolean"});
         assertNotNull(data);
