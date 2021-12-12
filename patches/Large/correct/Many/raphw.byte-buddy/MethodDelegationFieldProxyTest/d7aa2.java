diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationFieldProxyTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationFieldProxyTest.java
index 903a824..15c076e 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationFieldProxyTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationFieldProxyTest.java
@@ -24,7 +24,7 @@
     public void testExplicitFieldAccess() throws Exception {
         DynamicType.Loaded<Explicit> loaded = implement(Explicit.class, MethodDelegation.to(Swap.class)
                 .appendParameterBinder(FieldProxy.Binder.install(Get.class, Set.class)));
-        Explicit explicit = loaded.getLoaded().getConstructor().newInstance();
+        Explicit explicit = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(explicit.foo, is(FOO));
         explicit.swap();
         assertThat(explicit.foo, is(FOO + BAR));
@@ -34,7 +34,7 @@
     public void testExplicitFieldAccessSerializable() throws Exception {
         DynamicType.Loaded<Explicit> loaded = implement(Explicit.class, MethodDelegation.to(SwapSerializable.class)
                 .appendParameterBinder(FieldProxy.Binder.install(Get.class, Set.class)));
-        Explicit explicit = loaded.getLoaded().getConstructor().newInstance();
+        Explicit explicit = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(explicit.foo, is(FOO));
         explicit.swap();
         assertThat(explicit.foo, is(FOO + BAR));
@@ -44,7 +44,7 @@
     public void testExplicitFieldAccessStatic() throws Exception {
         DynamicType.Loaded<ExplicitStatic> loaded = implement(ExplicitStatic.class, MethodDelegation.to(Swap.class)
                 .appendParameterBinder(FieldProxy.Binder.install(Get.class, Set.class)));
-        ExplicitStatic explicit = loaded.getLoaded().getConstructor().newInstance();
+        ExplicitStatic explicit = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(ExplicitStatic.foo, is(FOO));
         explicit.swap();
         assertThat(ExplicitStatic.foo, is(FOO + BAR));
@@ -54,7 +54,7 @@
     public void testImplicitFieldGetterAccess() throws Exception {
         DynamicType.Loaded<ImplicitGetter> loaded = implement(ImplicitGetter.class, MethodDelegation.to(GetInterceptor.class)
                 .appendParameterBinder(FieldProxy.Binder.install(Get.class, Set.class)));
-        ImplicitGetter implicitGetter = loaded.getLoaded().getConstructor().newInstance();
+        ImplicitGetter implicitGetter = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(implicitGetter.foo, is(FOO));
         assertThat(implicitGetter.getFoo(), is(FOO + BAR));
         assertThat(implicitGetter.foo, is(FOO + BAR));
@@ -64,7 +64,7 @@
     public void testImplicitFieldSetterAccess() throws Exception {
         DynamicType.Loaded<ImplicitSetter> loaded = implement(ImplicitSetter.class, MethodDelegation.to(SetInterceptor.class)
                 .appendParameterBinder(FieldProxy.Binder.install(Get.class, Set.class)));
-        ImplicitSetter implicitSetter = loaded.getLoaded().getConstructor().newInstance();
+        ImplicitSetter implicitSetter = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(implicitSetter.foo, is(FOO));
         implicitSetter.setFoo(BAR);
         assertThat(implicitSetter.foo, is(FOO + BAR));
@@ -74,7 +74,7 @@
     public void testExplicitFieldAccessImplicitTarget() throws Exception {
         DynamicType.Loaded<ExplicitInherited> loaded = implement(ExplicitInherited.class, MethodDelegation.to(Swap.class)
                 .appendParameterBinder(FieldProxy.Binder.install(Get.class, Set.class)));
-        ExplicitInherited explicitInherited = loaded.getLoaded().getConstructor().newInstance();
+        ExplicitInherited explicitInherited = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(((Explicit) explicitInherited).foo, is(FOO));
         assertThat(explicitInherited.foo, is(QUX));
         explicitInherited.swap();
@@ -86,7 +86,7 @@
     public void testExplicitFieldAccessExplicitTarget() throws Exception {
         DynamicType.Loaded<ExplicitInherited> loaded = implement(ExplicitInherited.class, MethodDelegation.to(SwapInherited.class)
                 .appendParameterBinder(FieldProxy.Binder.install(Get.class, Set.class)));
-        ExplicitInherited explicitInherited = loaded.getLoaded().getConstructor().newInstance();
+        ExplicitInherited explicitInherited = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(((Explicit) explicitInherited).foo, is(FOO));
         assertThat(explicitInherited.foo, is(QUX));
         explicitInherited.swap();
@@ -98,7 +98,7 @@
     public void testIncompatibleGetterTypeThrowsException() throws Exception {
         DynamicType.Loaded<Explicit> loaded = implement(Explicit.class, MethodDelegation.to(GetterIncompatible.class)
                 .appendParameterBinder(FieldProxy.Binder.install(Get.class, Set.class)));
-        Explicit explicit = loaded.getLoaded().getConstructor().newInstance();
+        Explicit explicit = loaded.getLoaded().getDeclaredConstructor().newInstance();
         explicit.swap();
     }
 
@@ -106,7 +106,7 @@
     public void testIncompatibleSetterTypeThrowsException() throws Exception {
         DynamicType.Loaded<Explicit> loaded = implement(Explicit.class, MethodDelegation.to(SetterIncompatible.class)
                 .appendParameterBinder(FieldProxy.Binder.install(Get.class, Set.class)));
-        Explicit explicit = loaded.getLoaded().getConstructor().newInstance();
+        Explicit explicit = loaded.getLoaded().getDeclaredConstructor().newInstance();
         explicit.swap();
     }
 
