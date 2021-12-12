diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/agent/builder/AgentBuilderDefaultApplicationRedefineTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/agent/builder/AgentBuilderDefaultApplicationRedefineTest.java
index 945d91f..d9a6d88 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/agent/builder/AgentBuilderDefaultApplicationRedefineTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/agent/builder/AgentBuilderDefaultApplicationRedefineTest.java
@@ -98,7 +98,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = simpleTypeLoader.loadClass(SimpleType.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) BAR));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -122,7 +122,7 @@
         try {
             Class<?> type = optionalTypeLoader.loadClass(SimpleOptionalType.class.getName());
             // The hybrid strategy cannot transform optional types.
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()),
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()),
                     is((Object) (descriptionStrategy == AgentBuilder.DescriptionStrategy.Default.HYBRID ? FOO : BAR)));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
@@ -146,7 +146,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = simpleTypeLoader.loadClass(SimpleType.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) BAR));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -170,7 +170,7 @@
         try {
             Class<?> type = optionalTypeLoader.loadClass(SimpleOptionalType.class.getName());
             // The hybrid strategy cannot transform optional types.
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) (descriptionStrategy == AgentBuilder.DescriptionStrategy.Default.HYBRID
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) (descriptionStrategy == AgentBuilder.DescriptionStrategy.Default.HYBRID
                     ? FOO
                     : BAR)));
         } finally {
