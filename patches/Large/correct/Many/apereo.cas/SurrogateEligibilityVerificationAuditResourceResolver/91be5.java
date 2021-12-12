diff --git a/support/cas-server-support-surrogate-authentication/src/main/java/org/apereo/cas/authentication/audit/SurrogateEligibilityVerificationAuditResourceResolver.java b/support/cas-server-support-surrogate-authentication/src/main/java/org/apereo/cas/authentication/audit/SurrogateEligibilityVerificationAuditResourceResolver.java
index ee4eacb..282647f 100644
--- a/support/cas-server-support-surrogate-authentication/src/main/java/org/apereo/cas/authentication/audit/SurrogateEligibilityVerificationAuditResourceResolver.java
+++ b/support/cas-server-support-surrogate-authentication/src/main/java/org/apereo/cas/authentication/audit/SurrogateEligibilityVerificationAuditResourceResolver.java
@@ -31,7 +31,7 @@
         surrogateEligibilityResult.getAuthentication().ifPresent(it -> builder.append("selfPrincipal", it.getPrincipal()));
         builder.append("surrogatePrincipal", surrogateEligibilityResult.getProperties().get("targetUserId"));
 
-        return new String[]{buildeSurrogatePrincipalElectionStrategyr.toString()};
+        return new String[]{builder.toString()};
     }
 }
 
