diff --git a/activemq-web/src/main/java/org/apache/activemq/web/config/JNDIConfiguration.java b/activemq-web/src/main/java/org/apache/activemq/web/config/JNDIConfiguration.java
index f8eb4eb..a3d7c2c 100644
--- a/activemq-web/src/main/java/org/apache/activemq/web/config/JNDIConfiguration.java
+++ b/activemq-web/src/main/java/org/apache/activemq/web/config/JNDIConfiguration.java
@@ -94,11 +94,11 @@
 	}
 
 	public String getJmxPassword() {
-		return getJndiString(JNDI_JMX_USER);
+        return getJndiString(JNDI_JMX_PASSWORD);
 	}
 
 	public String getJmxUser() {
-		return getJndiString(JNDI_JMX_PASSWORD);
+        return getJndiString(JNDI_JMX_USER);
 	}
 
 }
\ No newline at end of file
