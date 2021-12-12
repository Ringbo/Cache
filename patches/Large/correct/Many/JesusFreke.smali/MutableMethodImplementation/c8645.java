diff --git a/dexlib2/src/main/java/org/jf/dexlib2/builder/MutableMethodImplementation.java b/dexlib2/src/main/java/org/jf/dexlib2/builder/MutableMethodImplementation.java
index 006b719..4c02e69 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/builder/MutableMethodImplementation.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/builder/MutableMethodImplementation.java
@@ -662,7 +662,7 @@
         return new BuilderInstruction21ih(
                 instruction.getOpcode(),
                 instruction.getRegisterA(),
-                instruction.getHatLiteral());
+                instruction.getNarrowLiteral());
     }
 
     @Nonnull
@@ -670,7 +670,7 @@
         return new BuilderInstruction21lh(
                 instruction.getOpcode(),
                 instruction.getRegisterA(),
-                instruction.getHatLiteral());
+                instruction.getWideLiteral());
     }
 
     @Nonnull
