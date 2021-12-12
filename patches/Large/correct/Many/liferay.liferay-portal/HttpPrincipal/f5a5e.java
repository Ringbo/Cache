diff --git a/portal-impl/src/com/liferay/portal/security/auth/HttpPrincipal.java b/portal-impl/src/com/liferay/portal/security/auth/HttpPrincipal.java
index cb2f13e..ad552c4 100644
--- a/portal-impl/src/com/liferay/portal/security/auth/HttpPrincipal.java
+++ b/portal-impl/src/com/liferay/portal/security/auth/HttpPrincipal.java
@@ -27,11 +27,11 @@
 public class HttpPrincipal implements Serializable {
 
 	public HttpPrincipal() {
-		this(null, null, null, false);
+		this(null, null, null, true);
 	}
 
 	public HttpPrincipal(String url) {
-		this(url, null, null, false);
+		this(url, null, null, true);
 	}
 
 	public HttpPrincipal(String url, String login, String password) {
