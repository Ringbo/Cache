diff --git a/oauth2/oauth2-client/src/main/java/org/springframework/security/oauth2/client/registration/InMemoryClientRegistrationRepository.java b/oauth2/oauth2-client/src/main/java/org/springframework/security/oauth2/client/registration/InMemoryClientRegistrationRepository.java
index a4dfa74..07b96bb 100644
--- a/oauth2/oauth2-client/src/main/java/org/springframework/security/oauth2/client/registration/InMemoryClientRegistrationRepository.java
+++ b/oauth2/oauth2-client/src/main/java/org/springframework/security/oauth2/client/registration/InMemoryClientRegistrationRepository.java
@@ -62,7 +62,7 @@
 		return this.registrations.values().stream()
 			.filter(registration -> registration.getClientAlias().equals(clientAlias))
 			.findFirst()
-			.orElseGet(null);
+			.orElse(null);
 	}
 
 	@Override
