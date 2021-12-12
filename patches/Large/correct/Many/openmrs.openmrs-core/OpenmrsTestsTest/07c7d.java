diff --git a/api/src/test/java/org/openmrs/OpenmrsTestsTest.java b/api/src/test/java/org/openmrs/OpenmrsTestsTest.java
index e6b272e..3960806 100644
--- a/api/src/test/java/org/openmrs/OpenmrsTestsTest.java
+++ b/api/src/test/java/org/openmrs/OpenmrsTestsTest.java
@@ -199,7 +199,7 @@
 				className = className.replace(File.separator, ".");
 				
 				// strip out the beginning (/home/ben/workspace...) up to org.openmrs.
-				className = className.substring(className.indexOf("org.openmrs."));
+				className = className.substring(className.lastIndexOf("org.openmrs."));
 				
 				try {
 					Class<?> currentClass = classLoader.loadClass(className);
