diff --git a/xml/dom-impl/src/com/intellij/util/xml/impl/StaticGenericInfoBuilder.java b/xml/dom-impl/src/com/intellij/util/xml/impl/StaticGenericInfoBuilder.java
index 2aeca7f..e029fe1 100644
--- a/xml/dom-impl/src/com/intellij/util/xml/impl/StaticGenericInfoBuilder.java
+++ b/xml/dom-impl/src/com/intellij/util/xml/impl/StaticGenericInfoBuilder.java
@@ -66,7 +66,7 @@
   public StaticGenericInfoBuilder(final Class aClass) {
     myClass = aClass;
 
-    final Set<JavaMethod> methods = new THashSet<JavaMethod>();
+    final Set<JavaMethod> methods = new LinkedHashSet<JavaMethod>();
     InvocationCache invocationCache = DomApplicationComponent.getInstance().getInvocationCache(myClass);
     for (final Method method : ReflectionCache.getMethods(myClass)) {
       methods.add(invocationCache.getInternedMethod(method));
