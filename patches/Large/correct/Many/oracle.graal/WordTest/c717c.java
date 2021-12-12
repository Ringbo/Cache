diff --git a/graal/com.oracle.graal.snippets.test/src/com/oracle/graal/snippets/WordTest.java b/graal/com.oracle.graal.snippets.test/src/com/oracle/graal/snippets/WordTest.java
index dd0d43d..a37e3fa 100644
--- a/graal/com.oracle.graal.snippets.test/src/com/oracle/graal/snippets/WordTest.java
+++ b/graal/com.oracle.graal.snippets.test/src/com/oracle/graal/snippets/WordTest.java
@@ -43,7 +43,7 @@
 
     public WordTest() {
         TargetDescription target = Graal.getRequiredCapability(GraalCompiler.class).target;
-        installer = new SnippetInstaller(runtime, target, new Assumptions(false));
+        installer = new SnippetInstaller(runtime, new Assumptions(false), target);
     }
 
     private static final ThreadLocal<SnippetInliningPolicy> inliningPolicy = new ThreadLocal<>();
