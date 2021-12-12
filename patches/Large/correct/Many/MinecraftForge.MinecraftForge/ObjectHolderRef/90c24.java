diff --git a/src/main/java/net/minecraftforge/registries/ObjectHolderRef.java b/src/main/java/net/minecraftforge/registries/ObjectHolderRef.java
index 6f3cea4..2a1cb55 100644
--- a/src/main/java/net/minecraftforge/registries/ObjectHolderRef.java
+++ b/src/main/java/net/minecraftforge/registries/ObjectHolderRef.java
@@ -82,7 +82,7 @@
 
         if (this.injectedObject == null || !isValid())
         {
-            throw new IllegalStateException(String.format("The ObjectHolder annotation cannot apply to a field that does not map to a registry. Ensure the registry was created during the RegistryEvent.NewRegistry event. (found : %s at %s.%s)", field.getType().getName(), field.getClass().getName(), field.getName()));
+            throw new IllegalStateException(String.format("The ObjectHolder annotation cannot apply to a field that does not map to a registry. Ensure the registry was created during the RegistryEvent.NewRegistry event. (found : %s at %s.%s)", field.getType().getName(), field.getDeclaringClass().getName(), field.getName()));
         }
         try
         {
