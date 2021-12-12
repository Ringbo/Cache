diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder.java
index 16aaa9f..485b599 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder.java
@@ -367,7 +367,7 @@
         }
         for (PolicyAssertion pa : suppTokens) {
             if (pa instanceof SupportingToken) {
-                for (Token token : ((SupportingToken)suppTokens).getTokens()) {
+                for (Token token : ((SupportingToken)pa).getTokens()) {
                     this.policyAsserted(token);
                 }        
             }
