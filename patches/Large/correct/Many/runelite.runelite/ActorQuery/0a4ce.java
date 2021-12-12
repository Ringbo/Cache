diff --git a/runelite-api/src/main/java/net/runelite/api/queries/ActorQuery.java b/runelite-api/src/main/java/net/runelite/api/queries/ActorQuery.java
index 79f78ea..1501f24 100644
--- a/runelite-api/src/main/java/net/runelite/api/queries/ActorQuery.java
+++ b/runelite-api/src/main/java/net/runelite/api/queries/ActorQuery.java
@@ -91,7 +91,7 @@
 	@SuppressWarnings("unchecked")
 	public QueryType isInteractingWith(Actor actor)
 	{
-		predicate = and(a -> a.getInteracting().equals(a));
+		predicate = and(a -> a.getInteracting().equals(actor));
 		return (QueryType) this;
 	}
 
