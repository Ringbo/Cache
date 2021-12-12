diff --git a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsHibernateUtil.java b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsHibernateUtil.java
index 30997a4..daef301 100644
--- a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsHibernateUtil.java
+++ b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsHibernateUtil.java
@@ -196,7 +196,7 @@
             Map fetch = (Map)fetchObj;
             for (Iterator i = fetch.keySet().iterator(); i.hasNext();) {
                 String associationName = (String) i.next();
-                c.setFetchMode(associationName, getFetchMode(fetch.get(i)));
+                c.setFetchMode(associationName, getFetchMode(fetch.get(associationName)));
             }
         }
 
