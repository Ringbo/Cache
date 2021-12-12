diff --git a/config/src/main/java/org/springframework/security/config/web/server/ServerHttpSecurity.java b/config/src/main/java/org/springframework/security/config/web/server/ServerHttpSecurity.java
index cb9c233..46a456c 100644
--- a/config/src/main/java/org/springframework/security/config/web/server/ServerHttpSecurity.java
+++ b/config/src/main/java/org/springframework/security/config/web/server/ServerHttpSecurity.java
@@ -97,7 +97,7 @@
 
 	private AuthorizeExchangeSpec authorizeExchange;
 
-	private HeaderBuilder headers = new HeaderBuilder();
+	private HeaderSpec headers = new HeaderSpec();
 
 	private CsrfBuilder csrf = new CsrfBuilder();
 
@@ -175,9 +175,9 @@
 		return this.formLogin;
 	}
 
-	public HeaderBuilder headers() {
+	public HeaderSpec headers() {
 		if(this.headers == null) {
-			this.headers = new HeaderBuilder();
+			this.headers = new HeaderSpec();
 		}
 		return this.headers;
 	}
@@ -627,7 +627,7 @@
 	 * @author Rob Winch
 	 * @since 5.0
 	 */
-	public class HeaderBuilder {
+	public class HeaderSpec {
 		private final List<ServerHttpHeadersWriter> writers;
 
 		private CacheControlServerHttpHeadersWriter cacheControl = new CacheControlServerHttpHeadersWriter();
@@ -672,7 +672,7 @@
 
 		public class CacheSpec {
 			public void disable() {
-				HeaderBuilder.this.writers.remove(HeaderBuilder.this.cacheControl);
+				HeaderSpec.this.writers.remove(HeaderSpec.this.cacheControl);
 			}
 
 			private CacheSpec() {}
@@ -680,7 +680,7 @@
 
 		public class ContentTypeOptionsSpec {
 			public void disable() {
-				HeaderBuilder.this.writers.remove(HeaderBuilder.this.contentTypeOptions);
+				HeaderSpec.this.writers.remove(HeaderSpec.this.contentTypeOptions);
 			}
 
 			private ContentTypeOptionsSpec() {}
@@ -688,10 +688,10 @@
 
 		public class FrameOptionsSpec {
 			public void mode(XFrameOptionsServerHttpHeadersWriter.Mode mode) {
-				HeaderBuilder.this.frameOptions.setMode(mode);
+				HeaderSpec.this.frameOptions.setMode(mode);
 			}
 			public void disable() {
-				HeaderBuilder.this.writers.remove(HeaderBuilder.this.frameOptions);
+				HeaderSpec.this.writers.remove(HeaderSpec.this.frameOptions);
 			}
 
 			private FrameOptionsSpec() {}
@@ -699,15 +699,15 @@
 
 		public class HstsSpec {
 			public void maxAge(Duration maxAge) {
-				HeaderBuilder.this.hsts.setMaxAge(maxAge);
+				HeaderSpec.this.hsts.setMaxAge(maxAge);
 			}
 
 			public void includeSubdomains(boolean includeSubDomains) {
-				HeaderBuilder.this.hsts.setIncludeSubDomains(includeSubDomains);
+				HeaderSpec.this.hsts.setIncludeSubDomains(includeSubDomains);
 			}
 
 			public void disable() {
-				HeaderBuilder.this.writers.remove(HeaderBuilder.this.hsts);
+				HeaderSpec.this.writers.remove(HeaderSpec.this.hsts);
 			}
 
 			private HstsSpec() {}
@@ -715,13 +715,13 @@
 
 		public class XssProtectionSpec {
 			public void disable() {
-				HeaderBuilder.this.writers.remove(HeaderBuilder.this.xss);
+				HeaderSpec.this.writers.remove(HeaderSpec.this.xss);
 			}
 
 			private XssProtectionSpec() {}
 		}
 
-		private HeaderBuilder() {
+		private HeaderSpec() {
 			this.writers = new ArrayList<>(
 				Arrays.asList(this.cacheControl, this.contentTypeOptions, this.hsts,
 					this.frameOptions, this.xss));
