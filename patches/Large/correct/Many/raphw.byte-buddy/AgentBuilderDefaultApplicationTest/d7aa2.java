diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/agent/builder/AgentBuilderDefaultApplicationTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/agent/builder/AgentBuilderDefaultApplicationTest.java
index 1744825..7e2d25f 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/agent/builder/AgentBuilderDefaultApplicationTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/agent/builder/AgentBuilderDefaultApplicationTest.java
@@ -133,7 +133,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(Foo.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) BAR));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -151,7 +151,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(Bar.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) BAR));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -169,7 +169,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(Qux.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) (FOO + BAR)));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) (FOO + BAR)));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -187,7 +187,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(QuxBaz.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) (FOO + BAR)));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) (FOO + BAR)));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -207,7 +207,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(Baz.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) BAR));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
             assertThat(type.getDeclaredMethod(QUX + FOO), notNullValue(Method.class));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
@@ -232,7 +232,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(SimpleType.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) BAR));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -269,7 +269,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(SimpleType.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) BAR));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -307,7 +307,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(SimpleType.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) BAR));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -332,7 +332,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(SimpleType.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) BAR));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -357,7 +357,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(SimpleType.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) BAR));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -381,7 +381,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(SimpleType.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) BAR));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -418,7 +418,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(SimpleType.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) BAR));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -450,7 +450,7 @@
         ClassFileTransformer secondTransformer = agentBuilder.installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(Qux.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) (FOO + BAR + BAR)));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) (FOO + BAR + BAR)));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(firstTransformer);
             ByteBuddyAgent.getInstrumentation().removeTransformer(secondTransformer);
@@ -470,7 +470,7 @@
         try {
             Class<?> type = classLoader.loadClass(Foo.class.getName());
             assertThat(type.getDeclaredConstructors().length, is(2));
-            assertThat(type.getConstructor().newInstance(), notNullValue(Object.class));
+            assertThat(type.getDeclaredConstructor().newInstance(), notNullValue(Object.class));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -489,7 +489,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(Foo.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) (FOO + BAR + QUX)));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) (FOO + BAR + QUX)));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -508,7 +508,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(Foo.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) (FOO + BAR + QUX)));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) (FOO + BAR + QUX)));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -527,7 +527,7 @@
                 .installOnByteBuddyAgent();
         try {
             Class<?> type = classLoader.loadClass(Foo.class.getName());
-            assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) (FOO + QUX)));
+            assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) (FOO + QUX)));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
         }
