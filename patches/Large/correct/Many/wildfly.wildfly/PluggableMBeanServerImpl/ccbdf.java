diff --git a/jmx/src/main/java/org/jboss/as/jmx/PluggableMBeanServerImpl.java b/jmx/src/main/java/org/jboss/as/jmx/PluggableMBeanServerImpl.java
index d0561c7..4d1e98b 100644
--- a/jmx/src/main/java/org/jboss/as/jmx/PluggableMBeanServerImpl.java
+++ b/jmx/src/main/java/org/jboss/as/jmx/PluggableMBeanServerImpl.java
@@ -224,7 +224,7 @@
         MBeanServerPlugin delegate = null;
         final boolean readOnly = false;
         try {
-            delegate = findDelegate(name);
+            delegate = findDelegateForNewObject(name);
             if (delegate.shouldAuthorize()) {
                 authorizeSensitiveOperation(CREATE_MBEAN, readOnly, true);
             }
@@ -252,7 +252,7 @@
         MBeanServerPlugin delegate = null;
         final boolean readOnly = false;
         try {
-            delegate = findDelegate(name);
+            delegate = findDelegateForNewObject(name);
             if (delegate.shouldAuthorize()) {
                 authorizeSensitiveOperation(CREATE_MBEAN, readOnly, true);
             }
