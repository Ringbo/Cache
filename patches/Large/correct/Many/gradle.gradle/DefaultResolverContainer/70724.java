diff --git a/subprojects/core/src/main/groovy/org/gradle/api/internal/artifacts/DefaultResolverContainer.java b/subprojects/core/src/main/groovy/org/gradle/api/internal/artifacts/DefaultResolverContainer.java
index 6f05eed..bb5821a 100644
--- a/subprojects/core/src/main/groovy/org/gradle/api/internal/artifacts/DefaultResolverContainer.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/internal/artifacts/DefaultResolverContainer.java
@@ -73,7 +73,7 @@
     }
 
     public DefaultResolverContainer configure(Closure closure) {
-        return ConfigureUtil.configure(closure, this);
+        return ConfigureUtil.configure(closure, this, false);
     }
     
     public boolean add(DependencyResolver resolver, Closure configureClosure) {
