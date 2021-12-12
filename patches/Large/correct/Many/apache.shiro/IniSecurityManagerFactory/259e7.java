diff --git a/core/src/main/java/org/apache/shiro/config/IniSecurityManagerFactory.java b/core/src/main/java/org/apache/shiro/config/IniSecurityManagerFactory.java
index 4f1d5a9..dfe95ae 100644
--- a/core/src/main/java/org/apache/shiro/config/IniSecurityManagerFactory.java
+++ b/core/src/main/java/org/apache/shiro/config/IniSecurityManagerFactory.java
@@ -173,7 +173,8 @@
     private void addToRealms(Collection<Realm> realms, RealmFactory factory) {
         LifecycleUtils.init(factory);
         Collection<Realm> factoryRealms = factory.getRealms();
-        if (!CollectionUtils.isEmpty(realms)) {
+        //SHIRO-238: check factoryRealms (was 'realms'):
+        if (!CollectionUtils.isEmpty(factoryRealms)) {
             realms.addAll(factoryRealms);
         }
     }
