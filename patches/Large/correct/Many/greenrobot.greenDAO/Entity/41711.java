diff --git a/DaoGenerator/src/de/greenrobot/daogenerator/Entity.java b/DaoGenerator/src/de/greenrobot/daogenerator/Entity.java
index f0df5da..1e76deb 100644
--- a/DaoGenerator/src/de/greenrobot/daogenerator/Entity.java
+++ b/DaoGenerator/src/de/greenrobot/daogenerator/Entity.java
@@ -425,7 +425,7 @@
 
     public void implementsInterface(String... interfaces) {
         for (String interfaceToImplement : interfaces) {
-            if (interfaceToImplement.contains(interfaceToImplement)) {
+            if (interfacesToImplement.contains(interfaceToImplement)) {
                 throw new RuntimeException("Interface defined more than once: " + interfaceToImplement);
             }
             interfacesToImplement.add(interfaceToImplement);
