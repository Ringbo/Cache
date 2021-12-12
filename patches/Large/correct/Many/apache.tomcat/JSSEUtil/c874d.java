diff --git a/java/org/apache/tomcat/util/net/jsse/JSSEUtil.java b/java/org/apache/tomcat/util/net/jsse/JSSEUtil.java
index 5965920..fd43458 100644
--- a/java/org/apache/tomcat/util/net/jsse/JSSEUtil.java
+++ b/java/org/apache/tomcat/util/net/jsse/JSSEUtil.java
@@ -272,7 +272,7 @@
                 if (crlf != null && crlf.length() > 0) {
                     throw new CRLException(sm.getString("jsseUtil.noCrlSupport", algorithm));
                 }
-                log.warn(sm.getString("jsseUtil.noVerificationDepth"));
+                log.warn(sm.getString("jsseUtil.noVerificationDepth", algorithm));
             }
         }
 
