diff --git a/compiler/tests/org/jetbrains/jet/repl/ReplInterpreterTest.java b/compiler/tests/org/jetbrains/jet/repl/ReplInterpreterTest.java
index 0a4455f..77d40b8 100644
--- a/compiler/tests/org/jetbrains/jet/repl/ReplInterpreterTest.java
+++ b/compiler/tests/org/jetbrains/jet/repl/ReplInterpreterTest.java
@@ -63,7 +63,7 @@
             Object actual = repl.eval(code).getValue();
             String actualString = actual != null ? actual.toString() : "null";
 
-            Assert.assertEquals("after evaluation of: " + code, actualString, expected);
+            Assert.assertEquals("after evaluation of: " + code, expected, actualString);
         }
     }
 
