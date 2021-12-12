diff --git a/source/com/intellij/packageDependencies/ui/ModuleGroupNode.java b/source/com/intellij/packageDependencies/ui/ModuleGroupNode.java
index 931d64e..7266bef 100644
--- a/source/com/intellij/packageDependencies/ui/ModuleGroupNode.java
+++ b/source/com/intellij/packageDependencies/ui/ModuleGroupNode.java
@@ -52,7 +52,7 @@
   }
 
   public int getWeight() {
-    return 1;
+    return 0;
   }
 
   public boolean equals(Object o) {
