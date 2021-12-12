diff --git a/org.springframework.context/src/main/java/org/springframework/validation/AbstractPropertyBindingResult.java b/org.springframework.context/src/main/java/org/springframework/validation/AbstractPropertyBindingResult.java
index 1067c8d..8fdd8aa 100644
--- a/org.springframework.context/src/main/java/org/springframework/validation/AbstractPropertyBindingResult.java
+++ b/org.springframework.context/src/main/java/org/springframework/validation/AbstractPropertyBindingResult.java
@@ -149,7 +149,7 @@
 			valueType = getFieldType(field);
 		}
 		PropertyEditor editor = super.findEditor(field, valueType);
-		if (editor == null) {
+		if (editor == null && this.formattingService != null) {
 			TypeDescriptor td = (field != null ?
 					getPropertyAccessor().getPropertyTypeDescriptor(fixedField(field)) :
 					TypeDescriptor.valueOf(valueType));
