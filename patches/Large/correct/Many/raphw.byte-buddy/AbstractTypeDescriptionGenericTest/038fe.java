diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/description/type/AbstractTypeDescriptionGenericTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/description/type/AbstractTypeDescriptionGenericTest.java
index e79e702..c17a763 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/description/type/AbstractTypeDescriptionGenericTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/description/type/AbstractTypeDescriptionGenericTest.java
@@ -780,7 +780,9 @@
         // The toString implementation for parameterized types was changed within the Java 8 version range.
         assertThat(typeDescription.getTypeName(), CoreMatchers.anyOf(
                 is(NestedTypeVariableType.class.getDeclaredField(FOO).getGenericType().toString()),
-                is("net.bytebuddy.description.type.AbstractTypeDescriptionGenericTest$NestedTypeVariableType<T>$Placeholder")));
+                is("net.bytebuddy.description.type.AbstractTypeDescriptionGenericTest$NestedTypeVariableType<T>$Placeholder"),
+                is("net.bytebuddy.description.type.AbstractTypeDescriptionGenericTest" +
+                        ".net.bytebuddy.description.type.AbstractTypeDescriptionGenericTest$NestedTypeVariableType<T>.Placeholder")));
         assertThat(typeDescription.getSort(), is(TypeDefinition.Sort.PARAMETERIZED));
         assertThat(typeDescription.getStackSize(), is(StackSize.SINGLE));
         assertThat(typeDescription.getTypeArguments().size(), is(0));
@@ -798,7 +800,9 @@
         // The toString implementation for parameterized types was changed within the Java 8 version range.
         assertThat(typeDescription.getTypeName(), CoreMatchers.anyOf(
                 is(NestedSpecifiedTypeVariableType.class.getDeclaredField(FOO).getGenericType().toString()),
-                is("net.bytebuddy.description.type.AbstractTypeDescriptionGenericTest$NestedSpecifiedTypeVariableType<java.lang.String>$Placeholder")));
+                is("net.bytebuddy.description.type.AbstractTypeDescriptionGenericTest$NestedSpecifiedTypeVariableType<java.lang.String>$Placeholder"),
+                is("net.bytebuddy.description.type.AbstractTypeDescriptionGenericTest" +
+                        ".net.bytebuddy.description.type.AbstractTypeDescriptionGenericTest$NestedSpecifiedTypeVariableType<java.lang.String>.Placeholder")));
         assertThat(typeDescription.getSort(), is(TypeDefinition.Sort.PARAMETERIZED));
         assertThat(typeDescription.getStackSize(), is(StackSize.SINGLE));
         assertThat(typeDescription.getTypeArguments().size(), is(0));
@@ -816,7 +820,9 @@
         // The toString implementation for parameterized types was changed within the Java 8 version range.
         assertThat(typeDescription.getTypeName(), CoreMatchers.anyOf(
                 is(NestedStaticTypeVariableType.class.getDeclaredField(FOO).getGenericType().toString()),
-                is("net.bytebuddy.description.type.AbstractTypeDescriptionGenericTest$NestedStaticTypeVariableType$Placeholder<java.lang.String>")));
+                is("net.bytebuddy.description.type.AbstractTypeDescriptionGenericTest$NestedStaticTypeVariableType$Placeholder<java.lang.String>"),
+                is("net.bytebuddy.description.type.AbstractTypeDescriptionGenericTest$NestedStaticTypeVariableType" +
+                        ".net.bytebuddy.description.type.AbstractTypeDescriptionGenericTest$NestedStaticTypeVariableType$Placeholder<java.lang.String>")));
         assertThat(typeDescription.getSort(), is(TypeDefinition.Sort.PARAMETERIZED));
         assertThat(typeDescription.getStackSize(), is(StackSize.SINGLE));
         assertThat(typeDescription.getTypeArguments().size(), is(1));
