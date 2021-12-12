diff --git a/core/src/main/java/com/graphhopper/util/Instruction.java b/core/src/main/java/com/graphhopper/util/Instruction.java
index 6c4649a..da4e2da 100644
--- a/core/src/main/java/com/graphhopper/util/Instruction.java
+++ b/core/src/main/java/com/graphhopper/util/Instruction.java
@@ -232,7 +232,7 @@
             throw new IllegalStateException("Instruction must contain at least one point " + toString());
     }
 
-    String getTurnDescription( Translation tr )
+    public String getTurnDescription( Translation tr )
     {
         String str;
         String n = getName();
