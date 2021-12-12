diff --git a/java/org/apache/catalina/ha/authenticator/SingleSignOnMessage.java b/java/org/apache/catalina/ha/authenticator/SingleSignOnMessage.java
index e2cd97c..fc437cc 100644
--- a/java/org/apache/catalina/ha/authenticator/SingleSignOnMessage.java
+++ b/java/org/apache/catalina/ha/authenticator/SingleSignOnMessage.java
@@ -71,7 +71,7 @@
      * @param member Member
      */
     public void setAddress(Member member) {
-	this.address = address;
+	this.address = member;
     }
 
     /**
