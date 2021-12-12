diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/description/method/MethodDescriptionTokenTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/description/method/MethodDescriptionTokenTest.java
index 739c513..015e7ec 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/description/method/MethodDescriptionTokenTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/description/method/MethodDescriptionTokenTest.java
@@ -120,7 +120,7 @@
                 not(new MethodDescription.Token(FOO,
                         MODIFIERS,
                         Collections.singletonList(mock(GenericTypeDescription.class)),
-                        second,
+                        first,
                         Collections.singletonList(secondParameter),
                         Collections.singletonList(mock(GenericTypeDescription.class)),
                         Collections.singletonList(mock(AnnotationDescription.class)),
@@ -140,7 +140,7 @@
                 not(new MethodDescription.Token(FOO,
                         MODIFIERS,
                         Collections.singletonList(mock(GenericTypeDescription.class)),
-                        second,
+                        first,
                         Collections.<ParameterDescription.Token>emptyList(),
                         Collections.singletonList(mock(GenericTypeDescription.class)),
                         Collections.singletonList(mock(AnnotationDescription.class)),
