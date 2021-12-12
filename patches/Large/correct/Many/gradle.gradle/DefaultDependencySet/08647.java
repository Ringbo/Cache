diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/DefaultDependencySet.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/DefaultDependencySet.java
index 6ca2347..7733712 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/DefaultDependencySet.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/DefaultDependencySet.java
@@ -60,7 +60,7 @@
             Set<Class<?>> interfaces = collectInterfaces(o.getClass(), new HashSet<Class<?>>());
             interfaces.add(MutationValidatingDependency.class);
             final ModuleDependency mutationValidatingModule = (ModuleDependency) Proxy.newProxyInstance(
-                o.getClass().getClassLoader(),
+                this.getClass().getClassLoader(),
                 interfaces.toArray(new Class<?>[interfaces.size()]),
                 new InvocationHandler() {
                     @Override
