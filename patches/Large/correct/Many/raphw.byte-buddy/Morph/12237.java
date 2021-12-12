diff --git a/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/bind/annotation/Morph.java b/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/bind/annotation/Morph.java
index 7dc1e85..44820b1 100644
--- a/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/bind/annotation/Morph.java
+++ b/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/bind/annotation/Morph.java
@@ -161,7 +161,7 @@
             } else if (!typeDescription.isPublic()) {
                 throw new IllegalArgumentException(typeDescription + " is mot public");
             }
-            MethodList<?> methodCandidates = typeDescription.getDeclaredMethods().filter(not(isStatic()));
+            MethodList<?> methodCandidates = typeDescription.getDeclaredMethods().filter(isAbstract());
             if (methodCandidates.size() != 1) {
                 throw new IllegalArgumentException(typeDescription + " must declare exactly one non-static method");
             }
