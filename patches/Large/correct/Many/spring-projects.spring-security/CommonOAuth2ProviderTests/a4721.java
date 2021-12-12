diff --git a/config/src/test/java/org/springframework/security/config/oauth2/client/CommonOAuth2ProviderTests.java b/config/src/test/java/org/springframework/security/config/oauth2/client/CommonOAuth2ProviderTests.java
index 6ff20bc..c65f671 100644
--- a/config/src/test/java/org/springframework/security/config/oauth2/client/CommonOAuth2ProviderTests.java
+++ b/config/src/test/java/org/springframework/security/config/oauth2/client/CommonOAuth2ProviderTests.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2017 the original author or authors.
+ * Copyright 2002-2018 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -123,8 +123,7 @@
 		assertThat(registration.getAuthorizationGrantType())
 			.isEqualTo(AuthorizationGrantType.AUTHORIZATION_CODE);
 		assertThat(registration.getRedirectUriTemplate()).isEqualTo(DEFAULT_REDIRECT_URL);
-		assertThat(registration.getScopes()).containsOnly("openid", "profile", "email",
-			"address", "phone");
+		assertThat(registration.getScopes()).containsOnly("openid", "profile", "email");
 		assertThat(registration.getClientName()).isEqualTo("Okta");
 		assertThat(registration.getRegistrationId()).isEqualTo("123");
 	}
