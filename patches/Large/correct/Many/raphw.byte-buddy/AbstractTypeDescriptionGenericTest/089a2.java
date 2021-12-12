diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/description/type/AbstractTypeDescriptionGenericTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/description/type/AbstractTypeDescriptionGenericTest.java
index 6fe7a8b..e79e702 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/description/type/AbstractTypeDescriptionGenericTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/description/type/AbstractTypeDescriptionGenericTest.java
@@ -1971,7 +1971,9 @@
 
         public static Field make() throws IOException, ClassNotFoundException, NoSuchFieldException {
             ClassReader classReader = new ClassReader(InconsistentGenerics.class.getName());
-            ClassWriter classWriter = new ClassWriter(classReader, ClassWriter.COMPUTE_MAXS);
+            ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
+            // TODO: Requires fix in ASM - https://gitlab.ow2.org/asm/asm/issues/317833
+//            ClassWriter classWriter = new ClassWriter(classReader, ClassWriter.COMPUTE_MAXS);
             classReader.accept(new GenericDisintegrator(classWriter), 0);
             return new ByteArrayClassLoader(ClassLoadingStrategy.BOOTSTRAP_LOADER,
                     Collections.singletonMap(InconsistentGenerics.class.getName(), classWriter.toByteArray()),
