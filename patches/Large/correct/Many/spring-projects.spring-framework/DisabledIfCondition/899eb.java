diff --git a/spring-test/src/main/java/org/springframework/test/context/junit/jupiter/DisabledIfCondition.java b/spring-test/src/main/java/org/springframework/test/context/junit/jupiter/DisabledIfCondition.java
index ada7116..93458fe 100644
--- a/spring-test/src/main/java/org/springframework/test/context/junit/jupiter/DisabledIfCondition.java
+++ b/spring-test/src/main/java/org/springframework/test/context/junit/jupiter/DisabledIfCondition.java
@@ -82,7 +82,9 @@
 		Optional<DisabledIf> disabledIf = findMergedAnnotation(element, DisabledIf.class);
 		Assert.state(disabledIf.isPresent(), () -> "@DisabledIf must be present on " + element);
 
-		String expression = disabledIf.get().expression().trim();
+		String expression = disabledIf.map(DisabledIf::expression).filter(StringUtils::hasText).orElseThrow(
+			() -> new IllegalStateException(
+				String.format("The expression in @DisabledIf on [%s] must not be blank", element)));
 
 		if (isDisabled(expression, extensionContext)) {
 			String reason = disabledIf.map(DisabledIf::reason).filter(StringUtils::hasText).orElseGet(
