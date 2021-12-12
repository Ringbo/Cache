diff --git a/runelite-mixins/src/main/java/net/runelite/mixins/RSClientMixin.java b/runelite-mixins/src/main/java/net/runelite/mixins/RSClientMixin.java
index f19c039..5dea999 100644
--- a/runelite-mixins/src/main/java/net/runelite/mixins/RSClientMixin.java
+++ b/runelite-mixins/src/main/java/net/runelite/mixins/RSClientMixin.java
@@ -881,7 +881,7 @@
 	@Override
 	public boolean hasHintArrow()
 	{
-		return client.getHintArrowTargetType() == HintArrowType.NONE.getValue();
+		return client.getHintArrowTargetType() != HintArrowType.NONE.getValue();
 	}
 
 	@Inject
