diff --git a/modules/activiti-jmx/src/main/java/org/activiti/management/jmx/MBeanInfoAssembler.java b/modules/activiti-jmx/src/main/java/org/activiti/management/jmx/MBeanInfoAssembler.java
index 5b3bcb6..ae5b13b 100755
--- a/modules/activiti-jmx/src/main/java/org/activiti/management/jmx/MBeanInfoAssembler.java
+++ b/modules/activiti-jmx/src/main/java/org/activiti/management/jmx/MBeanInfoAssembler.java
@@ -45,7 +45,7 @@
 
 public class MBeanInfoAssembler {
 
-  private static final Logger LOG = LoggerFactory.getLogger(DefaultManagementAgent.class);
+  private static final Logger LOG = LoggerFactory.getLogger(MBeanInfoAssembler.class);
 
   protected final WeakHashMap<Class< ? >, MBeanAttributesAndOperations> cache = new WeakHashMap<Class< ? >, MBeanAttributesAndOperations>(10);
 
