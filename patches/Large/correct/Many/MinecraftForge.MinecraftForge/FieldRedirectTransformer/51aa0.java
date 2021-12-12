diff --git a/src/main/java/net/minecraftforge/fml/common/asm/transformers/FieldRedirectTransformer.java b/src/main/java/net/minecraftforge/fml/common/asm/transformers/FieldRedirectTransformer.java
index d51d0ee..ba5be79 100644
--- a/src/main/java/net/minecraftforge/fml/common/asm/transformers/FieldRedirectTransformer.java
+++ b/src/main/java/net/minecraftforge/fml/common/asm/transformers/FieldRedirectTransformer.java
@@ -51,7 +51,7 @@
     @Override
     public byte[] transform(String name, String transformedName, byte[] basicClass)
     {
-        if (!this.clsName.equals(name))
+        if (!this.clsName.equals(transformedName))
             return basicClass;
 
         ClassNode classNode = new ClassNode();
