diff --git a/hutool-core/src/main/java/com/xiaoleilu/hutool/lang/Dict.java b/hutool-core/src/main/java/com/xiaoleilu/hutool/lang/Dict.java
index e26af3f..2fd35ad 100644
--- a/hutool-core/src/main/java/com/xiaoleilu/hutool/lang/Dict.java
+++ b/hutool-core/src/main/java/com/xiaoleilu/hutool/lang/Dict.java
@@ -65,7 +65,7 @@
 	 * @return Bean
 	 */
 	public <T> T toBean(T bean, boolean isToCamelCase) {
-		BeanUtil.fillBeanWithMap(this, bean, isToCamelCase);
+		BeanUtil.fillBeanWithMap(this,bean,isToCamelCase,false);
 		return bean;
 	}
 	
