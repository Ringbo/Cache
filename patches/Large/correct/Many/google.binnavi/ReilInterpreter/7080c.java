diff --git a/src/main/java/com/google/security/zynamics/reil/interpreter/ReilInterpreter.java b/src/main/java/com/google/security/zynamics/reil/interpreter/ReilInterpreter.java
index e1c1b75..94f339e 100644
--- a/src/main/java/com/google/security/zynamics/reil/interpreter/ReilInterpreter.java
+++ b/src/main/java/com/google/security/zynamics/reil/interpreter/ReilInterpreter.java
@@ -82,8 +82,9 @@
       case QWORD:
         return BigInteger.valueOf(0xFFFFFFFFFFFFFFFFL);
       case OWORD:
-        return BigInteger.valueOf(0xFFFFFFFFFFFFFFL)
-         .shiftLeft(56).add(BigInteger.valueOf(0xFFFFFFFFFFFFFFL)).shiftLeft(16).add(BigInteger.valueOf(0xffffl));
+        return BigInteger.valueOf(0xFFFFFFFFFFFFFFL).shiftLeft(56)
+            .add(BigInteger.valueOf(0xFFFFFFFFFFFFFFL)).shiftLeft(16)
+            .add(BigInteger.valueOf(0xFFFFL));
       case WORD:
         return BigInteger.valueOf(0xFFFFL);
       default:
