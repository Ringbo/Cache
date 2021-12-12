diff --git a/web/src/main/java/org/openmrs/layout/web/name/NameSupport.java b/web/src/main/java/org/openmrs/layout/web/name/NameSupport.java
index bd0c181..3fd326f 100644
--- a/web/src/main/java/org/openmrs/layout/web/name/NameSupport.java
+++ b/web/src/main/java/org/openmrs/layout/web/name/NameSupport.java
@@ -31,7 +31,7 @@
 		}
 	}
 	
-	public static NameSupport getInstance() {
+	public static synchronized NameSupport getInstance() {
 		if (singleton == null) {
 			throw new RuntimeException("Not Yet Instantiated");
 		} else {
