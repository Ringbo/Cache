diff --git a/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/bind/annotation/FieldProxy.java b/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/bind/annotation/FieldProxy.java
index 891dde4..4e39fb7 100644
--- a/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/bind/annotation/FieldProxy.java
+++ b/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/bind/annotation/FieldProxy.java
@@ -199,7 +199,7 @@
             } else if (!typeDescription.isPublic()) {
                 throw new IllegalArgumentException(typeDescription + " is mot public");
             }
-            MethodList<?> methodCandidates = typeDescription.getDeclaredMethods().filter(not(isStatic()));
+            MethodList<?> methodCandidates = typeDescription.getDeclaredMethods().filter(isAbstract());
             if (methodCandidates.size() != 1) {
                 throw new IllegalArgumentException(typeDescription + " must declare exactly one non-static method");
             }
