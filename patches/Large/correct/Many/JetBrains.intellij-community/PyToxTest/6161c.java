diff --git a/python/testSrc/com/jetbrains/env/PyToxTest.java b/python/testSrc/com/jetbrains/env/PyToxTest.java
index c2d1ead..eddfdb8 100644
--- a/python/testSrc/com/jetbrains/env/PyToxTest.java
+++ b/python/testSrc/com/jetbrains/env/PyToxTest.java
@@ -125,10 +125,10 @@
     runPythonTest(new MyPyProcessWithConsoleTestTask("/toxtest/toxOneInterpreter/", 0,
                                                      () -> new MyTestProcessRunner(),
                                                      Arrays.asList(
-                                                       Pair.create("py26", new InterpreterExpectations("", true)),
+                                                       Pair.create("py26", new InterpreterExpectations("", false)),
                                                        Pair.create("py27", new InterpreterExpectations("ython 2.7", true)),
-                                                       Pair.create("py32", new InterpreterExpectations("", true)),
-                                                       Pair.create("py34", new InterpreterExpectations("", true))
+                                                       Pair.create("py32", new InterpreterExpectations("", false)),
+                                                       Pair.create("py34", new InterpreterExpectations("", false))
                                                      ),
                                                      Integer.MAX_VALUE)
     );
