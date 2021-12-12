diff --git a/src/protocol/ldap/org/apache/jmeter/protocol/ldap/sampler/LDAPExtSampler.java b/src/protocol/ldap/org/apache/jmeter/protocol/ldap/sampler/LDAPExtSampler.java
index b9a2fb6..bbe6c45 100644
--- a/src/protocol/ldap/org/apache/jmeter/protocol/ldap/sampler/LDAPExtSampler.java
+++ b/src/protocol/ldap/org/apache/jmeter/protocol/ldap/sampler/LDAPExtSampler.java
@@ -149,7 +149,7 @@
 	 * @return The username
 	 **************************************************************************/
 
-	public void SetUserDN(String newUserDN) {
+	public void setUserDN(String newUserDN) {
 		setProperty(new StringProperty(USERDN, newUserDN));
 	}
 
@@ -189,7 +189,7 @@
 	 * @return The username
 	 **************************************************************************/
 
-	public void SetSuserDN(String newUserDN) {
+	public void setSuserDN(String newUserDN) {
 		setProperty(new StringProperty(SUSERDN, newUserDN));
 	}
 
@@ -641,9 +641,9 @@
 			ctx.close();
 		}
 		res.sampleStart();
-		dirContext = ldap.connect(getServername(), getPort(), getRootdn(), getUserDN(), getUserPw());
+		ctx = ldap.connect(getServername(), getPort(), getRootdn(), getUserDN(), getUserPw());
 		res.sampleEnd();
-		ldapContexts.put(getThreadName(), dirContext);
+		ldapContexts.put(getThreadName(), ctx);
 	}
 
 	/***************************************************************************
