diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/ByteBuddyTutorialExamplesTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/ByteBuddyTutorialExamplesTest.java
index 74715c1..a0ebf05 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/ByteBuddyTutorialExamplesTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/ByteBuddyTutorialExamplesTest.java
@@ -79,7 +79,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(dynamicType.getConstructor().newInstance().toString(), is("Hello World!"));
+        assertThat(dynamicType.getDeclaredConstructor().newInstance().toString(), is("Hello World!"));
     }
 
     @Test
@@ -92,7 +92,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(dynamicType.getConstructor().newInstance().apply("Byte Buddy"), is((Object) "Hello from Byte Buddy"));
+        assertThat(dynamicType.getDeclaredConstructor().newInstance().apply("Byte Buddy"), is((Object) "Hello from Byte Buddy"));
     }
 
     @Test
@@ -181,7 +181,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .toString();
         assertThat(toString, startsWith("example.Type"));
@@ -204,7 +204,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance();
         assertThat(foo.bar(), is("Hello World!"));
         assertThat(foo.foo(), is("Hello Foo!"));
@@ -227,7 +227,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .hello("World");
         assertThat(helloWorld, is("Hello World!"));
@@ -241,7 +241,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .hello("World");
         assertThat(helloWorld, is("Hello World!"));
@@ -255,7 +255,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance();
         assertThat(loggingDatabase.load("qux"), is(Arrays.asList("qux: foo", "qux: bar")));
     }
@@ -277,7 +277,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance();
         Method method = instance.getClass().getMethod("foo");
         assertThat(method.invoke(instance), is((Object) "foo"));
@@ -305,7 +305,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance();
         assertThat(loggingDatabase.load("qux"), is(Arrays.asList("qux (logged access): foo", "qux (logged access): bar")));
     }
@@ -318,7 +318,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance();
         assertThat(trivialGetterBean.loop(42), is(42));
         assertThat(trivialGetterBean.loop("foo"), is("foo"));
@@ -335,7 +335,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance();
         assertThat(loggingDatabase.load("qux"), is(Arrays.asList("qux: foo", "qux: bar")));
     }
@@ -356,7 +356,7 @@
                 .make()
                 .load(dynamicUserType.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance();
         UserType userType = (UserType) factory.makeInstance();
         ((InterceptionAccessor) userType).setInterceptor(new HelloWorldInterceptor());
@@ -398,7 +398,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .calculate(), is(60));
     }
@@ -412,7 +412,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .toString(), is("42"));
     }
@@ -427,7 +427,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .toString(), is("Hello!"));
     }
