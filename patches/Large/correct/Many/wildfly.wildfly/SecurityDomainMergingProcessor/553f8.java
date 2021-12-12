diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/merging/SecurityDomainMergingProcessor.java b/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/merging/SecurityDomainMergingProcessor.java
index 5f466c8..7b7715b 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/merging/SecurityDomainMergingProcessor.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/merging/SecurityDomainMergingProcessor.java
@@ -94,9 +94,9 @@
                 }
             }
         }
-        if (securityDomain != null)
+        if (securityDomain != null && ! securityDomain.isEmpty())
             description.setSecurityDomain(securityDomain);
-        else if (globalSecurityDomain != null)
+        else if (globalSecurityDomain != null && !globalSecurityDomain.isEmpty())
             description.setSecurityDomain(globalSecurityDomain);
     }
 
