diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceTypeTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceTypeTest.java
index 61848cd..555dc27 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceTypeTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceTypeTest.java
@@ -105,7 +105,9 @@
 
         @Advice.OnMethodExit
         public static boolean exit(@Advice.Return boolean result, @Advice.Enter boolean enter, @Advice.Thrown Throwable throwable) {
-            if (result == exception || !enter || (exception ? throwable instanceof RuntimeException : throwable == null)) {
+            if (result == exception
+                    || !enter
+                    || !(exception ? throwable instanceof RuntimeException : throwable == null)) {
                 throw new AssertionError();
             }
             exit++;
@@ -136,7 +138,9 @@
 
         @Advice.OnMethodExit
         public static byte exit(@Advice.Return byte result, @Advice.Enter byte enter, @Advice.Thrown Throwable throwable) {
-            if (result != (exception ? 0 : VALUE) || enter != VALUE * 2 || (exception ? throwable instanceof RuntimeException : throwable == null)) {
+            if (result != (exception ? 0 : VALUE)
+                    || enter != VALUE * 2
+                    || !(exception ? throwable instanceof RuntimeException : throwable == null)) {
                 throw new AssertionError();
             }
             exit++;
@@ -167,7 +171,9 @@
 
         @Advice.OnMethodExit
         public static short exit(@Advice.Return short result, @Advice.Enter short enter, @Advice.Thrown Throwable throwable) {
-            if (result != (exception ? 0 : VALUE) || enter != VALUE * 2 || (exception ? throwable instanceof RuntimeException : throwable == null)) {
+            if (result != (exception ? 0 : VALUE)
+                    || enter != VALUE * 2
+                    || !(exception ? throwable instanceof RuntimeException : throwable == null)) {
                 throw new AssertionError();
             }
             exit++;
@@ -198,7 +204,9 @@
 
         @Advice.OnMethodExit
         public static char exit(@Advice.Return char result, @Advice.Enter char enter, @Advice.Thrown Throwable throwable) {
-            if (result != (exception ? 0 : VALUE) || enter != VALUE * 2 || (exception ? throwable instanceof RuntimeException : throwable == null)) {
+            if (result != (exception ? 0 : VALUE)
+                    || enter != VALUE * 2
+                    || !(exception ? throwable instanceof RuntimeException : throwable == null)) {
                 throw new AssertionError();
             }
             exit++;
@@ -229,7 +237,9 @@
 
         @Advice.OnMethodExit
         public static int exit(@Advice.Return int result, @Advice.Enter int enter, @Advice.Thrown Throwable throwable) {
-            if (result != (exception ? 0 : VALUE) || enter != VALUE * 2 || (exception ? throwable instanceof RuntimeException : throwable == null)) {
+            if (result != (exception ? 0 : VALUE)
+                    || enter != VALUE * 2
+                    || !(exception ? throwable instanceof RuntimeException : throwable == null)) {
                 throw new AssertionError();
             }
             exit++;
@@ -260,7 +270,9 @@
 
         @Advice.OnMethodExit
         public static long exit(@Advice.Return long result, @Advice.Enter long enter, @Advice.Thrown Throwable throwable) {
-            if (result != (exception ? 0 : VALUE) || enter != VALUE * 2 || (exception ? throwable instanceof RuntimeException : throwable == null)) {
+            if (result != (exception ? 0 : VALUE)
+                    || enter != VALUE * 2
+                    || !(exception ? throwable instanceof RuntimeException : throwable == null)) {
                 throw new AssertionError();
             }
             exit++;
@@ -291,7 +303,9 @@
 
         @Advice.OnMethodExit
         public static float exit(@Advice.Return float result, @Advice.Enter float enter, @Advice.Thrown Throwable throwable) {
-            if (result != (exception ? 0 : VALUE) || enter != VALUE * 2 || (exception ? throwable instanceof RuntimeException : throwable == null)) {
+            if (result != (exception ? 0 : VALUE)
+                    || enter != VALUE * 2
+                    || !(exception ? throwable instanceof RuntimeException : throwable == null)) {
                 throw new AssertionError();
             }
             exit++;
@@ -322,7 +336,9 @@
 
         @Advice.OnMethodExit
         public static double exit(@Advice.Return double result, @Advice.Enter double enter, @Advice.Thrown Throwable throwable) {
-            if (result != (exception ? 0 : VALUE) || enter != VALUE * 2 || (exception ? throwable instanceof RuntimeException : throwable == null)) {
+            if (result != (exception ? 0 : VALUE)
+                    || enter != VALUE * 2
+                    || !(exception ? throwable instanceof RuntimeException : throwable == null)) {
                 throw new AssertionError();
             }
             exit++;
@@ -355,7 +371,7 @@
         public static Object exit(@Advice.Return Object result, @Advice.Enter Object enter, @Advice.Thrown Throwable throwable) {
             if ((exception ? result != null : !result.equals(FOO))
                     || !enter.equals(FOO + BAR)
-                    || (exception ? throwable instanceof RuntimeException : throwable == null)) {
+                    || !(exception ? throwable instanceof RuntimeException : throwable == null)) {
                 throw new AssertionError();
             }
             exit++;
