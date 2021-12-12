diff --git a/src/proxy/net/sf/cglib/beans/BeanGenerator.java b/src/proxy/net/sf/cglib/beans/BeanGenerator.java
index 5e9c3e1..2186706 100644
--- a/src/proxy/net/sf/cglib/beans/BeanGenerator.java
+++ b/src/proxy/net/sf/cglib/beans/BeanGenerator.java
@@ -31,7 +31,7 @@
       (BeanGeneratorKey)KeyFactory.create(BeanGeneratorKey.class);
     
     interface BeanGeneratorKey {
-        public Object newInstance(Class superclass, Map props);
+        public Object newInstance(String superclass, Map props);
     }
 
     private Class superclass;
@@ -84,7 +84,7 @@
         if (superclass != null) {
             setNamePrefix(superclass.getName());
         }
-        Object key = KEY_FACTORY.newInstance(superclass, props);
+        Object key = KEY_FACTORY.newInstance(superclass.getName(), props);
         return super.create(key);
     }
 
