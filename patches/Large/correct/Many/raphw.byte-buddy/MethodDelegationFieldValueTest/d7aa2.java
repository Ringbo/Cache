diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationFieldValueTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationFieldValueTest.java
index 5e95def..fa7fec0 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationFieldValueTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationFieldValueTest.java
@@ -15,7 +15,7 @@
     @Test
     public void testLegalFieldAccess() throws Exception {
         DynamicType.Loaded<SimpleField> loaded = implement(SimpleField.class, MethodDelegation.to(SimpleInterceptor.class));
-        SimpleField instance = loaded.getLoaded().getConstructor().newInstance();
+        SimpleField instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         instance.foo = FOO;
         assertThat(instance.foo(), is((Object) FOO));
         instance.foo = BAR;
@@ -25,7 +25,7 @@
     @Test
     public void testLegalFieldAccessStatic() throws Exception {
         DynamicType.Loaded<SimpleStaticField> loaded = implement(SimpleStaticField.class, MethodDelegation.to(SimpleInterceptor.class));
-        SimpleStaticField instance = loaded.getLoaded().getConstructor().newInstance();
+        SimpleStaticField instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         SimpleStaticField.foo = FOO;
         assertThat(instance.foo(), is((Object) FOO));
         SimpleStaticField.foo = BAR;
@@ -40,7 +40,7 @@
     @Test
     public void testLegalFieldAccessDynamicTyping() throws Exception {
         DynamicType.Loaded<SimpleStaticField> loaded = implement(SimpleStaticField.class, MethodDelegation.to(DynamicInterceptor.class));
-        SimpleStaticField instance = loaded.getLoaded().getConstructor().newInstance();
+        SimpleStaticField instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         SimpleStaticField.foo = FOO;
         assertThat(instance.foo(), is((Object) FOO));
         SimpleStaticField.foo = BAR;
@@ -50,7 +50,7 @@
     @Test
     public void testExtendedFieldMostSpecific() throws Exception {
         DynamicType.Loaded<ExtendedField> loaded = implement(ExtendedField.class, MethodDelegation.to(SimpleInterceptor.class));
-        ExtendedField instance = loaded.getLoaded().getConstructor().newInstance();
+        ExtendedField instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         instance.foo = FOO;
         assertThat(instance.foo(), is((Object) FOO));
         instance.foo = BAR;
@@ -60,7 +60,7 @@
     @Test
     public void testExtendedFieldSkipsNonVisible() throws Exception {
         DynamicType.Loaded<ExtendedPrivateField> loaded = implement(ExtendedPrivateField.class, MethodDelegation.to(SimpleInterceptor.class));
-        SimpleField instance = loaded.getLoaded().getConstructor().newInstance();
+        SimpleField instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         instance.foo = FOO;
         assertThat(instance.foo(), is((Object) FOO));
         instance.foo = BAR;
@@ -70,7 +70,7 @@
     @Test
     public void testExtendedFieldExplicitType() throws Exception {
         DynamicType.Loaded<ExtendedField> loaded = implement(ExtendedField.class, MethodDelegation.to(ExplicitInterceptor.class));
-        SimpleField instance = loaded.getLoaded().getConstructor().newInstance();
+        SimpleField instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         instance.foo = FOO;
         assertThat(instance.foo(), is((Object) FOO));
         instance.foo = BAR;
@@ -80,7 +80,7 @@
     @Test
     public void testAccessor() throws Exception {
         DynamicType.Loaded<SimpleFieldAccessor> loaded = implement(SimpleFieldAccessor.class, MethodDelegation.to(SimpleAccessorInterceptor.class));
-        SimpleFieldAccessor instance = loaded.getLoaded().getConstructor().newInstance();
+        SimpleFieldAccessor instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         instance.foo = FOO;
         assertThat(instance.getFoo(), is((Object) FOO));
         instance.foo = BAR;
