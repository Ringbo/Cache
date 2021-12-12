diff --git a/demoapp/src/main/java/org/cf/demoapp/java_io_PrintStream_println.java b/demoapp/src/main/java/org/cf/demoapp/java_io_PrintStream_println.java
index 1434670..db12ec4 100644
--- a/demoapp/src/main/java/org/cf/demoapp/java_io_PrintStream_println.java
+++ b/demoapp/src/main/java/org/cf/demoapp/java_io_PrintStream_println.java
@@ -8,9 +8,9 @@
 import org.cf.smalivm.emulate.UnknownValuesMethod;
 import org.cf.smalivm.opcode.Op;
 
-class java_io_PrintStream_println extends MethodStateMethod implements UnknownValuesMethod {
+public class java_io_PrintStream_println extends MethodStateMethod implements UnknownValuesMethod {
 
-    java_io_PrintStream_println() {
+    public java_io_PrintStream_println() {
         super();
 
         // Writing bytes over any kind of IO affects state outside of the VM.
