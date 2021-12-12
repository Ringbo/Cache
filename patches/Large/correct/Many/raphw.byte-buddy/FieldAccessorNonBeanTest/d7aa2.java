diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FieldAccessorNonBeanTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FieldAccessorNonBeanTest.java
index fc91fa8..9e51938 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FieldAccessorNonBeanTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FieldAccessorNonBeanTest.java
@@ -20,7 +20,7 @@
     @Test
     public void testExplicitNameSetter() throws Exception {
         DynamicType.Loaded<SampleSetter> loaded = implement(SampleSetter.class, FieldAccessor.ofField(FOO));
-        SampleSetter sampleSetter = loaded.getLoaded().getConstructor().newInstance();
+        SampleSetter sampleSetter = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Field field = SampleSetter.class.getDeclaredField(FOO);
         field.setAccessible(true);
         assertThat(field.get(sampleSetter), is((Object) STRING_DEFAULT_VALUE));
@@ -32,7 +32,7 @@
     @Test
     public void testExplicitNameGetter() throws Exception {
         DynamicType.Loaded<SampleGetter> loaded = implement(SampleGetter.class, FieldAccessor.ofField(FOO));
-        SampleGetter sampleGetter = loaded.getLoaded().getConstructor().newInstance();
+        SampleGetter sampleGetter = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Field field = SampleGetter.class.getDeclaredField(FOO);
         field.setAccessible(true);
         assertThat(field.get(sampleGetter), is((Object) STRING_VALUE));
