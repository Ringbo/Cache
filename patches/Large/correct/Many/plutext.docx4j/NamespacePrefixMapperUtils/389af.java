diff --git a/src/main/java/org/docx4j/jaxb/NamespacePrefixMapperUtils.java b/src/main/java/org/docx4j/jaxb/NamespacePrefixMapperUtils.java
index 481ffcb..f6fe2da 100644
--- a/src/main/java/org/docx4j/jaxb/NamespacePrefixMapperUtils.java
+++ b/src/main/java/org/docx4j/jaxb/NamespacePrefixMapperUtils.java
@@ -56,11 +56,11 @@
 			prefixMapper = new NamespacePrefixMapperSunInternal();
 			return prefixMapper;
 		} catch (java.lang.NoClassDefFoundError notJava6) {
-			log.error(notJava6.getMessage() + " .. trying RI.");
+			log.warn(notJava6.getMessage() + " .. trying RI.");
 			return tryUsingRI(m);			
 		} catch (javax.xml.bind.PropertyException notJava6) {
 			// OpenJDK (1.6.0_23) does this
-			log.error(notJava6.getMessage() + " .. trying RI.");
+			log.warn(notJava6.getMessage() + " .. trying RI.");
 			return tryUsingRI(m);			
 		}
 	}
