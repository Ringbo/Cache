diff --git a/cglib/src/main/java/net/sf/cglib/beans/BulkBeanEmitter.java b/cglib/src/main/java/net/sf/cglib/beans/BulkBeanEmitter.java
index 440069e..2b75243 100644
--- a/cglib/src/main/java/net/sf/cglib/beans/BulkBeanEmitter.java
+++ b/cglib/src/main/java/net/sf/cglib/beans/BulkBeanEmitter.java
@@ -56,7 +56,7 @@
 
     private void generateGet(final Class target, final Method[] getters) {
         CodeEmitter e = begin_method(Constants.ACC_PUBLIC, GET_PROPERTY_VALUES, null);
-        if (getters.length >= 0) {
+        if (getters.length > 0) {
             e.load_arg(0);
             e.checkcast(Type.getType(target));
             Local bean = e.make_local();
