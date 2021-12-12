diff --git a/compiler/src/org.graalvm.compiler.java/src/org/graalvm/compiler/java/BytecodeParser.java b/compiler/src/org.graalvm.compiler.java/src/org/graalvm/compiler/java/BytecodeParser.java
index 9a3cf0b..c5cb73e 100644
--- a/compiler/src/org.graalvm.compiler.java/src/org/graalvm/compiler/java/BytecodeParser.java
+++ b/compiler/src/org.graalvm.compiler.java/src/org/graalvm/compiler/java/BytecodeParser.java
@@ -2187,9 +2187,9 @@
         TTY.println(s);
     }
 
-    protected BytecodeParserError asParserError(Throwable e) {
+    protected RuntimeException throwParserError(Throwable e) {
         if (e instanceof BytecodeParserError) {
-            return (BytecodeParserError) e;
+            throw (BytecodeParserError) e;
         }
         BytecodeParser bp = this;
         BytecodeParserError res = new BytecodeParserError(e);
@@ -2197,7 +2197,7 @@
             res.addContext("parsing " + bp.code.asStackTraceElement(bp.bci()));
             bp = bp.parent;
         }
-        return res;
+        throw res;
     }
 
     protected void parseAndInlineCallee(ResolvedJavaMethod targetMethod, ValueNode[] args, IntrinsicContext calleeIntrinsicContext) {
@@ -2875,7 +2875,7 @@
                 // Don't wrap bailouts as parser errors
                 throw e;
             } catch (Throwable e) {
-                throw asParserError(e);
+                throw throwParserError(e);
             }
 
             if (lastInstr == null || lastInstr.next() != null) {
