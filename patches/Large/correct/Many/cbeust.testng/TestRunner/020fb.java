diff --git a/src/main/java/org/testng/TestRunner.java b/src/main/java/org/testng/TestRunner.java
index 1d1d819..b5ec4f1 100644
--- a/src/main/java/org/testng/TestRunner.java
+++ b/src/main/java/org/testng/TestRunner.java
@@ -75,7 +75,7 @@
 
   /** ITestListeners support. */
   transient private List<ITestListener> m_testListeners = Lists.newArrayList();
-  transient private List<IConfigurationListener> m_configurationListeners = Lists.newArrayList();
+  transient private Set<IConfigurationListener> m_configurationListeners = Sets.<IConfigurationListener>newHashSet();
 
   transient private IConfigurationListener m_confListener= new ConfigurationListener();
   transient private boolean m_skipFailedInvocationCounts;
@@ -1416,7 +1416,7 @@
 
   @Override
   public List<IConfigurationListener> getConfigurationListeners() {
-    return m_configurationListeners;
+    return Lists.<IConfigurationListener>newArrayList(m_configurationListeners);
   }
   //
   // ITestResultNotifier
