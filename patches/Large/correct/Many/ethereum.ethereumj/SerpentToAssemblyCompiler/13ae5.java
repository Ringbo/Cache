diff --git a/ethereumj-core/src/main/java/org/ethereum/serpent/SerpentToAssemblyCompiler.java b/ethereumj-core/src/main/java/org/ethereum/serpent/SerpentToAssemblyCompiler.java
index 7aa66be..6e3db71 100644
--- a/ethereumj-core/src/main/java/org/ethereum/serpent/SerpentToAssemblyCompiler.java
+++ b/ethereumj-core/src/main/java/org/ethereum/serpent/SerpentToAssemblyCompiler.java
@@ -326,7 +326,7 @@
             throw new Error("array with that name was not defined");
         }
 
-        int allocSize = 0;
+        int allocSize = 32;
         for (int i = 0; i < order; ++i ){
             String var = arraysIndex.get(i);
             allocSize += arraysSize.get(var);
