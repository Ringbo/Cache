diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/DispatcherHandler.java b/spring-webflux/src/main/java/org/springframework/web/reactive/DispatcherHandler.java
index ad976e3..838c401 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/DispatcherHandler.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/DispatcherHandler.java
@@ -112,7 +112,7 @@
 	 * @return immutable list with the configured mappings or {@code null}
 	 */
 	@Nullable
-	public List<HandlerMapping> getHandlerMappings() {
+	public final List<HandlerMapping> getHandlerMappings() {
 		return this.handlerMappings;
 	}
 
