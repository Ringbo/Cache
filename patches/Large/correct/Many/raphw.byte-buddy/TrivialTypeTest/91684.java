diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/auxiliary/TrivialTypeTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/auxiliary/TrivialTypeTest.java
index 6906e8b..2cc559d 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/auxiliary/TrivialTypeTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/auxiliary/TrivialTypeTest.java
@@ -29,7 +29,7 @@
 
     @Test
     public void testCreation() throws Exception {
-        when(classFileVersion.getVersion()).thenReturn(ClassFileVersion.JAVA_V5.getJavaVersion());
+        when(classFileVersion.getVersion()).thenReturn(ClassFileVersion.JAVA_V5.getVersion());
         DynamicType dynamicType = TrivialType.INSTANCE.make(FOO, classFileVersion, methodAccessorFactory);
         assertThat(dynamicType.getTypeDescription().getName(), is(FOO));
         assertThat(dynamicType.getTypeDescription().getModifiers(), is(Opcodes.ACC_SYNTHETIC));
