diff --git a/subprojects/core/src/main/java/org/gradle/api/internal/AbstractNamedDomainObjectContainer.java b/subprojects/core/src/main/java/org/gradle/api/internal/AbstractNamedDomainObjectContainer.java
index 23fcad2..232e03d 100644
--- a/subprojects/core/src/main/java/org/gradle/api/internal/AbstractNamedDomainObjectContainer.java
+++ b/subprojects/core/src/main/java/org/gradle/api/internal/AbstractNamedDomainObjectContainer.java
@@ -71,7 +71,7 @@
 
     public AbstractNamedDomainObjectContainer<T> configure(Closure configureClosure) {
         ConfigureDelegate delegate = createConfigureDelegate(configureClosure);
-        ConfigureUtil.configureSelf(configureClosure, delegate, delegate);
+        ConfigureUtil.configureSelf(configureClosure, this, delegate);
         return this;
     }
 
