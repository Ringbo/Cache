diff --git a/lint/src/main/java/com/birbit/android/jobqueue/lint/SleepDetector.java b/lint/src/main/java/com/birbit/android/jobqueue/lint/SleepDetector.java
index 6b00ed1..e7f55ee 100644
--- a/lint/src/main/java/com/birbit/android/jobqueue/lint/SleepDetector.java
+++ b/lint/src/main/java/com/birbit/android/jobqueue/lint/SleepDetector.java
@@ -17,7 +17,7 @@
             Category.CORRECTNESS,
             6,
             Severity.ERROR,
-            new Implementation(SleepDetector.class, EnumSet.of(Scope.JAVA_FILE))
+            new Implementation(SleepDetector.class, EnumSet.of(Scope.JAVA_FILE, Scope.TEST_SOURCES))
     );
 
     @Override
@@ -27,7 +27,7 @@
             public boolean visitMethodInvocation(MethodInvocation node) {
                 Expression operand = node.astOperand();
                 if (node.astName().toString().equals("sleep") && operand.toString().equals("Thread") && !context.isSuppressedWithComment(node, ISSUE)) {
-                    context.report(ISSUE, context.getLocation(node), "Don't call sleep. Use MockTimer instead.");
+                    context.report(ISSUE, node, context.getLocation(node), "Don't call sleep. Use MockTimer instead.");
                 }
                 return super.visitMethodInvocation(node);
             }
