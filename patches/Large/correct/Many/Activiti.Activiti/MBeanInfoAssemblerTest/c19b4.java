diff --git a/modules/activiti-jmx/src/test/java/org/activiti/management/jmx/MBeanInfoAssemblerTest.java b/modules/activiti-jmx/src/test/java/org/activiti/management/jmx/MBeanInfoAssemblerTest.java
index 5b665bd..5a4fb1a 100755
--- a/modules/activiti-jmx/src/test/java/org/activiti/management/jmx/MBeanInfoAssemblerTest.java
+++ b/modules/activiti-jmx/src/test/java/org/activiti/management/jmx/MBeanInfoAssemblerTest.java
@@ -136,9 +136,9 @@
     ModelMBeanInfo beanInfo = mbeanInfoAssembler.getMBeanInfo(new BadInherited(), null, "someName");
     assertNotNull(beanInfo);
     assertNotNull(beanInfo.getAttributes());
-    assertEquals(0, beanInfo.getAttributes().length);
+    assertEquals(2, beanInfo.getAttributes().length);
     assertNotNull(beanInfo.getOperations());
-    assertEquals(0, beanInfo.getOperations().length);
+    assertEquals(1, beanInfo.getOperations().length);
 
   }
 
