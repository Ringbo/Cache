diff --git a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsHibernateUtil.java b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsHibernateUtil.java
index 64d0e91..9b77bb2 100644
--- a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsHibernateUtil.java
+++ b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsHibernateUtil.java
@@ -126,7 +126,7 @@
                     GrailsDomainClass gdc = (GrailsDomainClass) hibernateDomainClassMap.get(superClass.getName());
 
                     if (gdc == null || gdc.getSubClasses() == null) {
-                        LOG.error("did not find superclass names when mapping inheritance....");
+                        LOG.debug("did not find superclass names when mapping inheritance....");
                         break;
                     }
                     gdc.getSubClasses().add(baseClass);