@@ -549,7 +549,7 @@
         try {
             Class<?> sampleFactory = classLoader.loadClass(LAMBDA_SAMPLE_FACTORY);
             @SuppressWarnings("unchecked")
-            Callable<String> instance = (Callable<String>) sampleFactory.getDeclaredMethod("nonCapturing").invoke(sampleFactory.getConstructor().newInstance());
+            Callable<String> instance = (Callable<String>) sampleFactory.getDeclaredMethod("nonCapturing").invoke(sampleFactory.getDeclaredConstructor().newInstance());
             assertThat(instance.call(), is(BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
@@ -572,8 +572,8 @@
                 .installOn(ByteBuddyAgent.getInstrumentation());
         try {
             Class<?> sampleFactory = classLoader.loadClass(LAMBDA_SAMPLE_FACTORY);
-            assertThat(sampleFactory.getDeclaredMethod("nonCapturing").invoke(sampleFactory.getConstructor().newInstance()),
-                    sameInstance(sampleFactory.getDeclaredMethod("nonCapturing").invoke(sampleFactory.getConstructor().newInstance())));
+            assertThat(sampleFactory.getDeclaredMethod("nonCapturing").invoke(sampleFactory.getDeclaredConstructor().newInstance()),
+                    sameInstance(sampleFactory.getDeclaredMethod("nonCapturing").invoke(sampleFactory.getDeclaredConstructor().newInstance())));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
             AgentBuilder.LambdaInstrumentationStrategy.release(classFileTransformer, ByteBuddyAgent.getInstrumentation());
@@ -596,7 +596,7 @@
         AgentBuilder.LambdaInstrumentationStrategy.release(classFileTransformer, ByteBuddyAgent.getInstrumentation());
         Class<?> sampleFactory = classLoader.loadClass(LAMBDA_SAMPLE_FACTORY);
         @SuppressWarnings("unchecked")
-        Callable<String> instance = (Callable<String>) sampleFactory.getDeclaredMethod("nonCapturing").invoke(sampleFactory.getConstructor().newInstance());
+        Callable<String> instance = (Callable<String>) sampleFactory.getDeclaredMethod("nonCapturing").invoke(sampleFactory.getDeclaredConstructor().newInstance());
         assertThat(instance.call(), is(FOO));
     }
 
@@ -616,7 +616,7 @@
         try {
             Class<?> sampleFactory = classLoader.loadClass(LAMBDA_SAMPLE_FACTORY);
             @SuppressWarnings("unchecked")
-            Callable<String> instance = (Callable<String>) sampleFactory.getDeclaredMethod("argumentCapturing", String.class).invoke(sampleFactory.getConstructor().newInstance(), FOO);
+            Callable<String> instance = (Callable<String>) sampleFactory.getDeclaredMethod("argumentCapturing", String.class).invoke(sampleFactory.getDeclaredConstructor().newInstance(), FOO);
             assertThat(instance.call(), is(BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
@@ -639,8 +639,8 @@
                 .installOn(ByteBuddyAgent.getInstrumentation());
         try {
             Class<?> sampleFactory = classLoader.loadClass(LAMBDA_SAMPLE_FACTORY);
-            assertThat(sampleFactory.getDeclaredMethod("argumentCapturing", String.class).invoke(sampleFactory.getConstructor().newInstance(), FOO),
-                    not(sameInstance(sampleFactory.getDeclaredMethod("argumentCapturing", String.class).invoke(sampleFactory.getConstructor().newInstance(), FOO))));
+            assertThat(sampleFactory.getDeclaredMethod("argumentCapturing", String.class).invoke(sampleFactory.getDeclaredConstructor().newInstance(), FOO),
+                    not(sameInstance(sampleFactory.getDeclaredMethod("argumentCapturing", String.class).invoke(sampleFactory.getDeclaredConstructor().newInstance(), FOO))));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
             AgentBuilder.LambdaInstrumentationStrategy.release(classFileTransformer, ByteBuddyAgent.getInstrumentation());
@@ -663,7 +663,7 @@
         try {
             Class<?> sampleFactory = classLoader.loadClass(LAMBDA_SAMPLE_FACTORY);
             @SuppressWarnings("unchecked")
-            Callable<String> instance = (Callable<String>) sampleFactory.getDeclaredMethod("instanceCapturing").invoke(sampleFactory.getConstructor().newInstance());
+            Callable<String> instance = (Callable<String>) sampleFactory.getDeclaredMethod("instanceCapturing").invoke(sampleFactory.getDeclaredConstructor().newInstance());
             assertThat(instance.call(), is(BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
@@ -686,7 +686,7 @@
                 .installOn(ByteBuddyAgent.getInstrumentation());
         try {
             Class<?> sampleFactory = classLoader.loadClass(LAMBDA_SAMPLE_FACTORY);
-            Object instance = sampleFactory.getDeclaredMethod("nonCapturingWithArguments").invoke(sampleFactory.getConstructor().newInstance());
+            Object instance = sampleFactory.getDeclaredMethod("nonCapturingWithArguments").invoke(sampleFactory.getDeclaredConstructor().newInstance());
             assertThat(instance.getClass().getMethod("apply", Object.class).invoke(instance, FOO), is((Object) BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
@@ -709,7 +709,7 @@
                 .installOn(ByteBuddyAgent.getInstrumentation());
         try {
             Class<?> sampleFactory = classLoader.loadClass(LAMBDA_SAMPLE_FACTORY);
-            Object instance = sampleFactory.getDeclaredMethod("capturingWithArguments", String.class).invoke(sampleFactory.getConstructor().newInstance(), FOO);
+            Object instance = sampleFactory.getDeclaredMethod("capturingWithArguments", String.class).invoke(sampleFactory.getDeclaredConstructor().newInstance(), FOO);
             assertThat(instance.getClass().getMethod("apply", Object.class).invoke(instance, FOO), is((Object) BAR));
         } finally {
             ByteBuddyAgent.getInstrumentation().removeTransformer(classFileTransformer);
@@ -732,7 +732,7 @@
         try {
             Class<?> sampleFactory = classLoader.loadClass(LAMBDA_SAMPLE_FACTORY);
             @SuppressWarnings("unchecked")
-            Callable<String> instance = (Callable<String>) sampleFactory.getDeclaredMethod("serializable", String.class).invoke(sampleFactory.getConstructor().newInstance(), FOO);
+            Callable<String> instance = (Callable<String>) sampleFactory.getDeclaredMethod("serializable", String.class).invoke(sampleFactory.getDeclaredConstructor().newInstance(), FOO);
             assertThat(instance.call(), is(FOO));
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
