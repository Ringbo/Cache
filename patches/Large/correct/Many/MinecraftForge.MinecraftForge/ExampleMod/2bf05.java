diff --git a/fml/install/src/main/java/com/example/examplemod/ExampleMod.java b/fml/install/src/main/java/com/example/examplemod/ExampleMod.java
index 348ab61..4245c7e 100644
--- a/fml/install/src/main/java/com/example/examplemod/ExampleMod.java
+++ b/fml/install/src/main/java/com/example/examplemod/ExampleMod.java
@@ -15,6 +15,6 @@
     public void init(FMLInitializationEvent event)
     {
 		// some example code
-        System.out.println("DIRT BLOCK >> "+Blocks.dirt.func_149739_a());
+        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
     }
 }
