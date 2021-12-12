diff --git a/dexlib2/src/main/java/org/jf/dexlib2/writer/CodeItemPool.java b/dexlib2/src/main/java/org/jf/dexlib2/writer/CodeItemPool.java
index 1a2bb8e..a9fe407 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/writer/CodeItemPool.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/writer/CodeItemPool.java
@@ -479,7 +479,7 @@
     public void writeFormat35c(@Nonnull DexWriter writer, @Nonnull Instruction35c instruction) throws IOException {
         writer.write(instruction.getOpcode().value);
         writer.write(packNibbles(instruction.getRegisterG(), instruction.getRegisterCount()));
-        writer.write(getReferenceIndex(instruction));
+        writer.writeUshort(getReferenceIndex(instruction));
         writer.write(packNibbles(instruction.getRegisterC(), instruction.getRegisterD()));
         writer.write(packNibbles(instruction.getRegisterE(), instruction.getRegisterF()));
     }
@@ -487,7 +487,7 @@
     public void writeFormat3rc(@Nonnull DexWriter writer, @Nonnull Instruction3rc instruction) throws IOException {
         writer.write(instruction.getOpcode().value);
         writer.write(instruction.getRegisterCount());
-        writer.write(getReferenceIndex(instruction));
+        writer.writeUshort(getReferenceIndex(instruction));
         writer.writeUshort(instruction.getStartRegister());
     }
 
