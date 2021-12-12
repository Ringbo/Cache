diff --git a/modules/activiti-jmx/src/main/java/org/activiti/management/jmx/DefaultManagementMBeanAssembler.java b/modules/activiti-jmx/src/main/java/org/activiti/management/jmx/DefaultManagementMBeanAssembler.java
index d3af95f..e98c33f 100755
--- a/modules/activiti-jmx/src/main/java/org/activiti/management/jmx/DefaultManagementMBeanAssembler.java
+++ b/modules/activiti-jmx/src/main/java/org/activiti/management/jmx/DefaultManagementMBeanAssembler.java
@@ -28,7 +28,7 @@
  */
 public class DefaultManagementMBeanAssembler implements ManagementMBeanAssembler {
 
-  private static final Logger LOG = LoggerFactory.getLogger(DefaultManagementAgent.class);
+  private static final Logger LOG = LoggerFactory.getLogger(DefaultManagementMBeanAssembler.class);
   
   protected final MBeanInfoAssembler assembler;
 
