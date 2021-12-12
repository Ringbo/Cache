diff --git a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-test/src/test/java/com/liferay/dynamic/data/mapping/util/DDMFormValuesMergerTest.java b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-test/src/test/java/com/liferay/dynamic/data/mapping/util/DDMFormValuesMergerTest.java
index 1e8ad42..3f992e5 100644
--- a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-test/src/test/java/com/liferay/dynamic/data/mapping/util/DDMFormValuesMergerTest.java
+++ b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-test/src/test/java/com/liferay/dynamic/data/mapping/util/DDMFormValuesMergerTest.java
@@ -194,13 +194,13 @@
 		List<DDMFormFieldValue> mergedDDMFormFieldValues =
 			mergedDDMFormValues.getDDMFormFieldValues();
 
-		Assert.assertEquals(1, mergedDDMFormFieldValues.size());
+		Assert.assertEquals(2, mergedDDMFormFieldValues.size());
 
 		Assert.assertTrue(
 			mergedDDMFormFieldValues.contains(text1DDMFormFieldValue));
 
 		Assert.assertTrue(
-			!mergedDDMFormFieldValues.contains(text2DDMFormFieldValue));
+			mergedDDMFormFieldValues.contains(text2DDMFormFieldValue));
 	}
 
 	@Test
