diff --git a/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/bind/annotation/Pipe.java b/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/bind/annotation/Pipe.java
index a1082ac..3e70b60 100644
--- a/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/bind/annotation/Pipe.java
+++ b/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/bind/annotation/Pipe.java
@@ -159,7 +159,7 @@
             } else if (!typeDescription.isPublic()) {
                 throw new IllegalArgumentException(typeDescription + " is mot public");
             }
-            MethodList<?> methodCandidates = typeDescription.getDeclaredMethods().filter(not(isStatic()));
+            MethodList<?> methodCandidates = typeDescription.getDeclaredMethods().filter(isAbstract());
             if (methodCandidates.size() != 1) {
                 throw new IllegalArgumentException(typeDescription + " must declare exactly one non-static method");
             }
