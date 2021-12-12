diff --git a/src/commons/grails/util/ExtendProxy.java b/src/commons/grails/util/ExtendProxy.java
index 4b752d8..c95e685 100644
--- a/src/commons/grails/util/ExtendProxy.java
+++ b/src/commons/grails/util/ExtendProxy.java
@@ -38,7 +38,7 @@
 
 	public void setProperty(String property, Object newValue) {
 		try {			
-			super.getProperty(property);
+			super.setProperty(property,newValue);
 		}
 		catch(MissingPropertyException mpe) {
 			InvokerHelper.getMetaClass(getAdaptee()).setProperty(getAdaptee(),property,newValue);
