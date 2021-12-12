diff --git a/spring-boot/src/main/java/org/springframework/boot/context/properties/source/DefaultPropertyMapper.java b/spring-boot/src/main/java/org/springframework/boot/context/properties/source/DefaultPropertyMapper.java
index bb60f04..34111a6 100644
--- a/spring-boot/src/main/java/org/springframework/boot/context/properties/source/DefaultPropertyMapper.java
+++ b/spring-boot/src/main/java/org/springframework/boot/context/properties/source/DefaultPropertyMapper.java
@@ -89,7 +89,7 @@
 
 		@Override
 		protected boolean removeEldestEntry(Map.Entry<K, List<PropertyMapping>> eldest) {
-			return size() >= this.capacity;
+			return size() > this.capacity;
 
 		}
 
