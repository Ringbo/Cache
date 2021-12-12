diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/distribution/internal/DefaultDistributionContainer.java b/subprojects/plugins/src/main/groovy/org/gradle/api/distribution/internal/DefaultDistributionContainer.java
index b1f7d5b..182d10e 100644
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/distribution/internal/DefaultDistributionContainer.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/distribution/internal/DefaultDistributionContainer.java
@@ -35,6 +35,6 @@
     }
 
     protected Distribution doCreate(String name) {
-        return getInstantiator().newInstance(DefaultDistribution.class, fileResolver);
+        return getInstantiator().newInstance(DefaultDistribution.class, name, fileResolver);
     }
 }
