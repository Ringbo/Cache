diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/test/utility/JavaVersionRule.java b/byte-buddy-dep/src/test/java/net/bytebuddy/test/utility/JavaVersionRule.java
index fd7ded4..2905b6f 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/test/utility/JavaVersionRule.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/test/utility/JavaVersionRule.java
@@ -22,7 +22,7 @@
     @Override
     public Statement apply(Statement base, FrameworkMethod method, Object target) {
         Enforce enforce = method.getAnnotation(Enforce.class);
-        return enforce == null || ClassFileVersion.forKnownJavaVersion(enforce.value()).compareTo(supportedVersion) < 0
+        return enforce == null || ClassFileVersion.forKnownJavaVersion(enforce.value()).compareTo(supportedVersion) <= 0
                 ? base
                 : new NoOpStatement(enforce.value());
     }
