diff --git a/config/src/test/java/org/springframework/security/config/annotation/web/reactive/EnableWebFluxSecurityTests.java b/config/src/test/java/org/springframework/security/config/annotation/web/reactive/EnableWebFluxSecurityTests.java
index 2ae91e6..59d2d48 100644
--- a/config/src/test/java/org/springframework/security/config/annotation/web/reactive/EnableWebFluxSecurityTests.java
+++ b/config/src/test/java/org/springframework/security/config/annotation/web/reactive/EnableWebFluxSecurityTests.java
@@ -187,7 +187,7 @@
 			}
 
 			@Bean
-			public PasswordEncoder passwordEncoder() {
+			public static PasswordEncoder passwordEncoder() {
 				return new BCryptPasswordEncoder();
 			}
 		}
