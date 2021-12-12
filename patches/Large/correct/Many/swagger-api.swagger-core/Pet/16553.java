diff --git a/modules/swagger-jaxrs/src/test/java/io/swagger/models/Pet.java b/modules/swagger-jaxrs/src/test/java/io/swagger/models/Pet.java
index 622a624..2893e18 100644
--- a/modules/swagger-jaxrs/src/test/java/io/swagger/models/Pet.java
+++ b/modules/swagger-jaxrs/src/test/java/io/swagger/models/Pet.java
@@ -43,7 +43,7 @@
     }
 
     public void setCategoryWithApiModel(CategoryWithApiModel category) {
-        this.categoryWithApiModel = categoryWithApiModel;
+        this.categoryWithApiModel = category;
     }
 
     @XmlElement(name = "name")
