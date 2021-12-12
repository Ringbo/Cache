diff --git a/core/src/main/java/org/springframework/security/providers/dao/salt/ReflectionSaltSource.java b/core/src/main/java/org/springframework/security/providers/dao/salt/ReflectionSaltSource.java
index 75dcc88..365a099 100644
--- a/core/src/main/java/org/springframework/security/providers/dao/salt/ReflectionSaltSource.java
+++ b/core/src/main/java/org/springframework/security/providers/dao/salt/ReflectionSaltSource.java
@@ -75,7 +75,7 @@
     }
 
     private Method findSaltMethod(UserDetails user) {
-        Method saltMethod = ReflectionUtils.findMethod(user.getClass(), userPropertyToUse);
+        Method saltMethod = ReflectionUtils.findMethod(user.getClass(), userPropertyToUse, new Class[0]);
 
         if (saltMethod == null) {
             PropertyDescriptor pd = BeanUtils.getPropertyDescriptor(user.getClass(), userPropertyToUse);
