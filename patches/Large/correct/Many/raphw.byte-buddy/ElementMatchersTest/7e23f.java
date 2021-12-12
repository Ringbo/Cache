diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/matcher/ElementMatchersTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/matcher/ElementMatchersTest.java
index 77491b8..a129157 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/matcher/ElementMatchersTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/matcher/ElementMatchersTest.java
@@ -140,7 +140,7 @@
         assertThat(ElementMatchers.is(field).matches(fieldDescription), is(true));
         assertThat(ElementMatchers.definedField(ElementMatchers.is(fieldDescription.asDefined())).matches(fieldDescription), is(true));
         assertThat(ElementMatchers.is(fieldDescription.asDefined()).matches(fieldDescription.asDefined()), is(true));
-        assertThat(ElementMatchers.is(fieldDescription.asDefined()).matches(fieldDescription), is(false));
+        assertThat(ElementMatchers.is(fieldDescription.asDefined()).matches(fieldDescription), is(true));
         assertThat(ElementMatchers.is(fieldDescription).matches(fieldDescription.asDefined()), is(false));
     }
 
@@ -164,7 +164,7 @@
         assertThat(ElementMatchers.is(method).matches(methodDescription), is(true));
         assertThat(ElementMatchers.definedMethod(ElementMatchers.is(methodDescription.asDefined())).matches(methodDescription), is(true));
         assertThat(ElementMatchers.is(methodDescription.asDefined()).matches(methodDescription.asDefined()), is(true));
-        assertThat(ElementMatchers.is(methodDescription.asDefined()).matches(methodDescription), is(false));
+        assertThat(ElementMatchers.is(methodDescription.asDefined()).matches(methodDescription), is(true));
         assertThat(ElementMatchers.is(methodDescription).matches(methodDescription.asDefined()), is(false));
     }
 
@@ -176,7 +176,7 @@
         assertThat(ElementMatchers.is(constructor).matches(methodDescription), is(true));
         assertThat(ElementMatchers.definedMethod(ElementMatchers.is(methodDescription.asDefined())).matches(methodDescription), is(true));
         assertThat(ElementMatchers.is(methodDescription.asDefined()).matches(methodDescription.asDefined()), is(true));
-        assertThat(ElementMatchers.is(methodDescription.asDefined()).matches(methodDescription), is(false));
+        assertThat(ElementMatchers.is(methodDescription.asDefined()).matches(methodDescription), is(true));
         assertThat(ElementMatchers.is(methodDescription).matches(methodDescription.asDefined()), is(false));
     }
 
@@ -186,7 +186,7 @@
                 .getDeclaredMethods().filter(named(FOO)).getOnly().getParameters().getOnly();
         assertThat(ElementMatchers.definedParameter(ElementMatchers.is(parameterDescription.asDefined())).matches(parameterDescription), is(true));
         assertThat(ElementMatchers.is(parameterDescription.asDefined()).matches(parameterDescription.asDefined()), is(true));
-        assertThat(ElementMatchers.is(parameterDescription.asDefined()).matches(parameterDescription), is(false));
+        assertThat(ElementMatchers.is(parameterDescription.asDefined()).matches(parameterDescription), is(true));
         assertThat(ElementMatchers.is(parameterDescription).matches(parameterDescription.asDefined()), is(false));
     }
 
