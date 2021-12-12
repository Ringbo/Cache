diff --git a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/ImportAutoConfigurationImportSelectorTests.java b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/ImportAutoConfigurationImportSelectorTests.java
index cbd254b..d8e93fa 100644
--- a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/ImportAutoConfigurationImportSelectorTests.java
+++ b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/ImportAutoConfigurationImportSelectorTests.java
@@ -157,7 +157,7 @@
 		Set<Object> set1 = this.importSelector.determineImports(
 				getAnnotationMetadata(ImportAutoConfigurationWithItemsOne.class));
 		Set<Object> set2 = this.importSelector.determineImports(
-				getAnnotationMetadata(ImportAutoConfigurationWithItemsOne.class));
+				getAnnotationMetadata(ImportAutoConfigurationWithItemsTwo.class));
 		assertThat(set1).isEqualTo(set2);
 	}
 
@@ -269,7 +269,7 @@
 	}
 
 	@ImportAutoConfiguration(classes = ThymeleafAutoConfiguration.class)
-	@UnrelatedOne
+	@UnrelatedTwo
 	static class ImportAutoConfigurationWithItemsTwo {
 
 	}
