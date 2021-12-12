diff --git a/ethereumj-core/src/main/java/org/ethereum/serpent/SerpentCompiler.java b/ethereumj-core/src/main/java/org/ethereum/serpent/SerpentCompiler.java
index 1c9795e..91f9939 100644
--- a/ethereumj-core/src/main/java/org/ethereum/serpent/SerpentCompiler.java
+++ b/ethereumj-core/src/main/java/org/ethereum/serpent/SerpentCompiler.java
@@ -81,8 +81,7 @@
             String labelNum = label.split("LABEL_")[1];
 
             labels.put(labelNum, i);
-
-            ++i;
+            --i;
         }
 
         // encode all ref occurrence
