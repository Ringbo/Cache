diff --git a/compiler/impl/com/intellij/compiler/make/CompilerDependencyStorage.java b/compiler/impl/com/intellij/compiler/make/CompilerDependencyStorage.java
index 566eb45..00c0e27 100644
--- a/compiler/impl/com/intellij/compiler/make/CompilerDependencyStorage.java
+++ b/compiler/impl/com/intellij/compiler/make/CompilerDependencyStorage.java
@@ -122,13 +122,13 @@
       flush();
     }
     catch (IOException e) {
-      LOG.error(e);
+      LOG.info(e);
     }
     try {
       myMap.close();
     }
     catch (IOException e) {
-      LOG.error(e);
+      LOG.info(e);
     }
   }
 
