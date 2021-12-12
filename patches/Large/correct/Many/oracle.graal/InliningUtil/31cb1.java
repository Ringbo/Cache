diff --git a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/InliningUtil.java b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/InliningUtil.java
index 53031a9..c77c0d0 100644
--- a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/InliningUtil.java
+++ b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/InliningUtil.java
@@ -173,7 +173,7 @@
 
     public static void logInliningDecision(final String msg, final Object... args) {
         try (Scope s = Debug.scope(inliningDecisionsScopeString)) {
-            Debug.log(msg, args);
+            Debug.logv(msg, args);
         }
     }
 
