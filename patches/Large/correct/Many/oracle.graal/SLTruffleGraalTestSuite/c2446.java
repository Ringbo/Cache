diff --git a/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/SLTruffleGraalTestSuite.java b/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/SLTruffleGraalTestSuite.java
index b783bc7..9bd815d 100644
--- a/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/SLTruffleGraalTestSuite.java
+++ b/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/SLTruffleGraalTestSuite.java
@@ -51,7 +51,7 @@
         SLTestRunner.installBuiltin(SLIsCompilationConstantBuiltinFactory.getInstance());
 
         /* test specific builtins */
-        SLTestRunner.installBuiltin(SLTestSlowPath01BuiltinFactory.getInstance());
+        SLTestRunner.installBuiltin(SLTestTruffleBoundary01BuiltinFactory.getInstance());
     }
 
     /*
