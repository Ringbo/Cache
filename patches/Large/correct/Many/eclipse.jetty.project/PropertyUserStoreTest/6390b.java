diff --git a/jetty-security/src/test/java/org/eclipse/jetty/security/PropertyUserStoreTest.java b/jetty-security/src/test/java/org/eclipse/jetty/security/PropertyUserStoreTest.java
index eea4fc5..84e8c76 100644
--- a/jetty-security/src/test/java/org/eclipse/jetty/security/PropertyUserStoreTest.java
+++ b/jetty-security/src/test/java/org/eclipse/jetty/security/PropertyUserStoreTest.java
@@ -169,7 +169,7 @@
         final File usersFile = initUsersText();
 
         PropertyUserStore store = new PropertyUserStore();
-        store.setConfigPath(usersFile);
+        store.setConfigFile(usersFile);
 
         store.registerUserListener(userCount);
 
@@ -215,7 +215,7 @@
 
         PropertyUserStore store = new PropertyUserStore();
         store.setHotReload(true);
-        store.setConfigPath(usersFile);
+        store.setConfigFile(usersFile);
 
         store.registerUserListener(userCount);
 
@@ -246,7 +246,7 @@
 
         PropertyUserStore store = new PropertyUserStore();
         store.setHotReload(true);
-        store.setConfigPath(usersFile);
+        store.setConfigFile(usersFile);
 
         store.registerUserListener(userCount);
 
