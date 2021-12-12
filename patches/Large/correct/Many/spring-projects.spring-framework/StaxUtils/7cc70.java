diff --git a/spring-core/src/main/java/org/springframework/util/xml/StaxUtils.java b/spring-core/src/main/java/org/springframework/util/xml/StaxUtils.java
index 6f9b06c..2e7e583 100644
--- a/spring-core/src/main/java/org/springframework/util/xml/StaxUtils.java
+++ b/spring-core/src/main/java/org/springframework/util/xml/StaxUtils.java
@@ -63,7 +63,7 @@
 	 * @since 5.0
 	 */
 	public static XMLInputFactory createDefensiveInputFactory() {
-		return createDefensiveInputFactory(XMLInputFactory::newFactory);
+		return createDefensiveInputFactory(XMLInputFactory::newInstance);
 	}
 
 	/**
