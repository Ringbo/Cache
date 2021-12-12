diff --git a/jOOQ-codegen/src/main/java/org/jooq/util/GeneratorWriter.java b/jOOQ-codegen/src/main/java/org/jooq/util/GeneratorWriter.java
index 9f55b1e..0db9571 100644
--- a/jOOQ-codegen/src/main/java/org/jooq/util/GeneratorWriter.java
+++ b/jOOQ-codegen/src/main/java/org/jooq/util/GeneratorWriter.java
@@ -285,7 +285,7 @@
             return true;
         }
         catch (IOException e) {
-            throw new GeneratorException("Error writing " + file.getAbsolutePath());
+            throw new GeneratorException("Error writing " + file.getAbsolutePath(), e);
         }
     }
 
