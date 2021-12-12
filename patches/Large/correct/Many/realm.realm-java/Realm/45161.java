diff --git a/realm/src/main/java/io/realm/Realm.java b/realm/src/main/java/io/realm/Realm.java
index 17dcacb..5ab36dd 100644
--- a/realm/src/main/java/io/realm/Realm.java
+++ b/realm/src/main/java/io/realm/Realm.java
@@ -1612,7 +1612,7 @@
             insertOrUpdateMethods.put(proxyClass, method);
         }
         try {
-            Object result = method.invoke(null, this, object, update, new HashMap<Integer, RealmObject>());
+            Object result = method.invoke(null, this, object, update, new HashMap<RealmObject,RealmObject>());
             return (E) result;
         } catch (IllegalAccessException e) {
             throw new RealmException("Could not execute the copyToRealm method : " + APT_NOT_EXECUTED_MESSAGE, e);
