diff --git a/hibernate-core/src/main/java/org/hibernate/boot/model/source/internal/hbm/PluralAttributeElementSourceBasicImpl.java b/hibernate-core/src/main/java/org/hibernate/boot/model/source/internal/hbm/PluralAttributeElementSourceBasicImpl.java
index e8af40f..493ed9f 100644
--- a/hibernate-core/src/main/java/org/hibernate/boot/model/source/internal/hbm/PluralAttributeElementSourceBasicImpl.java
+++ b/hibernate-core/src/main/java/org/hibernate/boot/model/source/internal/hbm/PluralAttributeElementSourceBasicImpl.java
@@ -75,8 +75,8 @@
 					public SizeSource getSizeSource() {
 						return Helper.interpretSizeSource(
 								jaxbElement.getLength(),
-								jaxbElement.getPrecision(),
-								jaxbElement.getScale()
+								jaxbElement.getScale(),
+								jaxbElement.getPrecision()
 						);
 					}
 				}
