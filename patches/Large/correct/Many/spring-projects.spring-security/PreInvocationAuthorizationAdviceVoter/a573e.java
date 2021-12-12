diff --git a/core/src/main/java/org/springframework/security/access/prepost/PreInvocationAuthorizationAdviceVoter.java b/core/src/main/java/org/springframework/security/access/prepost/PreInvocationAuthorizationAdviceVoter.java
index f2ab4d3..7132ad2 100644
--- a/core/src/main/java/org/springframework/security/access/prepost/PreInvocationAuthorizationAdviceVoter.java
+++ b/core/src/main/java/org/springframework/security/access/prepost/PreInvocationAuthorizationAdviceVoter.java
@@ -31,7 +31,7 @@
     }
 
     public boolean supports(ConfigAttribute attribute) {
-        return attribute instanceof PreInvocationAuthorizationAdvice;
+        return attribute instanceof PreInvocationAttribute;
     }
 
     public boolean supports(Class<?> clazz) {
