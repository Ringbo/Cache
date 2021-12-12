diff --git a/engine/src/main/java/org/terasology/engine/TerasologyEngine.java b/engine/src/main/java/org/terasology/engine/TerasologyEngine.java
index 58fdf30..3a0d518 100644
--- a/engine/src/main/java/org/terasology/engine/TerasologyEngine.java
+++ b/engine/src/main/java/org/terasology/engine/TerasologyEngine.java
@@ -650,7 +650,7 @@
         moduleSecurityManager.addAllowedPermission(InjectionHelper.class, new RuntimePermission("accessDeclaredMembers"));
         moduleSecurityManager.addAllowedPermission("java.awt", new RuntimePermission("loadLibrary.dcpr"));
 
-        moduleSecurityManager.addAllowedPermission(GUIManager.class, ReflectPermission.class);
+        moduleSecurityManager.addAllowedPermission(GUIManagerLwjgl.class, ReflectPermission.class);
 
         System.setSecurityManager(moduleSecurityManager);
         return moduleManager;
